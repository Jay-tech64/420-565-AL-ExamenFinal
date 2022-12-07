package org.cal.examen;

import java.util.Random;

public class GameRunner {

    public static void main(String[] args) {
        Game aGame = new Game();

        aGame.add(new Player("Mathieu"));
        aGame.add(new Player("Samir"));
        aGame.add(new Player("Manolo"));

        Random rand = new Random();


        do {
            aGame.roll(rand.nextInt(5) + 1);

        } while (!aGame.wrongAnswer());

    }
}
