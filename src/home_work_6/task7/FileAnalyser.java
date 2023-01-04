package home_work_6.task7;

import home_work_6.tasks1_2.TextAnalyzer;
import home_work_6.tasks3_6.api.ISearchEngine;
import home_work_6.tasks3_6.util.RegExSearch;

import java.io.*;

public class FileAnalyser {
    private final File file;
    private final ISearchEngine engine;
    private String text;

    public FileAnalyser(File file) {
        this.file = file;
        this.engine = new RegExSearch();
    }

    public String searchInFile() throws IOException {
        setText();
        String word = readWordFromConsole();
        if(word == null) {
            return null;
        }
        long count = engine.search(text, word);
        String tmp = String.format("%s - %s - %d", file.getName(), word, count);
        writeToResultFile(tmp);
        return tmp;
    }

    private void setText() {
        this.text = TextAnalyzer.getTextString(file.getAbsolutePath());
    }

    private String readWordFromConsole() throws IOException {
        String s = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choice = null;
            while(choice == null) {
                System.out.println("Для выбора другого файла введите \"RETURN\".\nДля поиска слов в этом файле введите \"CONTINUE\"");
                choice = reader.readLine();
                switch (choice) {
                    default: {
                        choice = null;
                        break;
                    }
                    case "RETURN": {
                        return null;
                    }
                    case "CONTINUE": {}
                }
            }

            while(s == null || s.isEmpty()) {
                System.out.println("Введите слово для поиска: ");
                s = reader.readLine();
            }

        return s;
    }

    private void writeToResultFile(String s) {
        try(FileWriter writer = new FileWriter(file.getParent() + "/" + "result.txt", true)) {
            writer.write(s + "\n");
        } catch(IOException e) {
            System.out.println("Ошибка во время записи в файл \"result.txt\".");
        }
    }
}
