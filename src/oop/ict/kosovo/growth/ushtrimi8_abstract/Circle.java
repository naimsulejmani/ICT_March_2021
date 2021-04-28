package oop.ict.kosovo.growth.ushtrimi8_abstract;

public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        System.out.println("Circle constructor called!");
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getDiameter() {
        return 2 * r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
