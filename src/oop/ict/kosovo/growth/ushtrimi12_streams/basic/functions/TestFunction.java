package oop.ict.kosovo.growth.ushtrimi12_streams.basic.functions;

import oop.ict.kosovo.growth.ushtrimi12_streams.basic.Product;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        Function<Product, Double> productToDoubleFunction = new Function<Product, Double>() {
            @Override
            public Double apply(Product product) {
                return product.getPrice();
            }
        };

        Function<Product, String> productToString = new Function<Product, String>() {
            @Override
            public String apply(Product product) {
                return product.toString();
            }
        };

        Function<Product, Integer> productNameToIntLength = new Function<Product, Integer>() {
            @Override
            public Integer apply(Product product) {
                return product.getName().length();
            }
        };


        double price = productToDoubleFunction.apply(new Product(1, "Coca Cola 2l", 1.50));
        String productString = productToString.apply(new Product(10, "Iphone X", 675));
        int lengthOfName = productNameToIntLength.apply(new Product(100, "AAAAAAAAAAAAAAA", 10));
        System.out.println(price);
        System.out.println(productString);
        System.out.println(lengthOfName);


    }
}
