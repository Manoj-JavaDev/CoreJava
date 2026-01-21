package corejava.assessment3;

public class StaticMethodsInsideInterface {

    public static void main(String[] args) {

        //Interface static methods are called using Interface name !!
        Calc.add(20,30);
        Calc.mul(30,543);
        Calc.mod(29,20);

    }


}

interface Calc {

    static void add(int a,int b){
        System.out.println("Sum of " + a + " and " + b + " is : " + (a + b));
    }
    static void mul(int a,int b){
        System.out.println("Multiplication of " + a + " and " + b + " is : " + (a * b));
    }
    static void mod(int a,int b){
        System.out.println("mod of " + a + " and " + b + " is : " + (a % b));
    }

}