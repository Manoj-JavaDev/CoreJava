package corejava.assesment1;

public class StaticKeywordDemo {
    /*
        static is a keyword in java that is used to call variables and methods without creating object.
        When a variable or method is declared using static then all instances of a class shares a single copy of it .
     */

    static{
        System.out.println("This is a static block !"); // these are executed when class is loaded into the class.
    }

    static int a = 100;

    static void display() {
        System.out.println("This is a static method!!");
    }

    public static void main(String args[])
    {
        System.out.println("a  = " + a);
        display();//static method!!
    }

}
