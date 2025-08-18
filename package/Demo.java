package demo;

import java.util.Random;

public class Demo {
    public int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}