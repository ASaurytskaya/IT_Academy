package home_work_1;

public class Main8 {
    public static void main(String[] args) {
        byte a = 15;
        byte b = -15;
        byte c = 42;
        byte d = -42;
        System.out.println(toBinaryString(a)); //00001111
        System.out.println(toBinaryString(b)); //11110001
        System.out.println(toBinaryString(c)); //00101010
        System.out.println(toBinaryString(d)); //11010110
    }

    public static String toBinaryString(byte number) {
        String result = "";
        int mod;
        if(number == 0) {
            return "00000000";
        } else if(number > 0) {
            mod = number;
        } else {
            mod = ~number;
        }
        while(mod > 0) {
            int modulo = mod % 2;
            result = modulo + result;
            mod = mod / 2;
        }
        while(result.length() < 8) {
            result = 0 + result;
        }
        if(number < 0){
            String resultForNegative = "";
            for(int i = 0; i < 8; i++) {
                if(result.charAt(i) == '0') {
                    resultForNegative += 1;
                } else {
                    resultForNegative += 0;
                }
            }
            return resultForNegative;
        }
        return result;
    }
}