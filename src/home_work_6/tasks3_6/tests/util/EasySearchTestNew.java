package home_work_6.tasks3_6.tests.util;

import home_work_6.tasks3_6.api.ISearchEngine;
import home_work_6.tasks3_6.util.EasySearch;
import home_work_6.tasks3_6.util.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EasySearchTestNew {
    @ParameterizedTest
    @MethodSource("searchEngineFabric")
    public void test1(ISearchEngine engine) {
        Assertions.assertEquals(1, engine.search("hi, how are you?", "hi"));
    }

    public static Stream<Arguments> searchEngineFabric() {
        return Stream.of(
            Arguments.arguments(new EasySearch()),
            Arguments.arguments(new RegExSearch())
        );
    }

}
