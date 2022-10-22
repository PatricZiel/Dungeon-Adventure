package logic.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Room {
    int number;
    List<Room> rooms = new ArrayList<>();

    public Room(int no){
        number = no;
    }

}
