package oop.ict.kosovo.growth.ushtrimi10_nestedclass.lambdaexpression;

import oop.ict.kosovo.growth.ushtrimi10_nestedclass.anonymousinnerclass.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparatorInterface {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Mentor Iliazi", 9.75d));
        students.add(new Student(2, "Flamur Gashi", 6.1d));
        students.add(new Student(3, "Elfete Totaj", 9.90d));
        students.add(new Student(5, "Abdurrahman Sulejmani", 9.90d));
        students.add(new Student(6, "Filan Fisteku", 6.1d));
        Student naimi = new Student(4, "Naim Sulejmani", 7.75d);
        students.add(naimi);

        Comparator<Student> sortNames = (s1, s2) -> s1.getName().compareTo(s2.getName());
        Comparator<Student> sortGrade = (s1, s2) -> {
            double diff = s1.getAverageGrade() - s2.getAverageGrade();
            if (diff > 0) return 1;
            else if (diff < 0) return -1;
            else return 0;
        };

        Collections.sort(students, sortGrade.thenComparing(sortNames));

        students.forEach(System.out::println);//referencing static method
    }
}
