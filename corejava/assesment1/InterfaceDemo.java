package corejava.assesment1;

public class InterfaceDemo {

    public static void main(String[] args) {
        // Interfaces are acts as a contract that its subclasses will provide body for its abstract methods.
        MobileCalculator mc = new MobileCalculator();

        System.out.println("Addition = " + mc.addition(20,30));
        System.out.println("Subtraction = " + Calculator1.subtraction(30,20));// Static method
        System.out.println("Mutiplication = " + mc.multiplication(20,20));
        System.out.println("Divison = " + mc.division(30,21));


    }

}

interface Calculator1 {

    default int addition(int a,int b){
        return (a + b);
    }
    int mutliplication(int a ,int b);
    double division(int a,int b);
    static int subtraction(int a,int b) {
        return (subtract(a,b));
    }
    private static int subtract(int a,int b){
        return (a - b);
    }
}

class MobileCalculator implements  Calculator1{

    int multiplication(int a ,int b) {
        return (a * b);
    }

    @Override
    public int mutliplication(int a, int b) {
        return 0;
    }

    public double division(int a, int b){
        return ((double) a / b);
    }

}
