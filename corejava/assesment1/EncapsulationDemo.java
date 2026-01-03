package corejava.assesment1;

// import javax.sound.midi.SysexMessage;

public class EncapsulationDemo {

    static void main(String[] args) {


        // Encapsulation is a mechanism that binds code and data together.
        // It is mainly used for security that it use private variables and public methods!!
        BankAccount account = new BankAccount();
        account.setAccountNumber(232435454);
        account.setBalance(200000);
        account.setIfscCode(6889);

        System.out.println("Account Number = " + account.getAccountNumber());
        System.out.println("Bank Balance = " + account.getBalance());
        System.out.println("IFSC Code = " + account.getIfscCode());
    }
}

class BankAccount {

    private int accountNumber;
    private int ifscCode;
    double balance;

    public int getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(int ifscCode) {
        this.ifscCode = ifscCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}