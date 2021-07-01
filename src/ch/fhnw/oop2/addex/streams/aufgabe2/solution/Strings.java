package ch.fhnw.oop2.addex.streams.aufgabe2.solution;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Strings {
    
    private Strings() {}

    public static double lengthAverage(String[] strings) {
        return Arrays
            .stream(strings)
            .collect(Collectors.summarizingInt(String::length))
            .getAverage();
    }
}
