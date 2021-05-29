package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private static int autoId = 0;
    private int id;
    private String name;

    public Product(String name) {
        this.name = name;
        this.id = ++autoId;
    }

    public static int getAutoId() {
        return autoId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%d - %s", id, name);
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }

//    @Override
//    public int hashCode() {
//        return name.length();
//    }

//    @Override
//    public boolean equals(Object o) {
//        Product product = (Product) o;
//        return this.hashCode() == product.hashCode();
//    }
}
