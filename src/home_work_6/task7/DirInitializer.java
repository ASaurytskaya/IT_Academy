package home_work_6.task7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DirInitializer {
    private File dir;
    private List<File> allFiles = new ArrayList<>();
    private List<String> allFilesNames = new ArrayList<>();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public DirInitializer() throws IOException {
        this.setDirectory();
        this.setFilesLists();
    }

    private void setDirectory() throws IOException {
        String s;
            do{
                System.out.println("Введите полный путь к директории: ");
                s = reader.readLine();
                while(s.isEmpty() || s.isBlank()) {
                    System.out.println("Неверно указан путь. Введите полный путь к директории: ");
                    s = reader.readLine();
                }
                dir = new File(s);
                if(!dir.exists()) {
                    System.out.println("По указанному адресу директории не существует.");
                    dir = null;
                    continue;
                }
                if(!dir.isDirectory()) {
                    System.out.println("По указанному адресу расположен файл, директории не существует.");
                    dir = null;
                }
            } while(dir == null);
    }

    private void setFilesLists() {
        if( this.dir != null && this.dir.isDirectory()) {
            for(File f : Objects.requireNonNull(dir.listFiles())) {
                if(f.getPath().endsWith(".txt")) {
                    if(f.getPath().endsWith("result.txt")) {
                        continue;
                    }
                    allFiles.add(f);
                    allFilesNames.add(f.getName());
                }
            }
        }
    }

    public void startSearch() throws IOException {
        try(FileWriter writer = new FileWriter(dir.getAbsolutePath() + "/" + "result.txt", false)) {
            writer.write("");
        } catch(IOException e) {
            System.out.println("Ошибка во время обновления файла \"result.txt\".");
        }

        File file;
        do {
             file = this.chooseFile();
            if(file != null) {
                FileAnalyser fileAnalyser = new FileAnalyser(file);
                String result;
                do{
                    result = fileAnalyser.searchInFile();
                    if(result != null) {
                        System.out.println(result);
                    }
                } while(result != null);
            }
        } while(file != null);
    }

    private File chooseFile() throws IOException {
        String s;
        File file = null;
            String choice = null;
            while(choice == null) {
                System.out.println("Для выходы из программы введите \"EXIT\". Для выбора файла введите \"CONTINUE\"");
                choice = reader.readLine();
                if(choice.equals("CONTINUE")) {
                    this.printAllTxtFiles();
                    System.out.println("Выберите файл для работы (введите имя файла): ");
                    s = reader.readLine();
                    while(!allFilesNames.contains(s)) {
                        System.out.println("Неверно указано имя файла. Введите имя файла: ");
                        s = reader.readLine();
                    }
                    file = new File(dir.getAbsolutePath()+ "/" + s);
                } else if(choice.equals("EXIT")) {
                    return null;
                } else {
                    choice = null;
                }
            }

        return file;
    }

    private void printAllTxtFiles() {
        if( this.dir != null && this.dir.isDirectory()) {
            for(String name : allFilesNames) {
                if(name.endsWith(".txt")) {
                    System.out.println(name);
                }
            }
        }
    }
}
