package home_work_1;

public class Main4_1 {
    public static void main(String[] args) {
        int randomNumberOne = 2 * (int) (Math.random()*99999); // генерирует случайное четное число
        int randomNumberTwo = 2 * (int) (Math.random()*99999) + 1; // генерирует случайное нечетное число

        if(isOdd(randomNumberOne)) {
            System.out.println(randomNumberOne);
        } else {
            System.out.println(randomNumberTwo);
        }
    }

    public static boolean isOdd(int a) {
        return a % 2 != 0;
    }
}
