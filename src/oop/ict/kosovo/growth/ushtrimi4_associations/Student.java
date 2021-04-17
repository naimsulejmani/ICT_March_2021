package oop.ict.kosovo.growth.ushtrimi4_associations;

public class Student {
    private final int ID; //ID-ja e studentit do te jete konstat per arsye nuk ndryshohet me
    private String name;
    private String surname;

    public Student(int id, String name, String surname) {
        ID = id;
        this.name = name;
        this.surname = surname;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("%d - %s %s", ID, name, surname);
    }
}
