package home_work_4.home_work_2.loops;

import home_work_2.loops.Main1_2;
import home_work_2.loops.Main1_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_4Test {
    @Test
    @DisplayName("Multiply by 3")
    public void multiplyToOverflowAndPrint1() {
        Assertions.assertEquals("Число до переполнения    - 4052555153018976267\nЧисло после переполнения - -6289078614652622815",
                Main1_4.multiplyToOverflowAndPrint(3));
    }

    @Test
    @DisplayName("Multiply by 188")
    public void multiplyToOverflowAndPrint2() {
        Assertions.assertEquals("Число до переполнения    - 1560496482665168896\nЧисло после переполнения - -1774566438301073408",
                Main1_4.multiplyToOverflowAndPrint(188));
    }

    @Test
    @DisplayName("Multiply by -19")
    public void multiplyToOverflowAndPrint3() {
        Assertions.assertEquals("Число до переполнения    - 799006685782884121\nЧисло после переполнения - 3265617043834753317",
                Main1_4.multiplyToOverflowAndPrint(-19));
    }

    @Test
    @DisplayName("Multiply by 0")
    public void multiplyToOverflowAndPrint4() {
        Assertions.assertEquals("При умножении на ноль переполнение невозможно.",
                Main1_4.multiplyToOverflowAndPrint(0));
    }

    @Test
    @DisplayName("Multiply by 1")
    public void multiplyToOverflowAndPrint5() {
        Assertions.assertEquals("При умножении на единицу переполнение невозможно.",
                Main1_4.multiplyToOverflowAndPrint(1));
    }

    @Test
    @DisplayName("Multiply by 2")
    public void multiplyToOverflowAndPrint6() {
        Assertions.assertEquals("Число до переполнения    - 4611686018427387904\nЧисло после переполнения - -9223372036854775808",
                Main1_4.multiplyToOverflowAndPrint(2));
    }

    @Test
    @DisplayName("Multiply by -2")
    public void multiplyToOverflowAndPrint7() {
        Assertions.assertEquals("Число до переполнения    - -9223372036854775808\nЧисло после переполнения - 0",
                Main1_4.multiplyToOverflowAndPrint(-2));
    }
}
