package oop.ict.kosovo.growth.ushtrimi5_inheritance;

public class WalkingBird extends Bird {

    public WalkingBird() {
        super();
    }

    public WalkingBird(String color, String food, String movement) {
        super(color, food, movement);
        int i=10;
    }

    @Override
    public String toString() {
        return "WalkingBird ->" + super.toString();
    }
}
