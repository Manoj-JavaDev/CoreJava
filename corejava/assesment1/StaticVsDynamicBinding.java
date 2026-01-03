package corejava.assesment1;

public class StaticVsDynamicBinding {

    static void main(String[] args) {
        // Static binding

        Bus b = new ElectricBus();
        b.speed();
        System.out.println("a = " + b.a);
        Bus.busHorn();
        b.numberOfWheels();// dynamic binding

    }

}

/*
    static binding is done during compile time when we using static, final & private methods.
    dynamic binding is done during runtime i.e method overriding when they are virtual methods.
 */



class Bus {

    static void speed(){
        System.out.println("Bus is going with speed of 50KMPH");
    }

    static final void busHorn(){
        System.out.println("Bus making horn!!!");
    }

    void numberOfWheels() {
        System.out.println("Bus consists 12 wheels");
    }

    final int a = 100;

}

class ElectricBus extends Bus {

    static int a = 200;
    void numberOfWheels() {
        System.out.println("ElectricBus consists 8 wheels");
    }


}
