package Ćwiczenia3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float heightPalacz;
        float weightPalacz;
        float bmi;

        System.out.println("Podaj swój wzrost (w metrach)");
        heightPalacz = Float.parseFloat(br.readLine());

        System.out.println("Podaj swoją masę");
        weightPalacz = Float.parseFloat(br.readLine());

        bmi = (float) (weightPalacz / Math.pow(heightPalacz, 2));
        System.out.printf("BMI wynosi: %2.2f \n", bmi);

        if (bmi < 16f)
            System.out.println("Wygłodzenie");
        else if (bmi >= 16f && bmi <= 16.99f)
            System.out.println("Wychudzenie");
        else if (bmi >= 17f && bmi <= 18.49f)
            System.out.println("Niedowaga");
        else if (bmi >= 18.5f && bmi <= 22.99f)
            System.out.println("Norma niski przedział");
        else if (bmi >= 23f && bmi <= 24.99f)
            System.out.println("Norma wysoki przedział");
        else if (bmi >= 25f && bmi <= 27.49f)
            System.out.println("Nadwaga niski przedział");
        else if (bmi >= 27.5f && bmi <= 29.99f)
            System.out.println("Nadwaga wysoki przedział");
        else if (bmi >= 30f && bmi <= 34.9f)
            System.out.println("Otyłość I stopnia");
        else if (bmi >= 35f && bmi <= 39.9f)
            System.out.println("Otyłość II stopnia");
        else
            System.out.println("Otyłość III stopnia");
    }
}
