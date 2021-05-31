package oop.ict.kosovo.growth.ushtrimi15_reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class MonitorConstrucotrs {
    public static void main(String[] args) {
        Class monitorClass = Monitor.class;
        Constructor[] montiConstructors = monitorClass.getConstructors();
        System.out.println("Total konstruktors: " + montiConstructors.length);

        //Monitor m = new Monitor(0,)

//        Constructor constructor = montiConstructors[0];
//        if (constructor != null) {
//            TypeVariable tv = constructor.getTypeParameters()[0];
//            System.out.println(tv);
//        }

        Arrays.stream(montiConstructors).forEach((c) -> System.out.println(
                c.getName() + " totalParams: " + c.getParameters().length+"-"+
                c.getParameters()));

    }
}
