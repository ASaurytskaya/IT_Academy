package home_work_6.util;

import home_work_6.api.ISearchEngine;
import home_work_6.api.ISearchEngineIgnoreCase;
import home_work_6.api.ISearchEnginePunctuationNormalizer;

public class EasySearch implements ISearchEngine, ISearchEngineIgnoreCase, ISearchEnginePunctuationNormalizer {
    @Override
    public long search(String text, String word) {
        int count = 0;
        int index = 0;
        int textLength = text.length();
        int wordLength = word.length();
        do{
            int previousIndex = index;
            if(previousIndex == 0 && count == 0) {
                index = text.indexOf(word);
            } else {
                index = text.indexOf(word, previousIndex + wordLength);
            }

            if(index > -1) {
                if(index == 0) {
                    if(index == textLength - wordLength) {
                        return 1;
                    }
                    if(isWordDelimiter(text.charAt(index + wordLength))) {
                        if(isHyphen(text, wordLength, index)) {
                            continue;
                        }
                        count++;
                    }
                } else if(isWordDelimiter(text.charAt(index - 1))) {
                    if((text.charAt(index - 1) == '-')
                            && (index > 1)
                            && (!isWordDelimiter(text.charAt(index -2)))) {
                        continue;
                    }
                    if(index == textLength - wordLength) {
                        return ++count;
                    }
                    if(isWordDelimiter(text.charAt(index + wordLength))) {
                        if(isHyphen(text, wordLength, index)){
                            continue;
                        }
                        count++;
                    }
                }
            }
        } while(index > -1);
        return count;
    }

    private boolean isWordDelimiter(char character) {
        return (character <= 0x007E && character >= 0x007B) || (character <= 0x0060 && character >= 0x005B) ||
               (character <= 0x0040 && character >= 0x003A) || (character <= 0x002F && character >= 0x0001);
    }

    private boolean isHyphen(String text, int wordLength, int index ) {
        int nextIndex = index + wordLength;
        if(index == 0) {
            return (text.charAt(nextIndex) == '-')
                    && (index < text.length() - 1 - wordLength)
                    && (!isWordDelimiter(text.charAt(nextIndex + 1)));
        }

        return (text.charAt(nextIndex) == '-')
                && (index < text.length() - 1 - wordLength - 1)
                && (!isWordDelimiter(text.charAt(nextIndex + 1)));
    }

    @Override
    public String normalize(String text) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < text.length();) {
            if(isWordDelimiter(text.charAt(i)) || !isHyphen(text,  0, i)) {
                int count = 1;
                while(isWordDelimiter(text.charAt(i + count)) || !isHyphen(text,  0, i + count)) {
                    count++;
                }
                i += count;
            } else {
                builder.append(text.charAt(i)).append(" ");
                i++;
            }
        }
        return builder.toString().trim();
    }

    @Override
    public long searchIgnoreCase(String text, String word) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 0x0410 && ch <= 0x042F) {
                ch += 32;
            } else if(ch == 0x0401) {
                ch = 0x0451;
            }
            builder.append(ch);
        }
        return search(builder.toString(), word);
    }
}
