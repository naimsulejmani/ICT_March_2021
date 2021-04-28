package oop.ict.kosovo.growth.ushtrimi8_abstract;

public class TestShape {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        Shape sh1 = new Circle(5.5);
        Shape sh2 = new Rectangle(3, 4);

        System.out.println(sh1.getArea());
        System.out.println(sh2.getArea());
    }
}
