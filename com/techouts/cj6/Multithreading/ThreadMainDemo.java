package com.techouts.cj6.Multithreading;

public class ThreadMainDemo {
    static void main(String[] args) {


        Runnable t = new A();
        /*
            Here the thread is not created it just call the overridden method class A.
        */
        // t.run();

        Thread thread = new Thread(t);
        thread.start();
        System.out.println(Thread.currentThread().getState());
    }
}


class A implements Runnable{
    public void run() {
        System.out.println("This is run method in A");
    }
}


