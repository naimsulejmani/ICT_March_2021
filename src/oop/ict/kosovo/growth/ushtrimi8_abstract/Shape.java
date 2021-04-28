package oop.ict.kosovo.growth.ushtrimi8_abstract;

public abstract class Shape {
    private int id;
    public Shape(){
        System.out.println("Shape Constructor called!");
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
