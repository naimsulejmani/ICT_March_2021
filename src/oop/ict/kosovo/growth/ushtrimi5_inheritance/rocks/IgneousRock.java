package oop.ict.kosovo.growth.ushtrimi5_inheritance.rocks;

//Elfete Totaj
public class IgneousRock extends Rock {

    public IgneousRock(String color, double weight) {
        super(color, weight);
    }

    @Override
    public String toString() {
        return "IgneousRock ->" +super.toString();
    }
}
