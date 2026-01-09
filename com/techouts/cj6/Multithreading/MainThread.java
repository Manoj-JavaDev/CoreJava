package com.techouts.cj6.Multithreading;

public class MainThread {

    static void main(String[] args) throws InterruptedException {

        C c1 = new C();
        C c2 = new C();

        Thread t1 = new Thread(c1,"Manoj-thread");
        Thread t2 = new Thread(c2,"Rakesh-thread");
       //Thread.currentThread().sleep(5000);
        System.out.println(Thread.currentThread().isInterrupted());
        Thread.currentThread().interrupt();
        System.out.println(Thread.currentThread().isInterrupted());

        t1.start();
        t2.start();

    }

}

class C implements Runnable {

    public void run() {

        for(int i = 0;i < 4;i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " - " + i);
        }

        System.out.println(Thread.currentThread().getName() + "Exited !!");

    }

}
