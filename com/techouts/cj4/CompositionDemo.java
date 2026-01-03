package com.techouts.cj4;

import java.util.ArrayList;

public class CompositionDemo {
    public static void main(String[] args) {
        Apartment apt = new Apartment("Srinivasa Apartments");
        apt.addRoom("Rakesh-Room",2000000);
        apt.addRoom("Karthik-Room",300000);

        for(Room room : apt.getRoomList()) {
            System.out.println(room.getRoomDetails());
        }
    }
}

class Apartment {
    String apartmentName;

    ArrayList<Room> roomList ;
    Apartment(String apartmentName){
        this.apartmentName = apartmentName;

        roomList = new ArrayList<>();
    }

    void addRoom(String roomName,int price) {
        roomList.add(new Room(roomName,price));
    }

    ArrayList<Room> getRoomList() {
        return this.roomList;
    }
}

class Room {
    String roomName;
    int price ;

    Room(String roomName,int price) {
        this.roomName = roomName;
        this.price = price;
    }

    String getRoomDetails(){
        return "Room Name = " + this.roomName + "Room Price = " + this.price;
    }

}