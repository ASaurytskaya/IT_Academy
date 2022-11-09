package additional.strings;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(toString(-999_999_999));
        System.out.println(toString(10000));
        System.out.println(toString(1));
        System.out.println(toString(2000));
        System.out.println(toString(13000));
        System.out.println(toString(1000));
        System.out.println(toString(11000000));
        
    }

    public static String toString(int number) {
        if(number == 0) {
            return "ноль";
        }
        String result = "";
        if(number < 0) {
            result += "минус ";
        }

        String num = "" + Math.abs(number);
        while(num.length() < 9) {
            num = " " + num;
        }
        char[] set = num.toCharArray();
        int counter1 = 0, counter2 = 0;
        while(counter1 < 3) {
            while(counter2 < 3) {
                if(counter2 == 0) {
                    switch(set[counter1 * 3]){
                        case '1':
                            result += Hundreds.ONE.getCode() + " ";
                            break;
                        case '2':
                            result += Hundreds.TWO.getCode() + " ";
                            break;
                        case '3':
                            result += Hundreds.THREE.getCode() + " ";
                            break;
                        case '4':
                            result += Hundreds.FOUR.getCode() + " ";
                            break;
                        case '5':
                            result += Hundreds.FIVE.getCode() + " ";
                            break;
                        case '6':
                            result += Hundreds.SIX.getCode() + " ";
                            break;
                        case '7':
                            result += Hundreds.SEVEN.getCode() + " ";
                            break;
                        case '8':
                            result += Hundreds.EIGHT.getCode() + " ";
                            break;
                        case '9':
                            result += Hundreds.NINE.getCode() + " ";
                            break;
                    }
                }
                if(counter2 == 1) {
                    switch(set[counter1 * 3 + 1]){
                        case '1':
                            switch(set[counter1 * 3 + 2]){
                                case '0':
                                    result += Tens.ZERO.getCode() + " ";
                                    break;
                                case'1':
                                    result += Tens.ONE.getCode() + " ";
                                    break;
                                case '2':
                                    result += Tens.TWO.getCode() + " ";
                                    break;
                                case '3':
                                    result += Tens.THREE.getCode() + " ";
                                    break;
                                case '4':
                                    result += Tens.FOUR.getCode() + " ";
                                    break;
                                case '5':
                                    result += Tens.FIVE.getCode() + " ";
                                    break;
                                case '6':
                                    result += Tens.SIX.getCode() + " ";
                                    break;
                                case '7':
                                    result += Tens.SEVEN.getCode() + " ";
                                    break;
                                case '8':
                                    result += Tens.EIGHT.getCode() + " ";
                                    break;
                                case '9':
                                    result += Tens.NINE.getCode() + " ";
                                    break;
                                }
                            counter2 = 4;
                            break;
                        case '2':
                            result += Dozens.TWO.getCode() + " ";
                            break;
                        case '3':
                            result += Dozens.THREE.getCode() + " ";
                            break;
                        case '4':
                            result += Dozens.FOUR.getCode() + " ";
                            break;
                        case '5':
                            result += Dozens.FIVE.getCode() + " ";
                            break;
                        case '6':
                            result += Dozens.SIX.getCode() + " ";
                            break;
                        case '7':
                            result += Dozens.SEVEN.getCode() + " ";
                            break;
                        case '8':
                            result += Dozens.EIGHT.getCode() + " ";
                            break;
                        case '9':
                            result += Dozens.NINE.getCode() + " ";
                            break;
                    }
                }
                if(counter2 == 2) {
                    switch(set[counter1 * 3 + 2]){
                        case '1':
                            result += Ones.ONE.getCode() + " ";
                            break;
                        case '2':
                            result += Ones.TWO.getCode() + " ";
                            break;
                        case '3':
                            result += Ones.THREE.getCode() + " ";
                            break;
                        case '4':
                            result += Ones.FOUR.getCode() + " ";
                            break;
                        case '5':
                            result += Ones.FIVE.getCode() + " ";
                            break;
                        case '6':
                            result += Ones.SIX.getCode() + " ";
                            break;
                        case '7':
                            result += Ones.SEVEN.getCode() + " ";
                            break;
                        case '8':
                            result += Ones.EIGHT.getCode() + " ";
                            break;
                        case '9':
                            result += Ones.NINE.getCode() + " ";
                            break;
                    }
                }
                counter2++;

            }
            if(counter1 == 0 && Math.abs(number) > 999_999) {
                if(set[1] != '1' && set[2] == '1') {
                    result += "миллион ";
                    break;
                }
                if( set[1] != '1' && (set[2] == '2' || set[2] == '3' || set[2] == '4')) {
                    result += "миллиона ";
                    break;
                }
                result += "миллионов ";
            }
            if(counter1 == 1 && Math.abs(number) > 999) {
                if(set[3] == '0' && set[4] == '0' && set[5] == '0') {
                    break;
                }
                if( set[4] != '1' && set[5] == '1') {
                    result = result.substring(0,result.length() - 5);
                    result += "одна тысяча ";
                    break;
                }
                if(set[4] != '1' && set[5] == '2') {
                    result = result.substring(0,result.length() - 4);
                    result += "две тысячи ";
                    break;
                }
                if(set[4] != '1' && (set[5] == '3' || set[5] == '4')) {
                    result += "тысячи ";
                    break;
                }
                result += "тысяч ";
            }

            counter1++;
            counter2 = 0;
        }

        return result;
    }
}



