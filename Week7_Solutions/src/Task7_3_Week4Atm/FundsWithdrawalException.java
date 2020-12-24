package Task7_3_Week4Atm;

public class FundsWithdrawalException extends Exception {
    public FundsWithdrawalException(String message){
        super(message);
    }

    public FundsWithdrawalException(String message, Throwable cause){
        super(message, cause);
    }
}
