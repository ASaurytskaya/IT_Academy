package home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.util.EasySearch;
import home_work_6.util.RegExSearch;

public class Main {
    public static void main(String[] args) {
        /*
        String s1 = TextAnalyzer.getTextString("Война и мир_книга.txt");
        String s2 = TextAnalyzer.getTextString("hello.txt");

        System.out.println("Всего уникальных слов: " + TextAnalyzer.countAllUniqueWords(s1));
        TextAnalyzer.printMostFrequentlyUsedWords(s1, 100);


 */
        ISearchEngine engine1 = new EasySearch();
        engine1.search("один и 1", "1");
        System.out.println(engine1.search("Мама мыла раму, папа мыл окно", "мыл"));
        System.out.println(engine1.search("Мыл мыл мылмыл мыл-мыл помыл Мама мыла раму, папа мыл окно.", "мыл"));

        ISearchEngine engine2 = new RegExSearch();
        System.out.println(engine2.search("Мама мыла раму, папа мыл окно", "мыл"));
        System.out.println(engine2.search("Мыл мыл мылмыл мыл-мыл помыл Мама мыла раму, папа мыл окно.", "мыл"));
    }
}
