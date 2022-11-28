package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main7Test {
    @Test
    public void createPhoneNumber() {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Assertions.assertEquals("(123) 456-7890", home_work_1.Main7.createPhoneNumber(ar));
    }
}
