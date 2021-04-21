package oop.ict.kosovo.growth.ushtrimi5_inheritance.rocks;

//Elfte Totaj
public class Basalt extends IgneousRock{
    public Basalt(String color, double weight) {
        super(color, weight);
    }

    @Override
    public String toString() {
        return "Basalt" + super.toString();
    }
}
