package com.techouts.cj6.Multithreading;

public class SleepThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Table();
        t1.setName("Thread 1");
        t1.start();

        Thread t2 = new Table();
        t2.setName("Thread 2");
        t2.start();


        for (int i = 1; i < 6; i++) {
            System.out.println("Thread = " + Thread.currentThread().getName() + "- " + i);
        }

    }
}


    class Table extends Thread {
        public void run(){
            for (int i = 1; i < 6; i++) {


                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread = " + Thread.currentThread().getName() + "- " + i);
            }
        }
    }