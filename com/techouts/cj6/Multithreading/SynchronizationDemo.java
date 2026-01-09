package com.techouts.cj6.Multithreading;

public class SynchronizationDemo {

    static void main(String[] args) {

        Counter c = new Counter();
        Runnable r1 = (() -> {
           for(int i = 0;i < 1000;i += 10)
           {
               try{
                   Thread.sleep(10);
               }
               catch (InterruptedException e){
                   e.printStackTrace();
               }
               c.increaseCount();
           }
        });

        Runnable r2 = (() -> {
            for(int i = 0;i < 1000;i += 10)
            {
                try{
                    Thread.sleep(10);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                c.increaseCount();
            }
        });
        Runnable r3 = (() -> {
            for(int i = 0;i < 1000;i += 10)
            {
                try{
                    Thread.sleep(10);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                c.increaseCount();
            }
        });


        Thread t1 = new Thread(r1,"Thread - 1");
        Thread t2 = new Thread(r2,"Thread - 2");
        Thread t3 = new Thread(r3,"Thread - 3");

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

        System.out.println(c.getCount());
        System.out.println(c.getCount2());
    }

}



class Counter {

    private int count;
    private int count2;
    public void increaseCount() {
        synchronized (this) {
            count += 10;
        }
        count2 += 10;
    }



    public int getCount2() {
        return this.count2;
    }
    public int getCount() {
        return this.count;
    }
}