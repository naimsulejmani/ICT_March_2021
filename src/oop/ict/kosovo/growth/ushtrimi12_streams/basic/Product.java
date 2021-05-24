package oop.ict.kosovo.growth.ushtrimi12_streams.basic;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private double price;

    private LocalDate bestBefore;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, double price, LocalDate bestBefore) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.bestBefore = bestBefore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        //nese % eshte me e madhe se 1(100%) dhe me e vogel 0 (negative)
        if (discount > 1 || discount < 0) return;
        //azhurno cmimin pas zbritjes
        this.price = this.price - this.price * discount;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return String.format("%d - %s: %.2f%n, use before: %s", id, name, price, bestBefore);
    }
}
