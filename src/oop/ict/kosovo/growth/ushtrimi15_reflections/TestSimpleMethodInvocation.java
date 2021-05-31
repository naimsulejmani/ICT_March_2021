package oop.ict.kosovo.growth.ushtrimi15_reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestSimpleMethodInvocation {
    public static void main(String[] args) {
        try {
            Class simpleClass = Class.forName("oop.ict.kosovo.growth.ushtrimi15_reflections.Simple");
            //kjo funksionon vetem me konstruktorin pa parametra - default
            //Object obj = simpleClass.newInstance();
            Constructor<Simple> constructor = simpleClass.getConstructor(String.class);
            Object o = constructor.newInstance("TEST");
            //kjo metode na kthen gjithe metoden
            //Method[] methods = simpleClass.getMethods();

           // Method messageWithoutParameter = simpleClass.getMethod("message");
            Method messageWithParameter = simpleClass.getMethod("message", String.class);
            //messageWithoutParameter.invoke(o);
            messageWithParameter.invoke(o,"NAIM");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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
