package oop.ict.kosovo.growth.ushtrimi10_nestedclass.anonymousinnerclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentAnonymousTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Mentor Iliazi", 9.75d));
        students.add(new Student(2, "Flamur Gashi", 6.1d));
        students.add(new Student(3, "Elfete Totaj", 9.90d));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student student : students) {
            System.out.printf("%d - %s - %.2f%n", student.getId(), student.getName(), student.getAverageGrade());
        }

        Comparator<Student> gradeComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) ((o1.getAverageGrade() - o2.getAverageGrade()) * 100);
            }
        };

        Collections.sort(students, gradeComparator);
        System.out.println("Grade Comparator");
        for (Student student : students) {
            System.out.printf("%d - %s - %.2f%n", student.getId(), student.getName(), student.getAverageGrade());
        }

    }
}
