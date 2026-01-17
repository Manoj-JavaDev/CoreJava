package corejava.assessment2;

public class ThreadCreationByRunnable {

    public static void main(String[] args) {

        Thread t1 = new Thread(new RunnableDemo());
        Thread t2 = new Thread(new RunnableDemo());

        t1.start();
        t2.start();

    }

}

class RunnableDemo implements Runnable {

    public void run() {
        System.out.println("Thread Created by Runnable Interface !");
        for(int i = 0;i < 5;i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}