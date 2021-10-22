package Ćwiczenia3;

import java.util.Random;

public class Zad5 {
    public static void main(String[] args) {
        int minPalacz = 200;
        int iPalacz = 1;

        while (iPalacz <= 10){
            int randomPalacz = (int) ((Math.random() * (100 - 1)) + 1);
            System.out.println(iPalacz + " wylosowana liczba wynosi: " + randomPalacz);
            if(randomPalacz < minPalacz)
                minPalacz = randomPalacz;
            iPalacz++;
        }
        System.out.println("Najmniejsza liczba wynosi: " + minPalacz);
    }
}
