package com.techouts.cj5;

public class ThisKeywordDemo {

    public static void main(String[] args) {
        // this is used to call current class members
        // super is used to call super class members

        SuperClass sp = new SubClass(10,20);
        SuperClass sp1 = new SuperClass(9,11);

    }

}

class SuperClass {

    int a = 40;
    int b = 40;

    SuperClass(int a,int b) {
        System.out.println("This is a SuperClass Constructor!");
        show();
        this.a = a;
        this.b = b;
        show();
    }

    void show() {
        System.out.println("a = " + this.a + "\n" + "b = " + this.b);
    }

}
class SubClass extends SuperClass{

    SubClass(int a,int b) {
        super(a,b);
        System.out.println("This is child Class Constructor !!!");
    }
}
