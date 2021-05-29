package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class U1 {
    public static void main(String[] args) {
        Product p1 = new Product("Caj");
        Product p2 = new Product("Kafe");
        System.out.println(p1);
        System.out.println(p2);

        List<Product> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);

        List<Product> list2 = new ArrayList<>(list1);
        List<Product> list3 = new ArrayList<>(20); //
        list3.addAll(list2);

        Set<Product> productSet = new HashSet<>();
        productSet.add(p1);
        productSet.add(p2);

        List<Product> list4 = new ArrayList<>();
        list4.addAll(productSet);

        List<Product> list5 = List.of(p1,p2,new Product("A"), new Product("B"));

        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println(list3.size());
        System.out.println("SET = " + productSet.size());
        System.out.println(list4.size());

        p1.setName("Caj mente");
        System.out.println(list5.size());


    }
}
