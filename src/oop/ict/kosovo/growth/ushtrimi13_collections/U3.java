package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.HashSet;
import java.util.Set;

public class U3 {
    public static void main(String[] args) {
        Product p1 = new Product("Buke");
        Product p2 = new Product("Uje");

        Set<Product> set1 = new HashSet<>();//ArrayList default capacity 10, HashSet 16
        set1.add(p1);
        set1.add(p2);
        set1.add(null);
        set1.add(null);
        set1.add(p1);
        set1.add(new Product("Buke"));
        set1.add(new Product("Uje"));
        Set<Product> set2 = new HashSet<>(set1);

        Set<Product> set3 = Set.of(p1, p2, new Product("A"), new Product("A"));


        System.out.println("SET 1 = " + set1.size());
        System.out.println("SET 2 = " + set2.size());
        System.out.println("SET 3 = " + set3.size());
    }
}
