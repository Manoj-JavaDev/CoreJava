package com.techouts.cj6.Multithreading;

public class StartThreadDemo {

    static void main(String[] args) throws InterruptedException{
        SampleThread t1 = new SampleThread("Thread-1");
        SampleThread t2 = new SampleThread("Thread-2");
        SampleThread t3 = new SampleThread("Thread-3");

        t1.start();
        System.out.println("Manoj");
        t1.join();

        t2.start();


        for(int i = 0;i < 8;i++)
        {
            Thread.currentThread().sleep(10);
            System.out.println("hii");
        }

        t3.start();


    }

}


class SampleThread extends Thread {

    //String threadName;

    SampleThread(String str) {
        super(str);
    }

    public void run() {
        for(int i = 0;i < 20;i++)
        {
            System.out.println("hello"+Thread.currentThread().getName());
        }
        /*for(int i = 0;i < 4;i++)
        {

            System.out.println(Thread.currentThread().getName() + " is running - " + i);
           try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }*/
        System.out.println("Thread Exiting!!  "   + Thread.currentThread().getName());
    }

}
