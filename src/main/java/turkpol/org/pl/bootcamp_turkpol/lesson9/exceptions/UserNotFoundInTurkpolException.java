package turkpol.org.pl.bootcamp_turkpol.lesson9.exceptions;

public class UserNotFoundInTurkpolException extends Exception {
    // Constructor that accepts a message
    public UserNotFoundInTurkpolException(String message) {
        super(message);
    }

    // Constructor that accepts a message and a cause
    public UserNotFoundInTurkpolException(String message, Throwable cause) {
        super(message, cause);
    }
}