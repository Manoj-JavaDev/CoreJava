package com.techouts.cj5;

public class AbstractionDemo {

    public static void main(String[] args) {
        MilkBottle mb = new MilkBottle("Blue");
        System.out.println(mb.color);
        mb.capacity();
        MilkBottle.price();
    }

}

abstract class Bottle {
    String color;
    Bottle(String color)
    {
        this.color = color;
    }

    void cap() {
        System.out.println("All bottles have cap !!");
    }

    static void price() {
        System.out.println("Bottles have price upto 200 only ");
    }

    abstract void capacity();

}

class MilkBottle extends Bottle {

    @Override
    void capacity() {
        System.out.println("Milk Bottle has capacity of 2 Litres!!");
    }

    MilkBottle(String color) {
        super(color);
    }
}



