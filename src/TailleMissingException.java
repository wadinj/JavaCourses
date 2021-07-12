public class TailleMissingException extends Exception {
    public TailleMissingException() {
    }

    public TailleMissingException(String message) {
        super(message);
    }

    public TailleMissingException(String message, Throwable cause) {
        super(message, cause);
    }

    public TailleMissingException(Throwable cause) {
        super(cause);
    }

    public TailleMissingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
