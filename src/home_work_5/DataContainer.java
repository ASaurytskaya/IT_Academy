package home_work_5;

import java.util.*;

public class DataContainer<T> {
    private T[] data;
    private int countElements = 0;

    public DataContainer(T[] ar) {
        this.data = ar;
    }

    public int add(T item) {
        if(data.length == 0) {
            T[] tmp = Arrays.copyOf(data, 2);
            data = tmp;
        }
        if(countElements == data.length) {
            data = Arrays.copyOf(data, data.length + 1);
        }
        data[countElements] = item;
        return this.countElements++;
    }

    public T get(int index) {
        if(index >= countElements)  {
            return null;
        }
        return data[index];
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        if(index >= countElements)  {
            return false;
        }
        if (data.length - 1 - index >= 0) {
            System.arraycopy(data, index + 1, data, index, data.length - 1 - index);
        }
        data = Arrays.copyOf((data), data.length - 1);
        countElements--;
        return true;

    }

    public boolean delete(T item) {
        if(item == null) {
            return  false;
        }
        int index = -1;
        for(int i = 0; i < data.length; i++) {
            if(Objects.equals(item, data[i])) {
                index = i;
            }
        }
        if(index < 0) {
            return false;
        }
        return this.delete(index);
    }

    //
    public int getLength() {
        return data.length;
    }
    //
    public int getCountElements() {
        return countElements;
    }

    public void sort(Comparator<T> comparator) {
        for(int i = 0; i < data.length - 1; i++) {
            for(int j = data.length - 1; j > i; j--) {
                if(comparator.compare(data[j], data[j-1]) < 0) {
                    T tmp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = tmp;
                }
            }
        }
    }

    public String toString() {
        String start = "[";
        String end = "]";
        String result = "";
        for(int i = 0; i < data.length; i++) {
            if(data[i] == null) {
                continue;
            }
            result += data[i].toString();
            if(i < data.length - 1) {
                result += ", ";
            }
        }

        return "[" + result + "]";
    }
}
