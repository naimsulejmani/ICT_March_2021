package basic.ict.kosovo.growth;

import java.util.Scanner;

public class ArrayBasicExample {
    public static void main(String[] args) {
        //deklarimi i vargut
        int[] numrat;

        //inicializimi i vargut
        numrat = new int[100];
        //pasi te inicializohen rezervohet vend ne memorien heap->
        //dhe adresa ruhet tek variabla numrat (0x123FA)
        //pamja e rezervimit [0,0,0,...,0]


        String[] emrat = new String[100];

        int numratori[] = new int[100];

        double[] pagat = {100.5, 200.3, 500.79, 100.67};
        pagat = new double[]{1000.90, 2000.4, 3000};


        pagat= new double[500_000_000];

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();

    }
}
