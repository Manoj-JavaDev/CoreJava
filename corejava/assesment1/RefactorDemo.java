package corejava.assesment1;

public class RefactorDemo {
    static void main(String[] args) {
        Calculator11 c11 = new Calculator11();
        c11.calculate();
    }

}

class test {
    public int x;

    public void calc() {
        try {
            int a = 10/0;
        } catch(Exception e) {
        }
    }
}

/*
Class name not in PascalCase

Public field (breaks encapsulation)

Empty catch block

Poor method name

Magic number

Catching generic Exception
 */

class Calculator11 {

    private static final int DIVISOR = 0;

    public void calculate() {
        try {
            int result = 10 / DIVISOR;
        } catch (ArithmeticException exception) {
            System.err.println("Division by zero is not allowed");
        }
    }
}
/*

 */
