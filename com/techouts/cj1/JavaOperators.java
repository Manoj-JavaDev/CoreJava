package com.techouts.cj1;

public class JavaOperators {
    static void main(String[] args) {
        // Arithmetic Operators;
        // ( + , - , * , / , % )
        int a = 10;
        int b = 20;

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

        // Assignment Operators:
        // ( = , += , -= , *= , /= , %= )
        int sum = 0;
        sum += a;
        System.out.println("Sum += a " + sum);
        sum -= b;
        System.out.println("Sum -= b " + sum);
        System.out.println("Sum %= a " + sum);

        // Logical Operators:
        System.out.println("(a == b && a >= b)= " + ((a == b) && (a >= b)));
        System.out.println("(a > b) || (b > a))= " + ((a > b) || (b > a)));

        // Unary Operators:
        // ( + , - , ++, --)
        a++;
        System.out.println("a = " + a);
        b--;
        System.out.println("b = " + b);

        // Bitwise Operators:
        // ( | , & , ^ , >> , >>> , << )

        a = 2;
        b = 5;
        System.out.println("a | b = " + (a | b));
        System.out.println("a & b = " + (a & b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a >> b = " + (a >> b));
        System.out.println("a >>> b = " + (a >>> b));
        System.out.println("a << b = " + (a << b));

        // Ternary Operator
        // (Condition) ?  True:False

        System.out.println("a > b = " + ((a > b) ? "True" : "False"));



    }
}
