package oop.ict.kosovo.growth.ushtrimi12_streams.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Stream;

public class TestFlatMapExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Mentor Ilazi";

        s1.subjects.add(new Subject(1, "Java Basic"));

        Subject subject2 = new Subject(2, "Java Medium");
        s1.subjects.add(subject2);


        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Edison Boqaj";
        s2.subjects.add(new Subject(3, "Java Advance"));
        s2.subjects.add(subject2);

        students.add(s1);
        students.add(s2);

//klasen anonime
        BiPredicate<Student, Subject> subjectForStudentBiPredicate
                = new BiPredicate<Student, Subject>() {
            @Override
            public boolean test(Student student, Subject subject) {
                return student.subjects.contains(subject);
            }
        };
//lambda expression
        BiPredicate<Student, Subject> subjectForStudentBiPredicate1
                = (student, subject) -> student.subjects.contains(subject);


        students.stream().flatMap((s)->s.subjects.stream()).filter(s->s.name.contains("Advance"))
                .forEach(System.out::println);
    }
}
