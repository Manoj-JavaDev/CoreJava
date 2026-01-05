package com.techouts.cj5;

public class EncapsulationDemo {

    public static void main(String[] args) {

        // Encapsulation is a mechanism that binds the data and code together!!
        BankAccount ba1 = new BankAccount();
        ba1.setBankName("SBI");
        System.out.println("Bank Name = " + ba1.getBankName());
        ba1.setBalance(5478);
        System.out.println("Balance = " + ba1.getBalance());
        ba1.setAccountNumber(56383533);
        System.out.println("Account Number = " + ba1.getAccountNumber());


    }

}

class BankAccount {

    private String bankName;
    private int accountNumber;
    private double balance;

    public String getBankName() {
        return bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
