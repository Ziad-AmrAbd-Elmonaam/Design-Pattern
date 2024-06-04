package FactoryMethod;

import java.util.Random;

public class Game {
    static Random random = new Random();

    public static void main(String[] args) {

        int loop =5;
        while (loop > 0) {
            Character character =  CharacterFactory.createEnemy(getRandomNumber(1,2));
            character.showUp();
            loop--;
        }

    }
    public static int getRandomNumber(int min, int max) {
        return  random .nextInt(max - min + 1) + min;
    }
}
