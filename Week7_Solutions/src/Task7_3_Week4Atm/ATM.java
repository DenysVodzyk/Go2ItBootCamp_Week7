package Task7_3_Week4Atm;

import java.util.ArrayList;
import java.util.List;

public class ATM {

    private String bankName;
    private double balance;
    private int atmLocation;
    private static int softwareVersion;
    private static List<Integer> atm = new ArrayList<>();
    private static int previousSoftwareVersion;


    public ATM(String bankName, double balance, int atmLocation) {
        this.bankName = bankName;
        this.balance = balance;
        this.atmLocation = atmLocation;
        this.softwareVersion = 1;
        atm.add(atmLocation);
    }

    public ATM(String bankName, double balance, int atmLocation, Software software) {
        this.bankName = bankName;
        this.balance = balance;
        this.atmLocation = atmLocation;
        this.softwareVersion = software.getVersion();
        atm.add(atmLocation);
    }

    public void withdrawFunds(int amountToWithdraw, BankCard bankCard) throws FundsWithdrawalException {
        if (getBalance() >= amountToWithdraw) {
            if (bankCard.getBalance() < amountToWithdraw) {
                throw new FundsWithdrawalException("Sorry you don't have enough money on the card.");
            }
            balance -= amountToWithdraw;
            double leftoverOnCard = bankCard.getBalance() - amountToWithdraw;
            bankCard.setBalance(leftoverOnCard);
            System.out.println("Your money is ready. Please don't forget the card. Thank you.");
        } else {
            System.out.println("Sorry, the requested amount to withdraw exceeds the available balance at current ATM. You can visit our other " +
                    (atm.size() - 1) + " ATM located in this bank. Thank you.");
        }
    }

    public void depositFundsByUser(int amountToDeposit, BankCard bankCard) {
        balance += amountToDeposit;
        bankCard.setBalance(bankCard.getBalance() + amountToDeposit);
        System.out.println("You deposit: " + amountToDeposit + " CAD, to your account.");
    }

    public void depositFundsByStaff(int amountToDeposit) {
        balance += amountToDeposit;
    }

    public static void installSoftwareUpdate(Software software) throws InterruptedException, SoftwareUpdateException {
        if (software.getVersion() > softwareVersion) {
            previousSoftwareVersion = softwareVersion;
            Thread.sleep(2000);
            softwareVersion = software.getVersion();
        } else {
            throw new SoftwareUpdateException("Software is outdated, you cannot instal it.");
        }
    }

    public static void recoverPreviousVersion(Software software) {
        if (softwareVersion != software.getVersion()) {
            softwareVersion = previousSoftwareVersion;
        }
    }

    public void displayCardBalance(BankCard bankCard) {
        System.out.println("Your balance is: " + bankCard.getBalance());
    }

    public void displayATMBalance() {
        System.out.println("ATM balance is: " + balance);
    }

    public boolean validateBankCard(BankCard customerCard, BankCard authenticCard) {
        return customerCard.equals(authenticCard);
    }

    public void transferFunds(double amount, BankCard card1, BankCard card2) throws FundsWithdrawalException {
        if (card1.getBalance() < amount) {
            throw new FundsWithdrawalException("Sorry you don't have enough money on the card.");
        }
        double leftoverBalanceCard1 = card1.getBalance() - amount;
        card1.setBalance(leftoverBalanceCard1);
        card2.setBalance(card2.getBalance() + amount);
        System.out.println("Transfer complete");
    }

    public String getBankName() {
        return bankName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAtmLocation() {
        return atmLocation;
    }

    public List<Integer> getATMList() {
        return atm;
    }

    public void numberOfATMatBank() {
        System.out.println("There are: " + atm.size() + " ATM's available at this locataion.");
    }

    public int getSoftwareVersion() {
        return softwareVersion;
    }

    @Override
    public String toString() {
        return "Bank name: " + getBankName() + ". ATM Balance: " + getBalance() + ". ATM location: " + getAtmLocation() + ". ATM Software: " + getSoftwareVersion();
    }
}


