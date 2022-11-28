package home_work_1;

public class Main5 {
    public static void main(String[] args) {
        boolean isWeekday = true;
        boolean isVacation = false;

        if(sleepIn(isWeekday, isVacation)) {
            System.out.println("Можно спать дальше.");
        }
        else {
            System.out.println("Пора идти на работу.");
        }
    }

    public static boolean sleepIn(boolean weekday,  boolean vacation) {
        return !weekday || vacation;
    }
}
