package com.techouts.cj6.Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class InterthreadCommunicationDemo {

    private static Queue<Integer> buffer =
            new LinkedList<>();
    private static int MAX_CAPACITY = 10;
    private static final Runnable producer = (() -> {
        int count = 0;
        while(count < 10) {
            synchronized (buffer) {

                while (buffer.size() == MAX_CAPACITY)
                {
                    System.out.println("Buffer is full, producer waiting...");
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                buffer.add(10);
                System.out.println("Item added into buffer successfully!! ");
                buffer.notifyAll();

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            count++;
        }

    } );

    private static Runnable consumer = (() ->
    {
        int count = 0;
        while(count < 10) {
            synchronized (buffer) {
                while(buffer.isEmpty()) {
                    System.out.println("Buffer is Empty !!");
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        //Thread.currentThread().interrupt();
                        e.printStackTrace();
                    }
                }

                System.out.println("Removing " + buffer.remove() + "from the buffer !");
                buffer.notifyAll();

                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException ie) {
                    //Thread.currentThread().interrupt();
                    ie.printStackTrace();
                }
            }
            count++;
        }
    });

    static void main(String[] args)throws InterruptedException {

        System.out.println("Main is started!!");
        Thread t1 = new Thread(producer,"Producer-Thread");
        Thread t2 = new Thread(consumer,"Consumer-Thread");

        t1.start();
        t2.start();


        Thread.sleep(1000);




    }

}
