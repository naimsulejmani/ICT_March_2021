package oop.ict.kosovo.growth.ushtrimi15_reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class MonitorReflection {
    public static void main(String[] args) throws NoSuchFieldException {
        Class monitorClass = Monitor.class;
        Class dellMonitor = DellMonitor.class;

        Field[] fields = monitorClass.getFields();
        Field[] declaredFields = monitorClass.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.printf("%s %s %s;%n",
                    Modifier.toString(field.getModifiers())
                    ,
                    field.getType(), field.getName());
        }

        System.out.println("<select>");
        for (Field field : declaredFields) {
            System.out.printf("<option value='%s'>%s</option>%n", field.getName(), field.getName());
        }
        System.out.println("</select>");


        Field priceField = monitorClass.getField("price");

        System.out.println(priceField.getName());
        System.out.println(priceField.getType());
        System.out.println(priceField.getModifiers());


        System.out.println(fields.length + " --- " + dellMonitor.getFields().length);
        System.out.println(declaredFields.length + " --- " + dellMonitor.getDeclaredFields().length);
    }
}
