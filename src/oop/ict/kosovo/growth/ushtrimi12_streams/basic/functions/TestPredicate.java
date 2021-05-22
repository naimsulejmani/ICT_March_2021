package oop.ict.kosovo.growth.ushtrimi12_streams.basic.functions;

import oop.ict.kosovo.growth.ushtrimi12_streams.basic.Product;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        //Klase anonime
        Predicate<Product> priceGreaterThan10 = new Predicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.getPrice() > 10;
            }
        };
        //klasa anonime e konvertuar ne lambda Expression
        Predicate<Product> priceLessThan10 = (p) -> p.getPrice() < 10;

        System.out.println(
                priceLessThan10.test(new Product(3, "Coca Cola", 1.50))
        );

        System.out.println(
                priceGreaterThan10.test(new Product(3, "Coca Cola", 1.50))
        );
        //10 minuta kohe -> nese nevoitet me shume me njoftoni

        //1. Shkruani predicate per String i cili na tregon se Stringu a permban fjalen
        //ict | ICT

        //2. Shkruani predicating per Integer i cili na tregon se a eshte numri tek


        //Enis Bajrami
        Predicate<Integer> numberIsOdd = num -> num % 2 != 0;

//        Predicate<Integer> numberIsOdd = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer num) {
//                return num % 2 != 0;
//            }
//        };

        System.out.println(numberIsOdd.test(14));
        Predicate<String> containsWord = t -> t.toLowerCase().contains("ict");

//        Predicate<String> containsWord = new Predicate<String>() {
//            @Override
//            public boolean test(String t) {
//                return t.toLowerCase().contains("ict");
//            }
//        };

        System.out.println(containsWord.test("This senctence has 'ict' in it!"));


    }
}
