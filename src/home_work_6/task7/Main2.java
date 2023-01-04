package home_work_6.task7;

import java.io.*;


public class Main2 {
    public static void main(String[] args) {
        runSearch();
    }

    public static void runSearch() {
        try{
            DirInitializer dirInitializer = new DirInitializer();
            dirInitializer.startSearch();
        } catch(IOException e) {
            System.out.println("Ошибка во время чтения с консоли." + e.getMessage());
        }

    }
}


