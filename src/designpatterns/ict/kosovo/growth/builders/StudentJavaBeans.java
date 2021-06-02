package designpatterns.ict.kosovo.growth.builders;

public class StudentJavaBeans {
    private final int id;
    private final String name;
    private String surname;
    private boolean isGraduated;

    public StudentJavaBeans(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }
}
