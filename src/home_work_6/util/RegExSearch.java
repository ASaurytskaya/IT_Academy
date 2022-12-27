package home_work_6.util;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private static final String wordDelimiterPattern = "([!\"#$%&'()*+,./:;<=>?@\\[\\]^_`{|}~])|(-\\s)|(\\s-)|(\\s)";


    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile(String.format(" %s ", word));
        String text2 = splitIntoWords(text);
        Matcher matcher = pattern.matcher(text2);
        long count = 0;

        boolean isMatch;
        do {
            isMatch = matcher.find();
            if(isMatch) {
                    count++;
            }
        } while(isMatch);

        return count;
    }

    private String splitIntoWords(String text) {
        StringBuilder builder = new StringBuilder(" ");
        for(String word : text.split(wordDelimiterPattern)) {
            if(!word.isEmpty()) {
                builder.append(word).append(" ");
            }
        }
        return builder.toString();
    }
}
