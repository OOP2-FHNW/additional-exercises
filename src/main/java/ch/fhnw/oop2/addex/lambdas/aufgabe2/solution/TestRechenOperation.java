package ch.fhnw.oop2.addex.lambdas.aufgabe2.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRechenOperation {

    @Test
    public void testAdd() {
        // given
        RechenOperation<Integer, Integer> adder = (a, b) -> a + b;

        // when
        int result = adder.operation(2, 3);

        // then
        assertEquals(5, result);
    }

    @Test
    public void testMultiplyStrings() {
        // given
        RechenOperation<String, Integer> strLength = (a, b) -> a.length() * b.length();

        // when
        int result = strLength.operation("aaa", "bbb");

        // then
        assertEquals(9, result);
    }
}
