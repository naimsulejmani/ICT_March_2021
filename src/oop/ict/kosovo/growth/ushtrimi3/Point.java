package oop.ict.kosovo.growth.ushtrimi3;

public class Point {
    //variablat instance
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /*

    double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

     */
    public static double distanceBetween(Point first, Point second) {
        double distance = Math.sqrt(
                Math.pow(second.getY() - first.getY(), 2)
                        +
                        Math.pow(second.getX() - first.getX(), 2)
        );

        return distance;
    }

    public double distanceTo(Point otherPoint) {
        double distance =
                Math.sqrt(
                        (otherPoint.getX() - x) * (otherPoint.getX() - x)
                                +
                        (otherPoint.getY() - y) * (otherPoint.getY() - y)
                );
        return distance;
    }


}
