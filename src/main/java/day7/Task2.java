package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player[] players = new Player[6];
        for (int index = 0; index < players.length; index++) {
            players[index] = new Player(90 + rand.nextInt(10));
            System.out.println(players[index].getStamina() + " ");
            Player.info();
        }
    }
}
