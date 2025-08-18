
package main;

import demo.Demo;

public class Main {
    public static void main(String[] args) {
        Demo generator = new Demo();
        int number = generator.getRandomNumber(1, 10);
        System.out.println("Your lucky number today is: " + number);
    }
}