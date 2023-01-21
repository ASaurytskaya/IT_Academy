package home_work_7;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileSearch search = new FileSearch();
        try {
            search.setDirectory();
            byte c;
            do{
                c = search.searchWord();
            } while(c > 0);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

