package hotelsManager;


import hotel.Hotel;
import hotel.HotelInterface;

import java.util.ArrayList;

//it mainly create hotel from the data extracted from the database about the hotel
public class HotelsManager {

    //hotel name
    private String hotelName;
    //place where the hotel located
    private String location;
    //motel or hotel or some specific information
    private String type;
    //as the rating describes the facilty provide by the hotel like swimmingpool and room facilty
    private int rating;
    //total number of rooms
    private int totalRooms;


    //all hotels reference are store in that room
    private ArrayList<HotelInterface> hotelInstances= new ArrayList<>();


    //constructor
    public HotelsManager(String hotelName , String location, String type, int star , int totalRooms) {
        this.hotelName = hotelName;
        this.location = location;
        this.type = type;
        this.rating = star;
        this.totalRooms = totalRooms;
    }


    //create hotels and add them in the total rooms
    private void createHotel() {
            HotelInterface hotel = new Hotel(hotelName , location , rating , totalRooms);
            hotelInstances.add(hotel);
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public int getRating() {
        return rating;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public ArrayList<HotelInterface> getHotelInstances() {
        return hotelInstances;
    }

}
