package ch.fhnw.oop2.addex.exceptions.aufgabe1.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestMyIntParser {

    @Test
    public void testNumbers() {
        // given
        final String one = "1";
        final String two = "2";

        // when
        int r1 = MyIntParser.parse(one);
        int r2 = MyIntParser.parse(two);

        // then
        assertEquals(1, r1);
        assertEquals(2, r2);
    }

    @Test
    public void testNonNumber() {
        // given
        final String invalidNumber = "pi";

        try {
            // when
            int r1 = MyIntParser.parse(invalidNumber);

            // then
            assertEquals(0, r1);
        }
        catch(Exception e) {
            fail();
        }
    }
}