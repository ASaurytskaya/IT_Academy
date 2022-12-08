package home_work_5.container;

import java.util.*;

public class DataContainer<T> implements Iterable{
    private T[] data;
    private int countElements = 0;

    public DataContainer(T[] ar) {
        this.data = ar;
    }

    public int add(T item) {
        if(data.length == 0) {
            data = Arrays.copyOf(data, 2);
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

    public static void sort(DataContainer<? extends Comparable> container) {
        container.sort(Comparator.naturalOrder());
    }

    public static void sort(DataContainer<? extends Comparable> container, Comparator comparator) {
        container.sort(comparator);
    }

    public String toString() {
        String result = "";
        int count = 0;
        for(T element : data) {
            count++;
            if(element == null) {
                continue;
            }
            result += element.toString();
            if(count == data.length) {
                break;
            }
            result += ", ";
        }

        return "[" + result + "]";
    }

    @Override
    public Iterator iterator() {
        return new DataIterator();
    }

    private class DataIterator implements Iterator {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < data.length;
        }

        @Override
        public T next() {
            int i = cursor;
            if (i >= data.length) {
               throw new NoSuchElementException();
            }
            cursor = i + 1;
            return data[i];
        }
    }
}
