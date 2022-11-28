package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main4_4Test {
    @Test
    public void toByte1() {
        Assertions.assertEquals(0.25, home_work_1.Main4_4.toByte(2));
    }

    @Test
    public void toKilobyte1() {
        Assertions.assertEquals(4, home_work_1.Main4_4.toKilobyte(32000));
    }
}
