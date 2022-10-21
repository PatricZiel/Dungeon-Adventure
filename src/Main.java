import main.java.logic.entity.Hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            Hero hero = new Hero();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Seid gegrüst Reisender");
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}