package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class U4 {
    public static void main(String[] args) {
        Product p1 = new Product("Buke");
        Product p2 = new Product("Uje");

        Deque<Product> productDeque1 = new ArrayDeque<>();
        productDeque1.add(p1);
        productDeque1.push(p2);

        productDeque1.add(null);


        productDeque1.offerFirst(p1);
        productDeque1.offerLast(p2);
        Product removeFirst = productDeque1.pollFirst();
        Product removeLast = productDeque1.pollLast();
        Product peekFirst = productDeque1.peekFirst();
        Product peekLast = productDeque1.peekLast();

        Deque<Product> productDeque2 = new ArrayDeque<>(productDeque1);
    }
}
