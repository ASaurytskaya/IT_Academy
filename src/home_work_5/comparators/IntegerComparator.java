package home_work_5.comparators;

import java.util.Comparator;

public class IntegerComparator<T extends Integer> implements Comparator<T> {
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
        return o1.intValue() - o2.intValue();
    }
}
