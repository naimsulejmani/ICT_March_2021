package oop.ict.kosovo.growth.ushtrimi5_inheritance.rocks;


//kodi nga Elfete Totaj
public class Rock {
    private String color;
    private double weight;

//    public Rock() {
//    }

    public Rock(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Rock" + " : " + color + " - " + weight;
    }
}
