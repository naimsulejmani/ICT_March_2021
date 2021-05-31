package oop.ict.kosovo.growth.ushtrimi15_reflections;

import oop.ict.kosovo.growth.ushtrimi8_abstract.Rectangle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestConstructors1 {
    public static void main(String[] args) {
        try {
            //Gjej konstrukotrin i cili ka nje parameter te tipit string
            Constructor<Simple> constructor = Simple.class.getConstructor(String.class);
            Simple simple = constructor.newInstance("Naim");
            simple.message();


            Constructor<Rectangle> rectangleConstructor = Rectangle.class.getConstructor(double.class, double.class);
            Rectangle rectangle = rectangleConstructor.newInstance(3.5,2);
            System.out.println(rectangle.getArea());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
