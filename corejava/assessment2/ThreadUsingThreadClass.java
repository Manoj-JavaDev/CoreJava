package corejava.assessment2;

import javax.swing.plaf.TableHeaderUI;

public class ThreadUsingThreadClass {

    public static void main(String[] args) {

        ThreadDemo td = new ThreadDemo();
        ThreadDemo td2 = new ThreadDemo();
        td.start();
        td2.start();

    }

}
class ThreadDemo extends Thread {

    public void run() {

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
