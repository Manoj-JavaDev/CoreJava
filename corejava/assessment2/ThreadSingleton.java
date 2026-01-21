package corejava.assessment2;

public class ThreadSingleton {

    public static void main(String[] args) {

        Thread t1 = new Thread(new SingletonTest(),"Thread-1");
        Thread t2 = new Thread(new SingletonTest(),"Thread-2");
        Thread t3 = new Thread(new SingletonTest(),"Thread-3");

        t1.start();
        t2.start();
        t3.start();

    }

}

class Singleton {
    public static volatile Singleton instance;

    private Singleton() {
        System.out.println("Singleton class constructor is called !!");
    }
    public static Singleton getInstance() {
        if (instance == null) {

            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;

    }

}

class SingletonTest implements Runnable {

    @Override
    public void run() {
        Singleton single = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " is called !! HashCode = " + single.hashCode());
    }
}