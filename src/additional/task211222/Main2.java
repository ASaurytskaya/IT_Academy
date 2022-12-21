package additional.task211222;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        FileSearcher searcher = new FileSearcher();
        String str = scanner.nextLine();
        searcher.getFiles(str);
        System.out.println(searcher.getStat());
    }
}
