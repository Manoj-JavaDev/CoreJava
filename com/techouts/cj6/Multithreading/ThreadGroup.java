package com.techouts.cj6.Multithreading;

public class ThreadGroup {

    static void main(String[] args) {

        java.lang.ThreadGroup tg = new java.lang.ThreadGroup("AvengersGroup");

        Runnable r1 = (() ->
            {
                System.out.println(Thread.currentThread().getName() + " is running !");
            }
        );
        Thread t1 = new Thread(tg,r1,"Thread-1");
        Runnable r2 = (() ->
        {
            System.out.println(Thread.currentThread().getName() + " is running !");
        }
        );
        Thread t2 = new Thread(tg,r1,"Thread-2");

        Runnable r3 = (() ->
        {
            System.out.println(Thread.currentThread().getName() + " is running !");
        }
        );
        Thread t3 = new Thread(tg,r1,"Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try{

            t1.join();
            t2.join();
            t3.join();

        }
        catch(InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println(tg);

        System.out.println(tg.activeCount());
        //System.out.println();
        tg.list();
        System.out.println(tg.toString());

        System.out.println(tg.getMaxPriority());

        System.out.println(tg.getParent());



    }

}
