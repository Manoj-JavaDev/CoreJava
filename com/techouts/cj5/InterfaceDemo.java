package com.techouts.cj5;

public class InterfaceDemo {

    public static void main(String[] args) {
        Quadrilateral s = new Square(10);
        System.out.println("Perimeter = " + s.perimeter());
        System.out.println("Area = " + s.area());
        Quadrilateral.show();
        Square.show();
        // Square sq;
        Quadrilateral.show();
    }

}

interface Quadrilateral {

    static void show(){
        System.out.println("This is first Static method!!");
    }
    int a = 10;
    default void showA() {
        System.out.println("" + Quadrilateral.a);
    }

    double area() ;
    int perimeter() ;

     // a = 200; throws compiler time error that it cant be modified because
    // interface variables are static , final , public
}

class Square implements Quadrilateral {

    int side ;
    Square(int side) {
        this.side = side;
    }
    public int perimeter() {
       return  side * side;
    }
    public double area() {
        return (side * side);
    }

    static void show(){
        System.out.println("This is second static method !!");
    }
}