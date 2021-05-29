package roomsManagement;


import room.RoomInterface;

import java.util.ArrayList;

//this interface will use to track the total rooms
//rooms avilable .
//rooms booked list
//book a room
//delete a room
public interface RoomManagementInterface {

    public void totalRooms(int totalRooms);
    public ArrayList<RoomInterface> BookedRoomList();
    public int avilableRooms();
    public void bookARoom();
    public void deleteRoom();


}
