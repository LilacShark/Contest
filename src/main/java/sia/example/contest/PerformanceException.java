package sia.example.contest;

public class PerformanceException extends Exception {

    public PerformanceException() {
    }

    public PerformanceException(String message) {
        super(message);
    }

    public PerformanceException(String message, Throwable cause) {
        super(message, cause);
    }
}
