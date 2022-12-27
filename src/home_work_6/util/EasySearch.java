package home_work_6.util;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        int count = 0;
        int index = 0;
        do{
            int previousIndex = index;
            if(previousIndex == 0 && count == 0) {
                index = text.indexOf(word);
            } else {
                index = text.indexOf(word, previousIndex + word.length());
            }

            int lastIndex = text.length() - 1;
            if(index > -1) {
                if(index == 0) {
                    if(index == text.length() - word.length()) {
                        return 1;
                    }
                    if(isWordDelimiter(text.charAt(index + word.length()))) {
                        if(text.charAt(index + word.length()) == '-') {
                            if(index < lastIndex - word.length()) {
                                if(!isWordDelimiter(text.charAt(index + word.length() + 1))) {
                                    continue;
                                }
                            }
                        }
                        count++;
                    }
                } else if(isWordDelimiter(text.charAt(index - 1))) {
                    if(text.charAt(index - 1) == '-') {
                        if(index > 1) {
                            if(!isWordDelimiter(text.charAt(index -2))) {
                                continue;
                            }
                        }
                    }
                    if(index == text.length() - word.length()) {
                        return ++count;
                    }
                    if(isWordDelimiter(text.charAt(index + word.length()))) {
                        if(text.charAt(index + word.length()) == '-') {
                            if(index < lastIndex - word.length() - 1) {
                                if(!isWordDelimiter(text.charAt(index + word.length() + 1))) {
                                    continue;
                                }
                            }
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
}
