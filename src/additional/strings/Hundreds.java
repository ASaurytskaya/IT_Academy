package additional.strings;

public enum Hundreds {
    ONE("сто"),
    TWO("двести"),
    THREE("триста"),
    FOUR("четыреста"),
    FIVE("пятьсот"),
    SIX("шестьсот"),
    SEVEN("семьсот"),
    EIGHT("восемьсот"),
    NINE("девятьсот");

    private String code;
    Hundreds(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
