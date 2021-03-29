package ict.kosovo.growth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //
        System.out.println("Shkruaj nje numer: ");
        int nr = reader.nextInt();
        System.out.println("Ju keni zgjedhur: " + nr);
        double rnd = Math.random();
        System.out.println("RND = " + rnd);
        //Numer i plote prej 0 deri ne N-1;
        int nrRand = (int) (rnd * nr);
        System.out.println("Numri random eshte: " + nrRand);
        //CTRL + ALT + L
        System.out.printf("Numri random prej 0 deri me %d eshte %d%n",nr-1,nrRand);
        System.out.println("Numri randon prej 0 deri me "+(nr-1)+" eshte "+nrRand);
        double x = 1.26;
        System.out.println(x);

    }
}






