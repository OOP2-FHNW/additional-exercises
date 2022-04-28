package ch.fhnw.oop2.addex.exceptions.aufgabe3.solution;

public class WrongInputException extends Exception {
    
    private static final long serialVersionUID = 2168234583335205520L;

    public WrongInputException(String message) {
        super(message);
    }
}
