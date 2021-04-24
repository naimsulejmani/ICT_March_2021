package oop.ict.kosovo.growth.ushtrimi5_inheritancesummary;

public class NewPerson {
    //variable instances (object variable)
    private int id;
    private String name;
    private String surname;
    private PersonType profession;

    public NewPerson(int id, String name, String surname, PersonType profession) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public PersonType getProfession() {
        return profession;
    }

    public void setProfession(PersonType profession) {
        this.profession = profession;
    }
}
