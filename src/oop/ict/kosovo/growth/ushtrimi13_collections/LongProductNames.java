package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.function.Predicate;

public class LongProductNames implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getName().length() > 15;
    }
}
