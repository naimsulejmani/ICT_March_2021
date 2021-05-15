package oop.ict.kosovo.growth.ushtrimi10_nestedclass.lambdaexpression;

import oop.ict.kosovo.growth.ushtrimi10_nestedclass.anonymousinnerclass.Student;

import java.util.*;
import java.util.function.Predicate;

public class TestLambdaExpression {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Mentor Iliazi", 9.75d));
        students.add(new Student(2, "Flamur Gashi", 6.1d));
        students.add(new Student(3, "Elfete Totaj", 9.90d));
        students.add(new Student(5, "Abdurrahman Sulejmani", 9.90d));
        students.add(new Student(6, "Filan Fisteku", 6.1d));
        Student naimi = new Student(4, "Naim Sulejmani", 7.75d);
        students.add(naimi);

        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        for (Student student : students) {
            System.out.printf("%d - %s - %.2f%n", student.getId(), student.getName(), student.getAverageGrade());
        }

        Comparator<Student> nameComparator = (s1, s2) -> {
            return s1.getName().compareTo(s2.getName());
        };
        Collections.sort(students, nameComparator);

        Comparator<Student> gradeComparator = (s1, s2) -> {
            double diff = s1.getAverageGrade() - s2.getAverageGrade();
            if (diff < 0) return -1;
            else if (diff > 0) return 1;
            return 0;
        };

        System.out.println("Sortimi sipas GRADE: ");
        Collections.sort(students, gradeComparator);

        for (Student student : students) {
            System.out.printf("%d - %s - %.2f%n", student.getId(), student.getName(), student.getAverageGrade());
        }

        students.sort(gradeComparator);

        //anonymous class
        students.removeIf(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.equals(naimi);
            }
        });
        //lambda expression
        students.removeIf(student -> student.equals(naimi));

        System.out.println("AFTER REMOVE");
        students.forEach((student) -> {
            System.out.printf("%d - %s - %.2f%n", student.getId(), student.getName(), student.getAverageGrade());
        });

    }
}
