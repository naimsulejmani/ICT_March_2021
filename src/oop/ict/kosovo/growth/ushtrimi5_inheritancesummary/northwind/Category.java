package oop.ict.kosovo.growth.ushtrimi5_inheritancesummary.northwind;

import java.util.ArrayList;

//data modeli - per category
public class Category {
    private int categoryId;
    private String name;
    private String description;
    private byte[] image;

    private ArrayList<Product> products;

    public Category() {

    }

    public Category(int categoryId, String name, String description, byte[] image) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
