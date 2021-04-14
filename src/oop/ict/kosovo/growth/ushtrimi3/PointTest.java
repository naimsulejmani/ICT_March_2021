package oop.ict.kosovo.growth.ushtrimi3;

public class PointTest {
    public static void main(String[] args) {
        Point pikaA = new Point(2, 3);
        Point pikaB = new Point(1, 1);

        double distancePrejAneB = Point.distanceBetween(pikaA, pikaB);
        System.out.printf("%.2f%n", distancePrejAneB);

        System.out.printf("%.2f%n", pikaA.distanceTo(pikaB));
    }

}
