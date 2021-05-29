package room;

import hotel.Command;

import java.util.ArrayList;

public class AddRoom implements Command {

    private ArrayList<RoomInterface> rooms = null;
    private int avilableRoom;
    private int seaterRoom;


    public  AddRoom(ArrayList<RoomInterface> rooms , int avilableRoom , int seaterRoom) {
        this.avilableRoom = avilableRoom;
        this.rooms = rooms;
        this.seaterRoom = seaterRoom;
    }

    @Override
    public int execute() {
        if(avilableRoom > 0) {
            RoomInterface roomBooked = null;
            if(seaterRoom == 1) {
                roomBooked = new OneSeaterRoom();
            }
            else if(seaterRoom == 2) {
                roomBooked = new TwoSeaterRoom();
            }

            rooms.add(roomBooked);
            avilableRoom--;
        }
        else {
            System.out.println("not enough room avilable");
        }
        return avilableRoom;
    }
}
