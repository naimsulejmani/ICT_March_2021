package oop.ict.kosovo.growth.ushtrimi15_reflections;

import oop.ict.kosovo.growth.ushtrimi5_inheritance.Test;

import java.time.LocalDate;

public class TestSimple1 {
    public static void main(String[] args) {
        try {
            //load klasesn simple ne Class c
            //e lexon fajllion apo klasen Simple
            //kerkon komplet pathin - absolute package
            Class c = Class.forName("oop.ict.kosovo.growth.ushtrimi15_reflections.Simple");
            //tash mundemi me manevru klasen simple
            System.out.println(c.getName());
            Simple simple = new Simple();
            TestSimple1 t1 = new TestSimple1();
            printName(simple);
            printName(t1);

            Class booleanClass = boolean.class;
            Class intClass = int.class;
            Class simpleClass = Simple.class;
            Class testClass = TestSimple1.class;

            Class arrayClass = int[].class;

            System.out.println(booleanClass.getName());
            System.out.println(intClass.getName());
            System.out.println(simpleClass.getName());
            System.out.println(testClass.getName());

            System.out.println(Integer.class.getName());
            System.out.println(LocalDate.class.getName());
            System.out.println(arrayClass);

            System.out.println("Is Array an array: " + arrayClass.isArray());
            System.out.println("Is Array a primitive: " + arrayClass.isPrimitive());
            System.out.println("Is Array an interface: " + arrayClass.isInterface());
            System.out.println("Is boolean a primitive: " + booleanClass.isPrimitive());

            Class interfaceClass = My.class;
            System.out.println("Is an Interface an interface: " + interfaceClass.isInterface());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printName(Object o) {
        Class c = o.getClass();
        //Class c1 = s.getClass();
        System.out.println(" -> " + c.getName());
    }
}
