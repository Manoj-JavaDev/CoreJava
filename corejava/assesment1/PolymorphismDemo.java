package corejava.assesment1;

public class PolymorphismDemo {

    /* Method Overloading - Having multiple methods in a same class with same name but difference in parameter.
       Method Overriding - Writing a superclass method with same name & parameters again in subclass with new implementation.
     */
    static void main(String[] args) {


        Addition addition = new Addition();


        System.out.println(addition.add(2, 3));
        System.out.println(addition.add(2, 3, 4));
        addition.method();

        Calculator calc = new Calculator();
        calc.method();


    }

}

class Addition{

    int a;
    int b;
    int c;

    public int add(int a , int b) {
        return a + b;
    }

    public int add(int a, int b, int c){
        return (a + b + c);
    }

    void method()
    {
        System.out.println("It is a super class method!!");
    }

}

class Calculator extends Addition {

    void method() {
        System.out.println("It is a subclass method!!");
    }

}