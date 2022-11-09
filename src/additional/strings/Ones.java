package additional.strings;

public enum Ones {
    ONE("один"),
    TWO("два"),
    THREE("три"),
    FOUR("четыре"),
    FIVE("пять"),
    SIX("шесть"),
    SEVEN("семь"),
    EIGHT("восемь"),
    NINE("девять");

    private String code;
    Ones(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
