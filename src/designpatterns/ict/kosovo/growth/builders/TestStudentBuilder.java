package designpatterns.ict.kosovo.growth.builders;

public class TestStudentBuilder {
    public static void main(String[] args) {
        Student.Builder stud1 = new Student.Builder(1,"Naim");
        System.out.println(stud1);
        stud1 = stud1.surname("Sulejmani");
        System.out.println(stud1);
        stud1 = stud1.isGraduated(true);
        System.out.println(stud1);

        Student student = new Student(stud1);


        Student student1 =
                new Student.Builder(2,"Mentor").isGraduated(false).build();

    }
}
