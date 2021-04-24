package oop.ict.kosovo.growth.ushtrimi5_inheritancesummary;

public class Professor extends Person{
    private String university;

    public Professor(int id, String name, String surname, String university) {
        super(id, name, surname);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
