package OOP.BankManager;

public class MainBankManager {

    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        CertificateOfDeposit certificateOfDeposit = new CertificateOfDeposit();

        certificateOfDeposit.setBalance(34.6);
        System.out.println(certificateOfDeposit.getBalance());

    }

}
