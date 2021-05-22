package oop.ict.kosovo.growth.ushtrimi12_streams.basic;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStreamExample {
    public static void main(String[] args) {
//        IntStream.generate(()->(int) (Math.random()*10)).takeWhile(n->n!=3).forEach(n-> System.out.println(n));
        int sum = IntStream.generate(() -> (int) (Math.random() * 10)).takeWhile(n -> n != 3).sum();
        System.out.println(sum);

        var streamOfProduct = Stream.of(
                new Product(1, "A", 1),
                new Product(2, "B", 2),
                new Product(3, "C", 10));

        //streamOfProduct.forEach(p -> p.setPrice(100));
        // streamOfProduct.mapToDouble(p -> p.getPrice()).sum()
        System.out.println(streamOfProduct.mapToDouble(p -> p.getPrice()).sum());

        Product[] array = {new Product(87, "Course OOP", 99.99),
                new Product(99, "Course Web", 77.5)};

        Arrays.stream(array).filter(p -> p.getPrice() < 90).forEach(p -> p.setDiscount(0.15));


    }
}
