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

        System.out.println(toString(-99999.9999));
        System.out.println(toString(10000.08 ));
        System.out.println(toString(2.00));
        System.out.println(toString(2000.14));
        System.out.println(toString(13000.34));

        System.out.println(toWeek(0));
        System.out.println(toWeek(10));
        System.out.println(toWeek(15));
        System.out.println(toWeek(177));
        System.out.println(toWeek(366));

        System.out.println(toHoursMinuteSecondMillisecond(7789001, false));
        System.out.println(toHoursMinuteSecondMillisecond(7789001, true));
        System.out.println(toHoursMinuteSecondMillisecond(9223372036854775807L, false));
        System.out.println(toHoursMinuteSecondMillisecond(9223372036854775807L, true));
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

    public static String toString(double number) {
        String result = "";

        result += toString((int) number);
        String[] subs = result.split(" ");
        if(subs[subs.length-1].matches("один")) {
            result = result.substring(0, result.length() - 5);
            result += "одна целая ";
        } else if(subs[subs.length-1].matches("два")) {
            result = result.substring(0, result.length() - 4);
            result += "две целых ";
        } else {
            result += "целых ";
        }


        String num = "" + Math.abs(number);
        String[] substr = num.split("\\.", 2);
        char[] set = substr[1].toCharArray();
        if(set.length == 1 && set[0] == '0') {
            result += "ноль сотых";
            return result;
        }
        switch(set[0]){
            case '1':
                switch(set[1]){
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
        if(set[0] != '1') {
            switch(set[1]){
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
        if(set[0] != '1') {
            if(set[1] == '1') {
                result = result.substring(0, result.length() - 5);
                result += "одна сотая";
            } else if(set[1] == '2' || set[1] == '3' || set[1] == '4') {
                result += "сотые";
            } else {
                result += "сотых";
            }
        } else {
            result += "сотых";
        }
        return result;
    }

    public static String toWeek(int day) {
        int weeks = day / 7;
        String result = "" + weeks;
        if(result.matches("[0-9]+1[0-9]") || result.matches("1[0-9]")) {
            result += " недель";
        } else if(result.matches("[0-9]+1") || result.matches("1")) {
            result += " неделя";
        } else if(result.matches("[0-9]+[2-4]") || result.matches("[2-4]")) {
            result += " недели";
        } else {
            result += " недель";
        }

        return result;
    }

    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        long hours = (millisecond / (60 * 60 * 1000));
        int minutes = (int) ((millisecond % (60 * 60 * 1000)) / (60 * 1000));
        int seconds = (int) (((millisecond % (60 * 60 * 1000)) % (60 * 1000)) / 1000);
        int milliseconds = (int) (((millisecond % (60 * 60 * 1000)) % (60 * 1000)) % 1000);

        String result = String.format("%2d:%2d:%2d.%3d", hours, minutes, seconds, milliseconds);
        result = result.replaceAll(" ", "0");

        if(shortFormat) {
            return result;
        }

        String resultLong = "";
        String[] subs = result.split("[:.]");
        if(subs[0].matches("[0-9]+1[0-9]") || subs[0].matches("1[0-9]")) {
            resultLong += hours + " часов ";
        } else if(subs[0].matches("[0-9]+1") || subs[0].matches("1")) {
            resultLong += hours + " час ";
        } else if(subs[0].matches("[0-9]+[2-4]") || subs[0].matches("[2-4]")) {
            resultLong += hours + " часа ";
        } else {
            resultLong += hours + " часов ";
        }

        if(subs[1].matches("[0-9]+1[0-9]") || subs[1].matches("1[0-9]")) {
            resultLong += minutes + " минут ";
        } else if(subs[1].matches("[0-9]+1") || subs[1].matches("1")) {
            resultLong += minutes + " минута ";
        } else if(subs[1].matches("[0-9]+[2-4]") || subs[1].matches("[2-4]")) {
            resultLong += minutes + " минуты ";
        } else {
            resultLong += minutes + " минут ";
        }

        if(subs[2].matches("[0-9]+1[0-9]") || subs[2].matches("1[0-9]")) {
            resultLong += seconds + " секунд ";
        } else if(subs[2].matches("[0-9]+1") || subs[2].matches("1")) {
            resultLong += seconds + " секунда ";
        } else if(subs[2].matches("[0-9]+[2-4]") || subs[2].matches("[2-4]")) {
            resultLong += seconds + " секунды ";
        } else {
            resultLong += seconds + " секунд ";
        }

        if(subs[3].matches("[0-9]+1[0-9]") || subs[3].matches("1[0-9]")) {
            resultLong += milliseconds + " миллисекунд ";
        } else if(subs[3].matches("[0-9]+1") || subs[3].matches("1")) {
            resultLong += milliseconds + " миллисекунда ";
        } else if(subs[3].matches("[0-9]+[2-4]") || subs[3].matches("[2-4]")) {
            resultLong += milliseconds + " миллисекунды ";
        } else {
            resultLong += milliseconds + " миллисекунд ";
        }

        return resultLong;
    }
}



