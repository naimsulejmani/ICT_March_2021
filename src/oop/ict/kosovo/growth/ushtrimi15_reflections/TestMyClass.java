package oop.ict.kosovo.growth.ushtrimi15_reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class TestMyClass {
    public static void main(String[] args) {
        Class myClass = MyClass.class;



        //lexo te gjitha fushat publike tek femiu hde tek prindi
        Field[] publicFields = myClass.getFields();
        //fushat qe jane deklaruar vetem brenda klases (private, protected, public)
        //dhe jo tek prindi
        Field[] declaredField = myClass.getDeclaredFields();
        System.out.println("Fushat publike: ");
//        for (Field field : publicFields) {
//           printField(field);
//        }
        Arrays.stream(publicFields).forEach(TestMyClass::printField);
        System.out.println();
        System.out.println("Fushat e deklaruara vetem ne MyClass");
        Arrays.stream(declaredField).forEach(TestMyClass::printField);
    }

    private static void printField(Field field) {
        System.out.printf("%s %s %s;%n",
                Modifier.toString(field.getModifiers()),
                field.getType().getSimpleName(),
                field.getName()
        );
    }
}
