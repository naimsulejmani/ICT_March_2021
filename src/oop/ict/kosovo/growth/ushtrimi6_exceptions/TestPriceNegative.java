package oop.ict.kosovo.growth.ushtrimi6_exceptions;

import java.util.Scanner;

public class TestPriceNegative {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruaj cmimin e produktit: ");
        double price = reader.nextDouble();

        if (price < 0) try {
            throw new PriceNegativeException("Cmimi eshte negative "+price+"!!!");
        } catch (PriceNegativeException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Cmimi i zgjedhur eshte: " + price);
    }
}
