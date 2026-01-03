package corejava.assesment1;

public class SingleInheritance {

    static void main(String[] args) {

        Cat c = new Cat("pluto");
        c.sound();

    }

}

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal{

    Cat(String name){
        super(name);
    }
    // System.out.println("Cat extends Animal");

}