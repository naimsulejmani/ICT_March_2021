package oop.ict.kosovo.growth.ushtrimi4_associations;

public class Course {
    private final String ID;
    private String name;
    private final int MAX_STUDENTS = 100;

    //kur definojme nje varg me objekte tjetera
    //ateere lidhja eshte 1 me shume
    private Student[] students;
    private int numStudents;

    public Course(String id, String name) {
        ID = id;
        this.name = name;
        students = new Student[MAX_STUDENTS];
        numStudents = 0;
    }

    //metoda e cila regjistron stundentin nese ka vende te lira
    public void enrollStudent(Student newStudent) {
        if (numStudents < MAX_STUDENTS) {
            students[numStudents++] = newStudent;
        } else {
            System.out.println("NO more free seat!");
        }
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    //kthe total numrin e studentave te mundshem
    public int getMAX_STUDENTS() {
        return MAX_STUDENTS;
    }

    //kthen se sa studenta jan regjistru ne kurs
    public int getTotalRegisteredStudents() {
        return numStudents;
    }

    //kthen vendet e lira qe nuk jane plotesu
    public int getTotalFreeSeats() {
        return MAX_STUDENTS - numStudents;
    }

    public void print() {
        System.out.println("\n------------------------------------");
        System.out.println("Course ID: " + ID);
        System.out.println("Course Name: " + name);
        System.out.println("MAX STUDENTS: " + MAX_STUDENTS);
        System.out.println("Total Registered: " + numStudents);
        System.out.println("Free Spots: " + getTotalFreeSeats());
    }

    public void printWithStudents() {
        print();
        System.out.println("Students: ");
        for (Student student : students) {
            if (student == null) break; //jump command jump statement, e nderpren iteracionin apo perseritjen
            System.out.println(student);
        }
    }
}
