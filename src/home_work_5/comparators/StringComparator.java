package home_work_5.comparators;

import java.util.Comparator;

public class StringComparator <T extends Number> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if(o1 == null && o2 == null) {
            return 0;
        }
        if(o1 != null && o2 == null) {
            return 1;
        }
        if(o1 == null && o2 != null) {
            return -1;
        }
        int i = o1.toString().length() - o2.toString().length();
        if(i > 0) {
            return 1;
        } else if(i < 0) {
            return -1;
        }
        return 0;
    }
}
