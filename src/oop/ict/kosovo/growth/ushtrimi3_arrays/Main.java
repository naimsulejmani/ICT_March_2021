package oop.ict.kosovo.growth.ushtrimi3_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //deklarimi i vargut dhe krijimi i vargut
        //pasi eshte String secili element i saj mbushet me null
        String[] vargu = new String[100];

        //deklarimi i vargut
        int[] numrat;
        //krijimi i vargut
        //pasi eshte int - tip primitiv elementet e saj mbushen me 0
        numrat = new int[100];

        //inicializimi i vargut me vlera
        double[] pagat = {100.50, 2_000, 1_000.50, 500};

        double[] vlerat;

        vlerat = new double[]{100, 200, 300};


        Arrays.sort(pagat);

        for(double nr: pagat) {
            System.out.printf("%.2f, ",nr);
        }

        System.out.println();
    }
}
