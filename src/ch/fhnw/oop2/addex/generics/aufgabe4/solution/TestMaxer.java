package ch.fhnw.oop2.addex.generics.aufgabe4.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;

public class TestMaxer {

    @Test
    public void testNumbers() {
        // given
        List<Integer> numbers = List.of(1, 2, 3, 42, 5, 6);

        // when
        int result = Maxer.max(numbers);
        
        // then
        assertEquals(42, result);
    }

    @Test
    public void testEmptyList() {
        // given
        List<String> objects = List.of();

        // when
        String result = Maxer.max(objects);
        
        // then
        assertNull(result);
    }
}
