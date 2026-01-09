package com.techouts.cj6.ExceptionHandling;

import java.util.Scanner;

public class CustomException2 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to credit !!");
        double amount = sc.nextDouble();

        BankAccount ba = new BankAccount(amount);
        try {
            ba.withdrawMoney(200);
        } catch (InsufficientBankBalanceException e) {
            System.out.println("Please enter valid amount, your requested amount is greater than bank balance !!");
        }
        ba.getBalance();

    }

}

class InsufficientBankBalanceException extends RuntimeException {

   InsufficientBankBalanceException() {
       super("Insufficient Funds in  your bank !!");
   }

   InsufficientBankBalanceException(String msg) {
       super(msg);
   }

}

class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdrawMoney(double amount) {

        if(amount > balance) {
            throw new InsufficientBankBalanceException();
        }

        else{
            this.balance -= amount;
            System.out.println("Amount debited successfully!!");
        }
    }

    public void getBalance() {
        System.out.println("Balance Available = " + this.balance);
    }

}
