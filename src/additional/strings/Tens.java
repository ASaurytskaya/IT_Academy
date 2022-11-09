package additional.strings;

public enum Tens  {
    ZERO("десять"),
    ONE("одиннадцать"),
    TWO("двенадцать"),
    THREE("тринадцать"),
    FOUR("четырнадцать"),
    FIVE("пятнадцать"),
    SIX("шестнадцать"),
    SEVEN("семнадцать"),
    EIGHT("восемнадцать"),
    NINE("девятнадцать");

    private String code;
    Tens(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
