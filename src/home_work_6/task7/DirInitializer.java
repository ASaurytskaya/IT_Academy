package home_work_6.task7;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;

public class DirInitializer {
    private File dir;
    private List<File> allFiles;
    private List<String> allFilesNames;

    public DirInitializer() {
        this.setDirectory();
        this.setFilesLists();
    }

    private void setDirectory(){
        String s;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
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

        } catch(IOException e) {
            System.out.println("Ошибка при вводе адреса директории." + e.getMessage());
        }
    }

    private void setFilesLists() {
        if( this.dir != null && this.dir.isDirectory()) {
            for(File f : Objects.requireNonNull(dir.listFiles())) {
                if(f.getPath().endsWith(".txt")) {
                    allFiles.add(f);
                    allFilesNames.add(f.getName());
                }
            }
        }
    }

    public FileAnalyser chooseFile() {
        this.printAllTxtFiles();

        String s;
        File file = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Выберите файл для работы (введите имя файла): ");
            s = reader.readLine();
            while(!allFilesNames.contains(s)) {
                System.out.println("Неверно указано имя файла. Введите имя файла: ");
                s = reader.readLine();
            }
            file = new File(dir.getAbsolutePath() + s);
        } catch(IOException e) {
            System.out.println("Ошибка при выборе файла." + e.getMessage());
        }

        return new FileAnalyser(file);
    }

    public void printAllTxtFiles() {
        if( this.dir != null && this.dir.isDirectory()) {
            for(String name : allFilesNames) {
                if(name.endsWith(".txt")) {
                    System.out.println(name);
                }
            }
        }
    }

}
