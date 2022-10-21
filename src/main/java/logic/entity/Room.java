package main.java.logic.entity;

import java.util.ArrayList;
import java.util.List;

public class Room {
    public int number;
    public List<Room> rooms = new ArrayList<>();

    public Room(int no){
        number = no;
    }

}
