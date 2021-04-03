package basic.ict.kosovo.growth;

import java.util.Scanner;

public class SentinelExample {
    public static void main(String[] args) {
        final int SENTINEL = 0;
        Scanner reader = new Scanner(System.in);
        long sum = 0;
        int numri;
        System.out.println("Shkruaj nje numer (0 per dalje)");
        numri = reader.nextInt();

        while (numri != 0) {
            sum += numri;
            System.out.println("Shkruaj nje numer (0 per dalje)");
            numri = reader.nextInt();
        }

        System.out.println(sum);

        double num = 2.0;

        final double TOLEREANCE = 0.00001;
        double a = 1.7999999999;
        double b = 1.8;

        if(Math.abs(a-b)<TOLEREANCE)
            System.out.println("Vlerat jane te barabtare");
        else System.out.println("vlerat sjane te barabarta");


        while (num != 0.0  && num>-1) {
            System.out.println(num);
            num = num - 0.1;
        }

    }
}
