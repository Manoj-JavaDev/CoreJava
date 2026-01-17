package corejava.assessment2;

public class InterThreadCommunication {
    public static void main(String[] args) {

        Transaction t = new Transaction();
        Thread atm1 = new Thread(() ->
        {
           while (true) {
               t.depositMoney(1000);
           }
        }
        );

        Thread atm2 = new Thread(() ->
        {
            while (true) {
                try {
                    t.withdraw(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        );

        atm1.start();
        atm2.start();


    }
}

class Transaction {

    double balance;

    public synchronized void depositMoney(int amount) {

        balance += amount;
        System.out.println("Deposited Successfully!!!");
        System.out.println("Currrent Balance = " + this.balance);

        notifyAll();
    }

    public synchronized void withdraw (int amount) throws InterruptedException {
        if(balance < amount)
        {
            System.out.println("Insufficient balance : ");
            wait();
        }
        balance -= amount;
        System.out.println("Withdraw successfull !!");
        System.out.println("Current Balance = " + this.balance);
        notifyAll();

    }

}


