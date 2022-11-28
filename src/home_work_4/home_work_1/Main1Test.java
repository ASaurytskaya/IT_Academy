package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main1Test {
    @Test
    public void binaryAnd1() {
        Assertions.assertEquals(1, home_work_1.Main1.binaryAnd(5,9));
    }

    @Test
    public void binaryOr1() {
        Assertions.assertEquals(13, home_work_1.Main1.binaryOr(5,9));
    }

}
