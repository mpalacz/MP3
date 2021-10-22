package Ćwiczenia3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zad1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float firstNumberPalacz;
        float secondNumberPalacz;

        System.out.println("Podaj pierwszą liczbę: ");
            firstNumberPalacz = Float.parseFloat(br.readLine());

            System.out.println("Podaj drugą liczbę: ");
            secondNumberPalacz = Float.parseFloat(br.readLine());

            System.out.println("Suma: " + (firstNumberPalacz + secondNumberPalacz));
            System.out.println("Różnica: " + (firstNumberPalacz - secondNumberPalacz));
            System.out.println(firstNumberPalacz + " * " + secondNumberPalacz + " = " + (firstNumberPalacz * secondNumberPalacz));
            System.out.println(firstNumberPalacz + " / " + secondNumberPalacz + " = " + (firstNumberPalacz / secondNumberPalacz));
            //zaokrąglić do dwóch miejsc po przecinku
    }
}
