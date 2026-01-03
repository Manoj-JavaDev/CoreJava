package corejava.assesment1;

public class AbstractDemo {
    static void main(String[] args) {

        Rectangle rect = new Rectangle(3,2);
        System.out.println("Area of Rectangle = " + rect.area());
        System.out.println("Perimeter of Rectangle = " + rect.perimeter());
    }
}

class Rectangle extends Shape {

    int length;
    int breadth;
    Rectangle(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return (length * breadth);
    }
    int perimeter() {
        return (2 * (length + breadth));
    }


}

abstract class Shape {

    Shape() {
        System.out.println("Abstract classes allows Constructors and concrete methods!!!");
    }
    abstract double area();
    abstract int perimeter() ;

}
