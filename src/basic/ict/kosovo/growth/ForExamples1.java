package basic.ict.kosovo.growth;

import java.util.Scanner;

public class ForExamples1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin per faktoriel: ");
        int x = reader.nextInt();
        long factoriel = 1;

        for (int counter = 1; counter <= x; counter++) {
            factoriel = factoriel * counter;
        }

        System.out.printf("Vlera e factorielit te numrit %d eshte: %d%n",
                x, factoriel);

        factoriel = 1;
        for (int counter = x; counter >= 1; counter--) {
            factoriel *= counter; //compound operatori
        }
        System.out.printf("Vlera e factorielit te numrit %d eshte: %d%n",
                x, factoriel);

    }
}
