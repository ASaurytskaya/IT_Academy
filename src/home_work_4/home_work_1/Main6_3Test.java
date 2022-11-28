package home_work_4.home_work_1;

import home_work_1.Main6_3;
import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main6_3Test {
    Main6_3 printer = new Main6_3();

    @Test
    @DisplayName("Вася")
    public void welcom1() {
        Assertions.assertEquals("Привет!\nЯ тебя так долго ждал.", printer.welcom("Вася"));
    }

    @Test
    @DisplayName("Анастасия")
    public void welcom2() {
        Assertions.assertEquals("Я тебя так долго ждал.", printer.welcom("Анастасия"));
    }

    @Test
    @DisplayName("Василий")
    public void welcom3() {
        Assertions.assertEquals("Добрый день, а вы кто?", printer.welcom("Василий"));
    }

    @Test
    @DisplayName("null")
    public void welcom4() {
        String s = null;
        Assertions.assertThrows(NullPointerException.class, ()-> {
            printer.welcom(s);
        });
    }
}

