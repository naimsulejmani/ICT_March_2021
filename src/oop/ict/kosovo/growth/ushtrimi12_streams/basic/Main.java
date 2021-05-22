package oop.ict.kosovo.growth.ushtrimi12_streams.basic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Lenovo X1 Gen10 8GBRAM", 1499.99));
        products.add(new Product(2, "Qumesht Kosovar", 0.99));
        products.add(new Product(3, "Iphone 12", 1299.99));

        //te behet zbrija per 10% per cdo produkt qe ka cmim me shume se 1000.
        //1. WHILE, DO...WHILE, FOR ose FOR_EACH
        for (Product p : products) {
            if (p.getPrice() >= 1000) {
                p.setDiscount(0.10);
            }
        }

        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("----------------------------");
        //ideja me stream
        products.stream().filter(p -> p.getPrice() >= 1000).forEach(p -> p.setDiscount(0.10));
       // products.stream().forEach(System.out::println);
        products.stream().forEach(p-> System.out.println(p));

    }
}
