package com.techouts.cj4;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Car1 obj = new Car1(); // Triggers all constructors in order
    }
}

class Vehicle1 {
    Vehicle1() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle1 {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
class Car1 extends FourWheeler {
    Car1() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

