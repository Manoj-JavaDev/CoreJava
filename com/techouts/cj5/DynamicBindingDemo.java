package com.techouts.cj5;

public class DynamicBindingDemo {

    // Dynamic Method Dispatch & Dynamic Binding are same ,,,
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
        Parent c1 = new Child1();
        c1.show();
        Parent c2 = new Child2();
        c2.show();
        Parent c3 = new Child3();
        c3.show();

    }

}


class Parent {

    void show() {
        System.out.println("This is Parent Method");
    }

}

class Child1 extends Parent {
    void show() {
        System.out.println("This is child1 Method");
    }
}
class Child2 extends Child1 {
    void show() {
        System.out.println("This is child2 Method");
    }
}

class Child3 extends Child2 {
    void show() {
        System.out.println("This is Child3 Method");
    }
}