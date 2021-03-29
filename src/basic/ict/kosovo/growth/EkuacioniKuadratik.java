package basic.ict.kosovo.growth;

import java.util.Scanner;

public class EkuacioniKuadratik {
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj vleren e A = ");
        a = reader.nextDouble();

        System.out.println("Shkruaj vleren e B = ");
        b = reader.nextDouble();

        System.out.println("Shkruaj vleren e C = ");
        c = reader.nextDouble();

        // 3x^2 - 6x + 2 = 0
        // operatori ternar ?:
        System.out.printf("%.2fx^2 %s %.2fx %s %.2f = 0 ",
                a,
                b < 0 ? "-" : "+",
                Math.abs(b),
                c < 0 ? "-" : "+",
                Math.abs(c)
        );

        // x1 = (-b+Math.sqrt(b*b-4*a*c)) / (2*a)
        // x2 = (-b-Math.sqrt(b*b-4*a*c)) / (2*a)

        //dallori - diskriminanta
        double discriminant = Math.sqrt(b * b - 4 * a * c);

        x1 = (-b + discriminant) / (2 * a);
        x2 = (-b - discriminant) / (2 * a);

        System.out.printf("%nx1 = %.2f %nx2 = %.2f", x1, x2);

        if (false) {
            int x = 100;

        }

        if (true)
            System.out.println("asdsadd");

        System.out.println("Nice to see you again!");

    }

}
