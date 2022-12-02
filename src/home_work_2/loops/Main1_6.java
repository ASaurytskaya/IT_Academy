package home_work_2.loops;

public class Main1_6 {
    public static void main(String[] args) {
        int startNumber = 2;
        int maxCountColumnsInRow = 4;
        int countColumns = 7;

        printTable(startNumber, maxCountColumnsInRow, countColumns);
    }

    public static void printTable(int startNumber, int maxCountColumnsInRow, int countColumns) {
        int countRows = (int) Math.ceil((double) countColumns / maxCountColumnsInRow);
        System.out.println("Таблица умножения");
        for(int i = 0; i < countRows; i++) {
            int currentTo = startNumber + maxCountColumnsInRow + i * maxCountColumnsInRow - 1;
            int tmp = countColumns - i * maxCountColumnsInRow;
            if(tmp < maxCountColumnsInRow) {
                currentTo = startNumber + i * maxCountColumnsInRow + tmp - 1;
            }
            printRow((startNumber + i * maxCountColumnsInRow), currentTo);
            System.out.println("");
        }
    }

    public static void printRow(int from, int to) {
        for(int i = 1; i <= 10; i++) {
            for(int j = from; j <= to; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t\t");
            }
            System.out.println("");
        }
    }
}
