package corejava.assessment3;

public class CustomFunctionalInterface {

    static void main(String[] args) {

        Calculator add = (a,b) -> (a + b);
        System.out.println("Addition of two numbers is = " + (add.operation(20,20)));

        Calculator multiply = (a,b) -> (a * b);
        System.out.println("Multiplication of two numbers is  = " + (multiply.operation(2,3)));

    }

}

interface Calculator {

    public int operation(int a,int b);

}
