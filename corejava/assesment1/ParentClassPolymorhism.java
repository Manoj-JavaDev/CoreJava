package corejava.assesment1;

public class ParentClassPolymorhism {

    public static void main(String[] args) {


        Animal1 a;
        a = new Dog();
        a.sound();
        a = new Cat1();
        a.sound();
    }
}


class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


