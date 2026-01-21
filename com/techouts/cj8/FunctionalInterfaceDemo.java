package com.techouts.cj8;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        FuncInterface fi = (x) -> System.out.println("x ^ 2 = " + (x * x));
        FuncInterface.display();

        fi.power(10);
        fi.power(100);

        ZeroParameter zp = () -> System.out.println("This is Zero Parameter Lambda Expression !!");



        Calculator add = (a,b) -> a + b;
        System.out.println("Addition of a and b = " + add.operation(10,20));
        Calculator subtract = (a,b) -> a - b;
        Calculator multiply = (a,b) -> a * b;
        Calculator division = (a,b) -> a / b;
        Calculator mod = (a,b) -> a % b;

        System.out.println("Subtraction of A and B = " + subtract.operation(20,10));
        System.out.println("Multiplication of A and B = " + multiply.operation(10,5));
        System.out.println("Division of  A and B = " + division.operation(100,10));
        System.out.println("Mod of A and B = " + mod.operation(10,20));


    }

}

interface ZeroParameter {

     void display() ;

}

interface Calculator {
    int operation(int a,int b);
}

interface FuncInterface {

    static void display() {
        System.out.println("This is Default method in FuncInterface !");
    }

    void power(int x);

}