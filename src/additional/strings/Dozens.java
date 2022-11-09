package additional.strings;

public enum Dozens {
    TWO("двадцать"),
    THREE("тридцать"),
    FOUR("сорок"),
    FIVE("пятьдесят"),
    SIX("шестьдесят"),
    SEVEN("семьдесят"),
    EIGHT("восемьдесят"),
    NINE("девяносто");

    private String code;
    Dozens(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
