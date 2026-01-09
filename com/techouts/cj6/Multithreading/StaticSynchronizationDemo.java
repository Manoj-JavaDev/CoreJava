package com.techouts.cj6.Multithreading;

import java.security.cert.X509Certificate;

public class StaticSynchronizationDemo {


    static void main(String[] args) {

        Thread t1 = new ThreadDemo();
        Thread t2 = new ThreadDemo();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println(Custom.count);

    }

}

class ThreadDemo extends Thread {

    Custom c = new Custom();
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is started!!");
        for(int i = 0;i < 5;i++)
        {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            c.increment();
        }
        System.out.println(Thread.currentThread().getName() + " is exited!!");

    }

}


class Custom{


    static int count;

    public synchronized static void increment(){
        count++;
    }

}