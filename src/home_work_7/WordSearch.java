package home_work_7;

import home_work_6.tasks1_2.TextAnalyzer;
import home_work_6.tasks3_6.api.ISearchEngine;
import home_work_6.tasks3_6.util.RegExSearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Callable;

public class WordSearch implements Runnable {
    private File file;
    private String word;
    private String text;

    public WordSearch(File file, String word) {
        this.file = file;
        this.word = word;
        this.text = TextAnalyzer.getTextString(file.getAbsolutePath());
    }

    @Override
    public void run() {
        ISearchEngine engine = new RegExSearch();
        long count = engine.search(text, word);
        String tmp = String.format("%s - %s - %d", file.getName(), word, count);
        writeToResultFile(tmp);
    }

    private void writeToResultFile(String s) {
        try(FileWriter writer = new FileWriter(file.getParent() + "/" + "result.txt", true)) {
            writer.write(s + "\n");
        } catch(IOException e) {
            System.out.println("Ошибка во время записи в файл \"result.txt\".");
        }
    }
}
