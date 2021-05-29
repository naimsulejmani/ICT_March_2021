package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class U10_HashMap {
    /*
        10 artikuj te ndryshem, edhe do te dhurohen tek shfrytezuesit
        Map<Product, Consumer>

        Product -> Review
        Map<Product, List<Review>> productReview
     */
    public static void main(String[] args) {
        Map<Product, Integer> products1 = new HashMap<>();//default capacity 16
        products1.put(new Product("A"), 1001);
        products1.put(new Product("B"), 5641);
        Product p1 = new Product("Caj");
        products1.put(p1, 1);
        products1.put(p1, 2);
        Map<Product, Integer> products2 = new HashMap<>(20);
        products2.putAll(products1);

        Set<Product> productSet = products1.keySet();
        Collection<Integer> integers = products1.values();

        for (Product p : products1.keySet()) {
            System.out.println(p);
            System.out.println(products1.get(p));
        }
        System.out.println("-------------------");
        for(Integer i: integers) {
            System.out.println(i);
        }


        Map<Product, Integer> products3 = Map.of(
                new Product("A"), 3,
                new Product("B"), 4
        );

        Integer value = products1.get(p1);
        Integer removedProductValue = products1.remove(p1);

        boolean existsKeys = products1.containsKey(p1);
        boolean existsValue = products1.containsValue(5641);

        System.out.println(products1.size());
        System.out.println(products2.size());

    }
}
