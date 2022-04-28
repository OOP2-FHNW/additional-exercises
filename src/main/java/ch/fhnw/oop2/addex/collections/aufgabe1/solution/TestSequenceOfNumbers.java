package ch.fhnw.oop2.addex.collections.aufgabe1.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSequenceOfNumbers {

    @Test
    public void testZeroSequence() {
        // given
        SequenceOfNumbers sequence = new SequenceOfNumbers();

        // when
        int result = sequence.sum();

        // then
        assertEquals(0, result);
    }

    @Test
    public void testSequence() {
        // given
        SequenceOfNumbers sequence = new SequenceOfNumbers();

        // when
        int result = sequence.sum(1, 2, 3, 4, 5);

        // then
        assertEquals(15, result);
    }
}