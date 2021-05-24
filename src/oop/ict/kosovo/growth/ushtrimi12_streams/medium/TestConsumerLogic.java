package oop.ict.kosovo.growth.ushtrimi12_streams.medium;

import oop.ict.kosovo.growth.ushtrimi12_streams.basic.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestConsumerLogic {
    public static void main(String[] args) {
        Consumer<Product> expireProduct = (p) -> p.setBestBefore(LocalDate.now());
        Consumer<Product> discountProduct = (p) -> p.setDiscount(0.10);

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Monte", 0.35, LocalDate.now()));
        products.add(new Product(2, "Laptop Lenovo X", 1199, LocalDate.now().plusYears(3)));
        products.add(new Product(3, "QUmesht", 1, LocalDate.now().plusDays(7)));

        Predicate<Product> filterPrice = (p)->p.getPrice()>1;

        products.stream().forEach(expireProduct.andThen(discountProduct).andThen(System.out::println));
        System.out.println("---------------------------");
        products.stream()
                .peek(expireProduct)
                .filter(
                      //  (p)->p.getPrice()>1
                        filterPrice.or(p->p.getName().contains("onte"))
                )
                .forEach(discountProduct.andThen(System.out::println));


    }
}
