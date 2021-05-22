package oop.ict.kosovo.growth.ushtrimi12_streams.basic.functions;

import oop.ict.kosovo.growth.ushtrimi12_streams.basic.Product;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<Product> productToConsume = new Consumer<Product>() {
            @Override
            public void accept(Product product) {

                System.out.println("Sa eshte cmimi i produktit");
                System.out.println(product);
                System.out.println("A ban pak am lire");
                product.setDiscount(0.05);
                System.out.println(product);
            }
        };

        productToConsume.accept(new Product(4, "Vaj 1l",2.10));

    }
}
