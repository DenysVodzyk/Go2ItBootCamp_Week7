package Task7_3_Week4Atm;

import java.util.Objects;

public class BankCard {
    private int accountNumber;
    private String password;
    private double balance;


    public BankCard(int accountNumber, String password, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankCard bankCard = (BankCard) o;
        return accountNumber == bankCard.accountNumber &&
                Objects.equals(password, bankCard.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, password);
    }
}
