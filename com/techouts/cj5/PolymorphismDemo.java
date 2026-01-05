package com.techouts.cj5;

public class PolymorphismDemo {

    public static void main(String[] args) {
        A a = new A();

        // Method OverLoading !!
        a.display(19);
        a.display("Manoj");
        a.display(56387.7);

        A b = new B();// MethodOverriding !!
        b.display("karthik!!");


    }

}

class A {

    public void display(int a) {
        System.out.println("a = " + a);
    }

    public void display(String str) {
        System.out.println("String str = " + str);
    }

    public void display(double d) {
        System.out.println("Double d = " + d);
    }

}

class B extends A{

    public void display(String str){
        System.out.println("Overridden String method!!" + str);
    }

}



