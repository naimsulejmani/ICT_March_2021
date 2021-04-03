package basic.ict.kosovo.growth;

import java.util.Scanner;

public class UshtrimeMeMetoda {
    public static void main(String[] args) {
//        printOk();
//        print("Printo dicka!");
//        Scanner reader = new Scanner(System.in);
//        print(reader.nextLine());
//
//        cbere();
//        int x = lexoVleren();

        zbritja(10, 20);
        System.out.println(deduction(20, 30));
        // shtypAlfabetinAnglez();

        shtypAlfabetinAnglez(false);
        System.out.println();
        shtypAlfabetin(true);
    }

    static void shtypAlfabetinShqip() {
        char[] shkronjat = {'a', 'b', 'c', 'ç'};
        for (char shkronje : shkronjat) {
            System.out.printf("%3s", shkronje);
        }
    }

    static void shtypAlfabetinAnglez() {
        for (char shkronja = 'a'; shkronja <= 'z'; shkronja++) {
            System.out.printf("%3s", shkronja);
        }
    }

    static void shtypAlfabetinAnglez(boolean printToLowerCase) {
        if (printToLowerCase) {
            shtypAlfabetinAnglez();
        } else {
            for (char shkronja = 'A'; shkronja <= 'Z'; shkronja++) {
                System.out.printf("%3s", shkronja);
            }
        }
    }


    static void shtypAlfabetin(boolean printToLowerCase) {
        char start = printToLowerCase ? 'a' : 'A';
        char end = printToLowerCase ? 'z' : 'Z';

        for (; start <= end; start++) {
            System.out.printf("%3s", start);
        }
    }

    static double deduction(double a, double b) {
        return a - b;
    }

    static void zbritja(double a, double b) {
        System.out.printf("%.2f - %.2f = %.2f%n", a, b, a - b);
    }

    private static int lexoVleren() {
        return 10;
    }

    private static void cbere() {
        System.out.println("cbere!");
    }

    static void printOk() {
        System.out.println("OK!");
    }

    static void print(String mesazhi) {
        System.out.println(mesazhi);
    }
}
