package home_work_5.comparators;

import java.util.Comparator;

public class NumberComparator<T extends Number> implements Comparator<T> {
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
        int result = 0;
        if(o1.doubleValue() - o2.doubleValue() > 0) {
            result++;
        } else if(o1.doubleValue() - o2.doubleValue() < 0) {
            result--;
        }
        if(o1.longValue() - o2.longValue() > 0) {
            result++;
        } else if(o1.longValue() - o2.longValue() < 0) {
            result--;
        }
        return Integer.compare(result, 0);
    }
}
