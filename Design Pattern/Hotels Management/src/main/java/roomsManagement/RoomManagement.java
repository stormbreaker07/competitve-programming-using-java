package roomsManagement;



import hotel.HotelInterface;
import room.RoomInterface;

import java.util.ArrayList;

public class RoomManagement implements RoomManagementInterface{

    private HotelInterface hotel = null;
    private int avilableRoom;
    private int totalRoom;
    private ArrayList<RoomInterface> rooms = new ArrayList<>();


    public RoomManagement(HotelInterface hotel) {
        this.hotel = hotel;
    }


    @Override
    public void totalRooms(int totalRoom) {
        this.totalRoom = totalRoom;
        this.avilableRoom = totalRoom;
    }

    @Override
    public ArrayList<RoomInterface> BookedRoomList() {
        return this.rooms;
    }

    @Override
    public int avilableRooms() {
        return 0;
    }

    @Override
    public void bookARoom() {

    }

    @Override
    public void deleteRoom() {

    }
}
