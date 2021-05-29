package hotel;

import room.AddRoom;
import room.OneSeaterRoom;
import room.RoomInterface;
import room.TwoSeaterRoom;

import java.util.ArrayList;

public class Hotel implements HotelInterface{


    private int rating;
    private int allRooms;
    private String name;
    private String location;
    private int avialbleRooms;
    private double oneSeaterRoomCost = 1000;
    private double twoSeaterRoomCost = 2000;


    //constructor
    public Hotel(String name , String location , int rating , int totalRooms) {
        hotelName(name);
        location(location);
        rating(rating);
        totalRooms(totalRooms);
    }

    @Override
    public void hotelName(String name) {
        this.name = name;
    }

    @Override
    public void location(String location) {
        this.location = location;
    }

    @Override
    public void rating(int rating) {
        this.rating = rating;
    }

    @Override
    public void totalRooms(int rooms) {
        this.allRooms = rooms;
    }


    //all getter are below there

    public int getRating() {
        return rating;
    }

    public int getAllRooms() {
        return allRooms;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getAvialbleRooms() {
        return avialbleRooms;
    }

}









//new rooms are created there
//    @Override
//    public void BookRooms(int seaterRoom) {
//
//        //using command design pattern to add or remove a room from the arraylist of rooms
//        Command command = new AddRoom(rooms , avialbleRooms , seaterRoom);
//        avialbleRooms = command.execute();
//
//    }
