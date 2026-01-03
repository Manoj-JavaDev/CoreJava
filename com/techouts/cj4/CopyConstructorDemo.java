package com.techouts.cj4;

public class CopyConstructorDemo {


    public static void main(String[] args) {

        Door d1 = new Door(10, 20, "Red");
        System.out.println(d1.getDoorDetails());

        Door d2 = new Door(20,30,"blue");

        System.out.println(d2.getDoorDetails());

        d1 = new Door(d2);

        System.out.println(d1.getDoorDetails());



    }


}

class Door {
    int length;
    int width;
    String color;

    Door(int length,int width, String color)
    {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    Door(Door anotherDoor) {
        this.length = anotherDoor.length;
        this.width = anotherDoor.width;
        this.color = anotherDoor.color;
    }

    public String getDoorDetails() {
        return ("Door Length = " + this.length + "\n" + "Door Width = " + this.width + "\n" + "Door Color = " + this.color);
    }
}
