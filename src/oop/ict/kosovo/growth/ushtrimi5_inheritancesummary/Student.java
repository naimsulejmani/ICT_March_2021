package oop.ict.kosovo.growth.ushtrimi5_inheritancesummary;

public class Student extends Person{
    private String department;

    public Student(int id, String name, String surname, String department) {
        super(id, name, surname);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
