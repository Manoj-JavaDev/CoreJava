package com.techouts.cj5;

public class FinalKeywordDemo {
    public static void main(String[] args) {
        X x =new X();
        x.getAX();
        x.display();
        Y y = new Y();
        y.getAY();
        y.display();
    }
}
// final class X
class X {
    final int a = 10;
    final void display(){
        System.out.println("This is display method in class X");
    }
    void getAX() {
        System.out.println("a value in X = " + this.a);
    }
}
// Final Classes can't be overridden !!
class Y extends X{
    int a = 24;
    // Final methods can't be overridden
    /*final void display(){
        System.out.println("This is display method in class Y ");
    }*/

    void getAY() {
        System.out.println("a value in Y = " +this.a);
    }
}