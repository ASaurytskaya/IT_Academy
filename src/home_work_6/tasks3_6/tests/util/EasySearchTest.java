package home_work_6.tasks3_6.tests.util;

import home_work_6.tasks3_6.util.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTest {
    String s1 = "привет, как дела!";
    String s2 = "привет,какдела!";
    String s3 = "привет;какдела!";
    String s4 = "как дела!.Что делаешь?";
    String s5 = "Привет-привет";
    String s6 = "Привет -привет";
    String s7 = "4-х";
    String s8 = "один и 1";
    String s9 = "бабушка бабушке бабушку";
    String s10 = "Мама мыла раму, папа мыл окно";
    String s11 = "-Тоже это ждали?\n-То же самое.\n-То-то же, то, что нужно.";

    EasySearch es = new EasySearch();

    @Test
    public void search1() {
        Assertions.assertEquals(1, es.search(s1, "привет"));
    }

    @Test
    public void search2() {
        Assertions.assertEquals(1, es.search(s2, "привет"));
    }

    @Test
    public void search3() {
        Assertions.assertEquals(0, es.search(s3, "дела"));
    }

    @Test
    public void search4() {
        Assertions.assertEquals(1, es.search(s4, "дела"));
    }

    @Test
    public void search5() {
        Assertions.assertEquals(0, es.search(s5, "привет"));
    }

    @Test
    public void search6() {
        Assertions.assertEquals(1, es.search(s6, "привет"));
    }

    @Test
    public void search7() {
        Assertions.assertEquals(1, es.search(s7, "4-х"));
    }

    @Test
    public void search8() {
        Assertions.assertEquals(1, es.search(s8, "1"));
    }

    @Test
    public void search9() {
        Assertions.assertEquals(1, es.search(s9, "бабушке"));
    }

    @Test
    public void search10() {
        Assertions.assertEquals(1, es.search(s10, "мыл"));
    }

    @Test
    public void search11() {
        Assertions.assertEquals(1, es.search(s11, "то"));
    }

    @Test
    public void search12() {
        Assertions.assertEquals(1, es.search(s11, "Тоже"));
    }

    @Test
    public void search13() {
        Assertions.assertEquals(2, es.search("когда-нибудь когда- нибудь когда -нибудь когда и нибудь когда-нибудь ",
                "когда-нибудь"));
    }
}
