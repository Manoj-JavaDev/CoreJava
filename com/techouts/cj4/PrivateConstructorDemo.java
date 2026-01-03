package com.techouts.cj4;

public class PrivateConstructorDemo {

    public static void main(String args[]) {

        Bottle b1 = Bottle.getInstance();
        b1.capacity = 10;
        b1.color = "Red";

        System.out.println("Capacity = " + b1.capacity + "Color = " + b1.color);
        Bottle b = Bottle.getInstance();



        System.out.println("Capacity = " + b.capacity + "Color = " + b.color);

    }

}

class Bottle {
    int capacity;
    String color;

    public static Bottle bottleInstance;

    private Bottle() {
        System.out.println("Private Constructor !!");
    }

    public static Bottle getInstance() {
        if(bottleInstance == null)
        {
            bottleInstance = new Bottle();
        }

        return bottleInstance;
    }
}
