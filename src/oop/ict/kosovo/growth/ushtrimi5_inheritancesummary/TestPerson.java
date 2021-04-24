package oop.ict.kosovo.growth.ushtrimi5_inheritancesummary;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Student(1, "Ardita", "Buzhala", "Dizajn softuerik!");
        Person p2 = new Professor(1, "Naim", "Sulejmani", "ICT for Kosovo Growth");



        NewPerson st1 = new NewPerson(1, "Jeta", "Bytyqi", PersonType.STUDENT);
    }
}
