package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main4_5Test {
    @Test
    @DisplayName("'A'")
    public void isEnglishLetter1() {
        Assertions.assertTrue(home_work_1.Main4_5.isEnglishLetter(65));
    }

    @Test
    @DisplayName("'z''")
    public void isEnglishLetter2() {
        Assertions.assertTrue(home_work_1.Main4_5.isEnglishLetter(122));
    }

    @Test
    @DisplayName("'['")
    public void isEnglishLetter3() {
        Assertions.assertFalse(home_work_1.Main4_5.isEnglishLetter(91));
    }

    @Test
    @DisplayName("Out of bounds")
    public void isEnglishLetter4() {
        Assertions.assertFalse(home_work_1.Main4_5.isEnglishLetter(1191));
    }
}
