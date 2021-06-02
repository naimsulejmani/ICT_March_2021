package designpatterns.ict.kosovo.growth.builders;

public class WrongStudentBuilder {
    private final int id;
    private final String name;
    private String surname;
    private boolean isGraduated;
    public WrongStudentBuilder(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public WrongStudentBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }
    public WrongStudentBuilder isGraduated(boolean isGraduated) {
        this.isGraduated = isGraduated;
        return this;
    }
    @Override
    public String toString() {
        return "StudentBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", isGraduated=" + isGraduated +
                '}';
    }
}
