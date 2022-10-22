package logic.handler;

import logic.entity.Room;

public class RoomHandler {
    public static void addRoomBridge(Room first, Room second){
        first.getRooms().add(second);
        second.getRooms().add(first);
    }
}
