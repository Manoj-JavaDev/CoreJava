package corejava.assesment1;

public class OperatorsDemo {
    public static void main(String args[]) {

        /* Operators are used to perform various operations on operands
         Types of operators in java are:
            1) Arithmetic Operators
            2) Relational Operators
            3) Assignment Operators
            4) Logical Operators
            5) Unary Operators
            6) Bitwise Operators
            7) instanceof operator
            8) Ternary Operators
        */

        // Arithmetic Operators
        // ( + , - , * , / , % )

        int a = 10;
        System.out.println("a = " + a);
        int b = 20;
        System.out.println("b = " + b);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        // ( > , < , >= , <= , == , != )
        if(a > b)
        {
            System.out.println("a is bigger than b");
        }

        if(a == b){
            System.out.println("Both a and b are equal");
        }

        if(a != b) {
            System.out.println("Both are not equal");
        }

        if(a < b)
        {
            System.out.println("a is smaller than b");
        }
        // Logical Operators are used used to evaluate two or more relational expressions
        // ( && , || , !)
        System.out.println("(a == b && a >= b)= " + ((a == b) && (a >= b)));
        System.out.println("(a > b) || (b > a))= " + ((a > b) || (b > a)));
    }
}
