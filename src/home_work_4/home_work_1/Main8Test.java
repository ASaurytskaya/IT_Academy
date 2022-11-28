package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main8Test {
    @Test
    @DisplayName("+15")
    public void toBinaryString1() {
        Assertions.assertEquals("00001111", home_work_1.Main8.toBinaryString((byte) 15));
    }

    @Test
    @DisplayName("-15")
    public void toBinaryString2() {
        Assertions.assertEquals("11110001", home_work_1.Main8.toBinaryString((byte) -15));
    }

    @Test
    @DisplayName("max byte")
    public void toBinaryString3() {
        Assertions.assertEquals("01111111", home_work_1.Main8.toBinaryString((byte) 127));
    }

    @Test
    @DisplayName("min byte")
    public void toBinaryString4() {
        Assertions.assertEquals("10000000", home_work_1.Main8.toBinaryString((byte) -128));
    }

    @Test
    @DisplayName("0")
    public void toBinaryString5() {
        Assertions.assertEquals("00000000", home_work_1.Main8.toBinaryString((byte) 0));
    }
}
