package oop.ict.kosovo.growth.ushtrimi15_reflections;

public class TestConstructors {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("oop.ict.kosovo.growth.ushtrimi15_reflections.Simple");
            Object o = c.newInstance();
            System.out.println(o);


            if (o instanceof Simple) {
                Simple simple = (Simple) o;
                simple.message();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
