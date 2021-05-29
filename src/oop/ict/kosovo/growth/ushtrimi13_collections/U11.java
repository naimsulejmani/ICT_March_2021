package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class U11 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("11111111111111111111"));

        productList.add(new Product("Coca Cola 2l"));
        productList.add(new Product("ABC"));

        //test booolean
        productList.removeIf((p) -> p.getName().length() > 15);
        Predicate<Product> longName = (p) -> p.getName().length() > 15;

        productList.removeIf(longName);
        productList.removeIf(new LongProductNames());

        System.out.println(productList.size());

        //Collections
        Collections.sort(productList);
        Collections.reverse(productList);
        Collections.shuffle(productList);
        Collections.fill(productList,new Product("Z-Laptop"));

        //Collections.un
    }
}
