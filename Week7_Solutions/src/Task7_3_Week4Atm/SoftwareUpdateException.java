package Task7_3_Week4Atm;

public class SoftwareUpdateException extends Exception {
    public SoftwareUpdateException(String message) {
        super(message);
    }

    public SoftwareUpdateException(String message, Throwable cause) {
        super(message, cause);
    }
}
