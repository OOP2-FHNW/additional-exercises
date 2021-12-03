package ch.fhnw.oop2.addex.generics.aufgabe8.solution;

import java.util.Objects;

public class Cake {
    private int number;

    public Cake(int number) {
        this.setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        // self check
        if (this == obj)
            return true;
        // null check
        if (obj == null)
            return false;
        // type check and cast
        if (getClass() != obj.getClass())
            return false;
        Cake cake = (Cake) obj;
        // field comparison
        return Objects.equals(number, cake.number);
    }

}
