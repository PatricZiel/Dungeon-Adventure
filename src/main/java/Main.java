import logic.entity.Hero;
import logic.entity.Room;
import logic.handler.RoomHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Hero hero = new Hero();
    static Room currentRoom;
    public static void main(String[] args) {
        try {
            initRooms();
            System.out.println("Seid gegrüst Reisender");
            startAdventure();
            System.out.println("Herzlich Willkommen " + hero.name + "!");
            System.out.println("Du befindest dich in einem Dungeon");
            System.out.println("Deine Aufgabe ist es aus dem Dungeon raus zu kommen");
            System.out.println("Du befindest dich zurzeit in Raum Nr. " + currentRoom.getNumber());
            System.out.println("In welchen Raum möchtest du gehen?");

            for (int i = 0; i < currentRoom.getRooms().size(); i++){
                System.out.println((i+1)+": Raum Nr. " + currentRoom.getRooms().get(i).getNumber());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*init Methoden*/
    private static void initRooms(){
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room(3);
        Room room4 = new Room(4);
        Room room5 = new Room(5);
        Room room6 = new Room(6);

        RoomHandler.addRoomBridge(room1, room2);
        currentRoom = room1;
    }

    /*Code blöcke*/
    private static void startAdventure() throws IOException {
        while (true) {
            System.out.println("Wie ist euer Name?");
            hero.name = br.readLine();

            System.out.println("Euer Name ist also " + hero.name + "?");
            System.out.println("1. Ja");
            System.out.println("2. Name neu eingeben");

            String decision = br.readLine();
            if(decision.equals("1")) {
                break;
            }
        }
    }
}