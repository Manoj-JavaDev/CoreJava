package com.techouts.cj6.Multithreading;

public class PracticeThread {

    static void main(String[] args) {

        System.out.println("Main Thread is Running !!!");
        NewThread nt1 = new NewThread("first-thread");
        NewThread nt2 = new NewThread("Second-Thread");

        nt1.start();
        nt2.start();

        try {
            nt1.join();
            nt2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main thread is exiting !!!");

    }



}

class NewThread extends Thread {

    String threadName;
    NewThread(String threadName) {
        this.threadName = threadName;
    }

    public void run() {

        System.out.println("Thread Name = " + Thread.currentThread().getName());
        System.out.println("Thread State = " + Thread.currentThread().getState());
        System.out.println("Thread Priority = " + Thread.currentThread().getPriority());
        try{
            for(int i = 0;i < 4;i++)
            {
                System.out.println(threadName + " is running - " + i);
                Thread.sleep(300);
            }
            System.out.println(threadName + " is exiting !!!");
        }
        catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        System.out.println("Thread " + threadName + " is runninig!!" );


    }

}