package Task7_3_Week4Atm;

public class OutdatedSoftwareException extends Exception{
    public OutdatedSoftwareException(String message){
        super(message);
    }

    public OutdatedSoftwareException(String message, Throwable cause){
        super(message, cause);
    }
}
