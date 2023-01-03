package home_work_6.task7;

import home_work_6.tasks1_2.TextAnalyzer;
import home_work_6.tasks3_6.api.ISearchEngine;
import home_work_6.tasks3_6.util.RegExSearch;

import java.io.*;

public class FileAnalyser {
    DirInitializer dirInitializer;
    private final File file;
    private final ISearchEngine engine;
    private final String text;

    public FileAnalyser(File file) {
        this.file = file;
        this.text = TextAnalyzer.getTextString(file.getAbsolutePath());
        this.engine = new RegExSearch();
    }

    private String readWordFromConsole() {
        String s = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String choice = null;
            while(choice == null) {
                System.out.println("Для выбора другого файла введите \"RETURN\".\nДля поиска слов в этом файле введите \"SEARCH\"");
                choice = reader.readLine();
                switch (choice) {
                    case "RETURN": {
                        return null;
                    }
                    case "SEARCH": {
                        continue;
                    }
                    default: {
                        choice = null;
                        break;
                    }
                }
            }

            while(s == null) {
                System.out.println("Введите слово для поиска: ");
                s = reader.readLine();
            }
        } catch(IOException e) {
            System.out.println("Ошибка при выборе слова для поиска." + e.getMessage());
        }

        return s;
    }

    public String searchInFile() {
        String word = readWordFromConsole();
        long count = engine.search(text, word);
        String tmp = String.format("%s - %s - %d", file.getName(), word, count);
        writeToResultFile(tmp);
        return tmp;
    }

    private void writeToResultFile(String s) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file.getParent() + "result.txt", true))) {
            writer.write(s + "\n");
        } catch(IOException e) {
            System.out.println("Ошибка во время записи в файл \"result.txt\".");
        }
    }
}
