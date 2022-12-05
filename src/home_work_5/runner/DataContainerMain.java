package home_work_5.runner;

import home_work_5.DataContainer;
import home_work_5.comparators.NumberComparator;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> ar = new DataContainer<>(new Integer[0]);
        int index0 = ar.add(1);
        int index1 = ar.add(8);
        int index2 = ar.add(3);

        System.out.println("indexes: " + index0 + " " + index1 + " " + index2);
        System.out.println("numbers: " + ar.get(0) + " " +  ar.get(1) + " " +  ar.get(2));
        System.out.println(ar.get(8));
        System.out.println(ar.getLength() + " " + ar.getCountElements());
        System.out.println("");

        ar.add(null);
        ar.sort(new NumberComparator<>());
        System.out.println("numbers: " + ar.get(0) + " " +  ar.get(1) + " " +  ar.get(2) + " " +  ar.get(3));
        System.out.println(ar.toString());


/*
        System.out.println(ar.delete(1));
        System.out.println("numbers: " + ar.get(0) + " " +  ar.get(1) + " " +  ar.get(2));
        System.out.println(ar.delete(2));
        System.out.println(ar.getLength() + " " + ar.getCountElements());
        System.out.println("");

        System.out.println(ar.delete(Integer.valueOf(3)));
        System.out.println("numbers: " + ar.get(0) + " " +  ar.get(1) + " " +  ar.get(2));
        System.out.println(ar.delete(Integer.valueOf(2)));
        System.out.println(ar.getLength() + " " + ar.getCountElements());
        System.out.println("");
*/



    }
}
