package oop.ict.kosovo.growth.ushtrimi15_reflections;

public class Monitor {
    private int id;
    protected String model;
    String description;
    public double price;
    public Monitor() {
    }

    //access modifier, nje emer (construcotr) liste me parametera
    // ka tipin e vet, edhe default, mundet me pass annotations
    public Monitor(int id, String model, String description, double price) {
        this.id = id;
        this.model = model;
        this.description = description;
        this.price = price;
    }

    public Monitor(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    //REFLECTION -> CLASS<T>, METHOD, FIELD, CONSTRUCTOR,...
    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
