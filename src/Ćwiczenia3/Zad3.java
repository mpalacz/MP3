package Ćwiczenia3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad3 {
    public static void main(String[] args) throws IOException {
        float aPalacz;
        float bPalacz;
        float cPalacz;
        float deltaPalacz;
        float x1Palacz;
        float x2Palacz;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj a:");
        aPalacz = Float.parseFloat(br.readLine());

        if (aPalacz == 0){
            System.out.println("Wartośc a nie może być równa 0!");
        } else {
        System.out.println("Podaj b:");
        bPalacz = Float.parseFloat(br.readLine());

        System.out.println("Podaj c:");
        cPalacz = Float.parseFloat(br.readLine());
            byte liczbaPierwiastkowPalacz;
            deltaPalacz = (float) Math.pow(bPalacz, 2) - 4 * aPalacz * cPalacz;
            System.out.printf("Delta wynosi: %2.2f \n", deltaPalacz);
            if(deltaPalacz == 0)
                liczbaPierwiastkowPalacz = 1;
            else if(deltaPalacz < 0)
                liczbaPierwiastkowPalacz = 0;
            else
                liczbaPierwiastkowPalacz = 2;

            switch (liczbaPierwiastkowPalacz){
                case 0:
                    System.out.println("Delta jest mniejsza od zera!");
                    break;
                case 1:
                    x1Palacz = (-bPalacz + (float) Math.sqrt(deltaPalacz)) / (2 * aPalacz);
                    System.out.printf("Jedyny pierwiastek wynosi %2.2f", x1Palacz);
                    break;
                case 2:
                    x1Palacz = (-bPalacz + (float) Math.sqrt(deltaPalacz)) / (2 * aPalacz);
                    x2Palacz = (-bPalacz - (float) Math.sqrt(deltaPalacz)) / (2 * aPalacz);
                    System.out.printf("X1 wynosi: %2.2f \n", x1Palacz);
                    System.out.printf("X2 wynosi: %2.2f \n", x2Palacz);
            }
        }
    }
}
