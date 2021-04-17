package oop.ict.kosovo.growth.ushtrimi4_associations;

import java.util.ArrayList;

public class Course {
    private final String ID;
    private String name;
    private final int MAX_STUDENTS;// = 100;

    private ArrayList<Student> students;

    public Course(String id, String name, int maxStudents) {
        ID = id;
        this.name = name;
        MAX_STUDENTS = maxStudents;
        students = new ArrayList<>(MAX_STUDENTS); // nese nuk e vendosim kee max_Students ->
    }

    //metoda e cila regjistron stundentin nese ka vende te lira
    public void enrollStudent(Student newStudent) {
        if (students.size() < MAX_STUDENTS) {
            students.add(newStudent);
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
        return students.size();
    }

    //kthen vendet e lira qe nuk jane plotesu
    public int getTotalFreeSeats() {
        return MAX_STUDENTS - students.size();
    }

    public void print() {
        System.out.println("\n------------------------------------");
        System.out.println("Course ID: " + ID);
        System.out.println("Course Name: " + name);
        System.out.println("MAX STUDENTS: " + MAX_STUDENTS);
        System.out.println("Total Registered: " + students.size());
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
