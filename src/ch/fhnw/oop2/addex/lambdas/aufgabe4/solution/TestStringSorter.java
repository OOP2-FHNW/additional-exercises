package ch.fhnw.oop2.addex.lambdas.aufgabe4.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStringSorter {

    @Test
    public void testSort() {
        // given
        final String AAA = "AAA";
        final String Aaa = "Aaa";
        final String AAa = "AAa";
        String[] words = { Aaa, AAA, AAa };

        // when
        String[] result = StringSorter.sortCaseInsensitive(words);

        // then
        assertEquals(Aaa, result[0]);
        assertEquals(AAA, result[1]);
        assertEquals(AAa, result[2]);
    }
}