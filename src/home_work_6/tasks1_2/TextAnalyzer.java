package home_work_6.tasks1_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextAnalyzer {
    private static final String wordDelimiterPattern = "([!\"#$%&'()*+,./:;<=>?@\\[\\]^_`{|}~])|(-\\s)|(\\s-)|(\\s)";

    public static String getTextString(String filename) {
        StringBuilder builder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while(reader.ready()) {
                builder.append(reader.readLine()).append("/n");
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error during file reading: " + e.getMessage());
        }
        return builder.toString();
    }

    public static long countAllUniqueWords(String text) {
        return getAllUniqueWords(text).size();
    }

    public static Set<String> getAllUniqueWords(String text) {
        Set<String> set = new HashSet<>();
        for(String word : text.split(wordDelimiterPattern)) {
            if(!word.isEmpty()) {
                set.add(word);
            }
        }
        return set;
    }

    public static void printMostFrequentlyUsedWords(String text, long quantity) {
        List<String> list = getSortedListOfWords(text);
        int length = list.size();
        if(quantity > length) {
            throw new IndexOutOfBoundsException("Указанное количество превышает общее количество слов.");
        }
        for (int i = length - 1; i > length - 1 - quantity; i--) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> getSortedListOfWords(String text) {
        List<String> list = new ArrayList<>();
        Map<String, Long> map = getAllWordsWithCount(text);
        Set<Long> set = new TreeSet<>(map.values());
        for (Long val : set) {
            for(Map.Entry<String, Long> entry : map.entrySet()) {
                if(entry.getValue().equals(val)) {
                    String tmp = String.format("%s - %d раз", entry.getKey(), val);
                    list.add(tmp);
                }
            }
        }
        return list;
    }

   public static Map<String, Long> getAllWordsWithCount(String text) {
        Map<String, Long> wordsWithCount = new HashMap<>();
        for(String word : text.split(wordDelimiterPattern)) {
            if(word.isEmpty()) {
                continue;
            }
            if(wordsWithCount.putIfAbsent(word, 1L) != null) {
                wordsWithCount.put(word, (wordsWithCount.get(word)+1));
            }
        }
        return wordsWithCount;
   }








}
