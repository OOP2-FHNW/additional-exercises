package ch.fhnw.oop2.addex.streams.aufgabe2.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStrings {

    @Test
    public void testAverageLength() {
        // given
        String[] strings = { "aa", "aaaa", "aaa", "aaaaa", "a", "aaa" }; // 18 / 5 = 3.0

        // when
        double result = Strings.lengthAverage(strings);

        // then
        assertEquals(3.0d, result, 0.01d);
    }
}