package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class U6_HashCode {
    public static void main(String[] args) {
        Product p1 = new Product("Llaptop");
        Product p2 = new Product("1234567");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        Set<Product> products = new HashSet<>();
        System.out.println(products.add(p1));
        System.out.println(products.add(p2));

        System.out.println(products.size());

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
