package home_work_7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileSearch {
    private File dir;
    private List<File> allFiles = new ArrayList<>();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void setDirectory() throws IOException {
        do{
            System.out.println("Введите полный путь к директории: ");
            String s = reader.readLine();
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

        setFilesLists();
    }

    private void setFilesLists() {
        if( this.dir != null && this.dir.isDirectory()) {
            for(File f : Objects.requireNonNull(dir.listFiles())) {
                if(f.getPath().endsWith(".txt")) {
                    if(f.getPath().endsWith("result.txt")) {
                        continue;
                    }
                    allFiles.add(f);
                }
            }
        }
    }

    public byte searchWord() throws IOException, ExecutionException, InterruptedException {
        String word = reader.readLine();
        if(word.isEmpty()) {
            reader.close();
            System.out.println("Поиск завершен.");
            return -1;
        }

        ExecutorService executor = Executors.newFixedThreadPool(8);
        for(File file : allFiles) {
            executor.submit(new WordSearch(file, word));
        }
        executor.shutdown();
        System.out.println("Введите следующее слово для поиска:");
        return 1;
    }

}
