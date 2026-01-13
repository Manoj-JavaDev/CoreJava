package com.techouts.cj6.Multithreading;


public class InterThreadCommunication2 {


    static void main(String[] args) throws InterruptedException {
        BankAccount bc = new BankAccount();

        Thread t1 = new Thread(() -> {

            try {
                int count  = 0;
                while (count <= 10) {
                    bc.depositMoney(1000);
                    count++;
                }   //bc.depositMoney(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        });

        Thread t2 = new Thread(() -> {
            try{
                int count = 0;
                while (count < 10) {
                    bc.withdrawMoney(1400);
                    count++;
                }//bc.withdrawMoney(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

    }

}

class BankAccount {


    double balance;

    public synchronized void depositMoney(int amount) throws InterruptedException {


        balance += amount;
        System.out.println("Money Deposited Successfully : ");
        System.out.println("Balance = " + this.balance);

        notifyAll();

    }

    public synchronized void withdrawMoney(int amount) throws InterruptedException {

        while(amount > balance) {
            System.out.println("Insufficient balance available in your account !!");
            wait();

        }

        balance -= amount;
        System.out.println("Money Withdrawn Successfully !!");
        System.out.println("Balance available = " + this.balance);
        notifyAll();

    }

}