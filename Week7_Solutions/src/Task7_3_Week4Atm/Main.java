package Task7_3_Week4Atm;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankCard authenticCard = new BankCard(1111, "123456", 0);
        BankCard bankCard1 = new BankCard(1111, "123456", 20000);
        BankCard bankCard2 = new BankCard(2222, "987654", 0);

        ATM atm1 = new ATM("Bank of America", 100000, 1);
        ATM atm2 = new ATM("Bank of America", 50000, 2);

        //Check information at ATM1 and ATM2
        System.out.println(atm1);
        System.out.println(atm2);


        //validate bank card 1;
        if (atm1.validateBankCard(bankCard1, authenticCard)) {

            atm1.displayCardBalance(bankCard1);
            try {
                atm1.withdrawFunds(100, bankCard1);
            } catch (FundsWithdrawalException e) {
                e.printStackTrace();
            }

            //check FundsWithdrawalException
            atm1.displayCardBalance(bankCard1);
            try {
                atm1.withdrawFunds(20000, bankCard1);
            } catch (FundsWithdrawalException e) {
                e.printStackTrace();
            }

            atm1.displayCardBalance(bankCard1);
            try {
                atm1.withdrawFunds(100, bankCard1);
            } catch (FundsWithdrawalException e) {
                e.printStackTrace();
            }
            atm1.displayATMBalance();

            atm1.depositFundsByStaff(20000);
            atm1.displayATMBalance();

            atm1.depositFundsByUser(10000, bankCard1);
            atm1.displayATMBalance();
            atm1.displayCardBalance(bankCard1);

            atm1.displayCardBalance(bankCard2);
            try {
                atm1.transferFunds(1000, bankCard1, bankCard2);
            } catch (FundsWithdrawalException e) {
                e.printStackTrace();
            }
            atm1.displayCardBalance(bankCard2);

            Software newSotware = new Software(121, "Alex");
            System.out.println(atm1);

            //check for OutdatedSoftwareUpdateException.
            try {
                atm1.installSoftwareUpdate(newSotware);
            } catch (SoftwareUpdateException e) {
                e.printStackTrace();
            }
            System.out.println(atm1);
        } else {
            System.out.println("Sorry, your password doesn't match with account number.");
        }
    }
}
