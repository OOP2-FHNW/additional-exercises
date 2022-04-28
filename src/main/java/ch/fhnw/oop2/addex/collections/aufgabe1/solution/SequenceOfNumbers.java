package ch.fhnw.oop2.addex.collections.aufgabe1.solution;

import java.util.Arrays;

public class SequenceOfNumbers {
    
    public int sum(int... numbers) {
        return Arrays
            .stream(numbers)
            .sum();
    }
}
