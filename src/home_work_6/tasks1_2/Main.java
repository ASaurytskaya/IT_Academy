package home_work_6.tasks1_2;

import home_work_6.tasks3_6.api.ISearchEngine;
import home_work_6.tasks3_6.api.ISearchEngineIgnoreCase;
import home_work_6.tasks3_6.util.EasySearch;
import home_work_6.tasks3_6.util.RegExSearch;

public class Main {
    public static void main(String[] args) {

        String s1 = TextAnalyzer.getTextString("Война и мир_книга.txt");
        String s2 = TextAnalyzer.getTextString("hello.txt");

        System.out.println("Всего уникальных слов: " + TextAnalyzer.countAllUniqueWords(s1));
        TextAnalyzer.printMostFrequentlyUsedWords(s1, 10);

        ISearchEngine engine1 = new EasySearch();
        System.out.println("Слово \"война\" встречается в тексте " + engine1.search(s1, "война") + " раз.");
        System.out.println("Слово \"и\" встречается в тексте " + engine1.search(s1, "и") + " раз.");
        System.out.println("Слово \"мир\" встречается в тексте " + engine1.search(s1, "мир") + " раз." );

        ISearchEngineIgnoreCase engine11 = new EasySearch();
        System.out.println("Слово \"война\" без учета регистра встречается в тексте " + engine11.searchIgnoreCase(s1, "война") + " раз.");
        System.out.println("Слово \"и\" без учета регистра встречается в тексте " + engine11.searchIgnoreCase(s1, "и") + " раз.");
        System.out.println("Слово \"мир\" без учета регистра встречается в тексте " + engine11.searchIgnoreCase(s1, "мир") + " раз." );



        ISearchEngine engine2 = new RegExSearch();
        System.out.println("Слово \"война\" встречается в тексте " + engine2.search(s1, "война") + " раз.");
        System.out.println("Слово \"и\" встречается в тексте " + engine2.search(s1, "и") + " раз.");
        System.out.println("Слово \"мир\" встречается в тексте " + engine2.search(s1, "мир") + " раз." );

        ISearchEngineIgnoreCase engine21 = new EasySearch();
        System.out.println("Слово \"война\" без учета регистра встречается в тексте " + engine21.searchIgnoreCase(s1, "война") + " раз.");
        System.out.println("Слово \"и\" без учета регистра встречается в тексте " + engine21.searchIgnoreCase(s1, "и") + " раз.");
        System.out.println("Слово \"мир\" без учета регистра встречается в тексте " + engine21.searchIgnoreCase(s1, "мир") + " раз." );


    }
}
