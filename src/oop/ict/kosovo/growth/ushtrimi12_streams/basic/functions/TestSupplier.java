package oop.ict.kosovo.growth.ushtrimi12_streams.basic.functions;

import oop.ict.kosovo.growth.ushtrimi12_streams.basic.Product;

import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestSupplier {
    public static void main(String[] args) {
        Supplier<Integer> supplyRandomNumberTill1000 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 1000);
            }
        };

        System.out.println(supplyRandomNumberTill1000.get());
        System.out.println(supplyRandomNumberTill1000.get());
        System.out.println(supplyRandomNumberTill1000.get());

        Supplier<Product> supplyProductFromUser =
                () -> {
                    Scanner reader = new Scanner(System.in);
                    System.out.println("Shkruaj numrin e artikullit: ");
                    int nr = reader.nextInt();
                    System.out.println("Shkruaj cmimin e artikullit:");
                    double price = reader.nextDouble();

                    return new Product(nr, "Artikulli " + nr, price);

                };

//        Product p1 = supplyProductFromUser.get();
//        Product p2 = supplyProductFromUser.get();
//
//        System.out.println(p1);
//        System.out.println(p2);

        Stream.generate(supplyProductFromUser).limit(3).forEach(System.out::println);
    }
}
