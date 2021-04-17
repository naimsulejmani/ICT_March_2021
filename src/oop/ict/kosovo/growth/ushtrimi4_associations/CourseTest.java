package oop.ict.kosovo.growth.ushtrimi4_associations;

public class CourseTest {
    public static void main(String[] args) {
        //krijoni disa objekte te studentit
        //Studentat qe deshirojne me u regjistru ne ICT
        Student s1 = new Student(1, "Mani", "Sulejmani");
        Student s2 = new Student(2, "Nita", "Hajdari");
        Student s3 = new Student(3, "Dita", "Buzhala");
        Student s4 = new Student(4, "Nik", "Mazreku");
        Student s5 = new Student(5, "Filan", "Fisteku");


        Course javaCourse = new Course("JAVA", "Java and Android");
        Course webCourse = new Course("WEB", "Web HTML, CSS, Javascript & JQuery");
        Course cyberCourse = new Course("CYBER", "Cyber and Security");

        javaCourse.enrollStudent(s1);
        javaCourse.enrollStudent(s2);
        javaCourse.enrollStudent(s3);
        javaCourse.enrollStudent(s4);

        //javaCourse.print();
        javaCourse.printWithStudents();


        webCourse.enrollStudent(s5);
        webCourse.enrollStudent(s3);

        webCourse.print();

        cyberCourse.enrollStudent(s5);

        cyberCourse.print();

    }
}
