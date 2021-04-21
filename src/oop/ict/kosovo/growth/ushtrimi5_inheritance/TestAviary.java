package oop.ict.kosovo.growth.ushtrimi5_inheritance;

public class TestAviary {
    public static void main(String[] args) {
        Aviary kafaz = new Aviary();

        WalkingBird wb = new WalkingBird("black", "x", "right left");
        FlyingBird fb = new FlyingBird("white", "y", "forward backward");

        Bird b1 = wb;
        Bird b2 = fb;

        System.out.println(wb.getFood() + " -> " + b1.getFood());
        System.out.println(fb.getFood() + " -> " + b2.getFood());


    }
}
