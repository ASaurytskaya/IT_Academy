package home_work_5.runner;

import home_work_5.comparators.IntegerComparator;
import home_work_5.container.DataContainer;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<Integer> ar = new DataContainer<>(new Integer[0]);
        int index0 = ar.add(1);
        int index1 = ar.add(8);
        int index2 = ar.add(3);

        System.out.println("indexes: " + index0 + " " + index1 + " " + index2);
        System.out.println("numbers: " + ar.get(0) + " " +  ar.get(1) + " " +  ar.get(2));
        System.out.println("number with index 8: " + ar.get(8));
        System.out.println("number with index 2: " + ar.get(2));
        System.out.println();

        DataContainer.sort(ar);
        System.out.println("sorted: " + ar);

        ar.add(0);
        DataContainer.sort(ar, new IntegerComparator<>());
        System.out.println("added 0, then sorted: " + ar);

        ar.add(null);
        ar.add(5);
        ar.sort(new IntegerComparator<>());
        System.out.println("added null, added 5, then sorted: " + ar);
        System.out.println("print all elements: " + ar.get(0) + " " +  ar.get(1) + " " +  ar.get(2)+ " " +
                            ar.get(3) + " " +  ar.get(4) + " " +  ar.get(5));
        System.out.println();

        System.out.println(ar.delete(0));
        System.out.println(ar.delete(5));
        System.out.println("deleted number with index 0, then with index 5: " + ar);
        System.out.println();

        System.out.println(ar.delete(Integer.valueOf(3)));
        System.out.println(ar.delete(Integer.valueOf(2)));
        System.out.println("deleted number 3, then number 2: " + ar);

    }
}
