package com.techouts.cj6.Multithreading;

import java.util.concurrent.ThreadLocalRandom;

public class CustomThread1 {

    /*
        Thread is a light weight independent unit of executiom,, A Process or program have mutliple threads.
        There are two ways to create a thread :
            1) extending Thread Class
                - These are used for the classes that are never extends another class ,, Does'nt support
                  multiple inheritance.
            2) implementing Runnable Interface
                - we can use this interface to create a thread when the class is already extended.

     */
    static void main(String[] args) {

        Thread t1 = new CookingTask("Cleaning");
        Thread t2 = new CookingTask("Cutting");
        Thread t3 = new CookingTask("cooking");
        Thread t4 = new CookingTask("Taking Orders");
        Thread t5 = new CookingTask("Serving");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println(Thread.currentThread().getState());
    }

}


class CookingTask extends Thread{

    String task;

    CookingTask (String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(this.task + " is running by " + Thread.currentThread().getName());
    }

}
