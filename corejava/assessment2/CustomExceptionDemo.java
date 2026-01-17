package corejava.assessment2;

public class CustomExceptionDemo {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount(5000);
        System.out.println("Balance = " + ba.getBalance());
        ba.withDrawMoney(2000);
        System.out.println("Balance Available = " + ba.getBalance());

        ba.withDrawMoney(5000);// This line throws an custom exception as the amount entered is greater than balance.



    }

}

class InsufficientFundsException extends RuntimeException{

    InsufficientFundsException() {
        super("Insufficient bank balance in your account ");
    }
    InsufficientFundsException(String str) {
        super(str);
    }
}

class BankAccount {

    double balance ;

    BankAccount (double balance) {
        this.balance = balance;
    }

    public void withDrawMoney(int amount) {

        if(amount > balance) {
            throw new InsufficientFundsException();
        }

        balance -= amount;

        System.out.println("Withdraw Successful !!");

    }

    public double getBalance() {
        return this.balance;
    }

}


