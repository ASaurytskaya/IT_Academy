package home_work_1;

public class Main7 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i = 0; i < 10; i++) {
            numbers[i] = 9 - i;
        }
        System.out.println(createPhoneNumber(numbers));
    }

    public static String createPhoneNumber(int[] numbers) {
        String result = String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3],
                                        numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
        return result;
    }
}
