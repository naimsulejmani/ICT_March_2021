package oop.ict.kosovo.growth.ushtrimi5_inheritance;

//klasasa gjeneralizuese
public class Bird extends Object {
    //nje enum per color
    private String color;
    //per food ndoshta eshte mire me kriju nje klase Food
    private String food;
    private String movement;

    //qe e kriju nje bird te ri pa parametra
    public Bird() {
    }

    public Bird(String color, String food, String movement) {
        this.color = color;
        this.food = food;
        this.movement = movement;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    @Override
    public String toString() {
        return "Bird -> " + super.toString();
    }
}
