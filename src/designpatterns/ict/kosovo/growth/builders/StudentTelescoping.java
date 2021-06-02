package designpatterns.ict.kosovo.growth.builders;

//Telescoping Design pattern
public class StudentTelescoping {
    private final int id;
    private final String name;
    private final String surname;
    private final boolean isGraduated;


    public StudentTelescoping(int id, String name, String surname, boolean isGraduated) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.isGraduated = isGraduated;
    }

    public StudentTelescoping(int id, String name, String surname) {
       this(id,name,surname,false);
    }

    public StudentTelescoping(int id, String name) {
       this(id,name,"no-surname",false);
    }
}
