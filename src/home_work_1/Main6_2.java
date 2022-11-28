package home_work_1;

public class Main6_2 implements ICommunicationPrinter {

    @Override
    public String welcom(String name) {
        if("Вася".equals(name)) {
            return "Привет!\nЯ тебя так долго ждал.";
        } else if("Анастасия".equals(name)) {
            return "Я тебя так долго ждал.";
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}
