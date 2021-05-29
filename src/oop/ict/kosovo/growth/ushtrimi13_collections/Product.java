package oop.ict.kosovo.growth.ushtrimi13_collections;

public class Product {
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
}
