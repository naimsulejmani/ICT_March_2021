package oop.ict.kosovo.growth.ushtrimi12_streams.basic.functions;

import oop.ict.kosovo.growth.ushtrimi12_streams.basic.Product;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Product> unaryOperatorDiscount10Percent
                = new UnaryOperator<Product>() {
            @Override
            public Product apply(Product product) { //product.setDiscount(0.10); return product;
                Product newProduct = new Product(product.getId(), product.getName(), product.getPrice());
                newProduct.setDiscount(0.10);
                return newProduct;
            }
        };

        UnaryOperator<Product> uoDiscountSameProduct10Percent =
                (p) -> {
                    p.setDiscount(0.10);
                    return p;
                };

        //Shkruani te njejten duke perdore interface-in functional Function<T,R>
        Function<Product, Product> functionAsUnaryOperator10PercentDiscount
                = new Function<Product, Product>() {
            @Override
            public Product apply(Product product) {
                product.setDiscount(0.10);
                return product;
            }
        };
        Function<Product, Product> lambda1 = (p) -> {
            p.setDiscount(0.10);
            return p;
        };

        Product p = uoDiscountSameProduct10Percent.apply(
                new Product(1,"1 liter qumesht",1.00)
        );
        System.out.println(p);

    }
}
