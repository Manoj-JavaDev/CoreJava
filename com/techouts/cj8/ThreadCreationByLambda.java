package com.techouts.cj8;

public class ThreadCreationByLambda {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {
            System.out.println("This is a Thread by Runnable Interface!!");

            for(int i = 0;i < 4;i++)
            {
                System.out.println(Thread.currentThread().getName() + " is executing " + i);
            }
        };



        Thread t1 = new Thread(runnable);
        t1.start();
        t1.join();
        System.out.println("This is main Thread !!!");
    }

}
