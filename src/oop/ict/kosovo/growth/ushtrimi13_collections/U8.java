package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.Vector;

public class U8 {
    public static void main(String[] args) {
        Vector<Product> productVector = new Vector<>();
        productVector.add(new Product("A"));
        productVector.add(new Product("B"));
        Product[] p = new Product[2];
        productVector.copyInto(p);
    }
}
