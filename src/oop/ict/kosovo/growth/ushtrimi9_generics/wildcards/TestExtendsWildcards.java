package oop.ict.kosovo.growth.ushtrimi9_generics.wildcards;

import oop.ict.kosovo.growth.ushtrimi9_generics.singlepair.Pair;

public class TestExtendsWildcards {
    public static void main(String[] args) {
        //shume pair of managers
        //? extends Employee
        Manager m1 = new Manager(1, "Mentor", "Ilazi");
        Manager m2 = new Manager(2, "Naim", "Sulejmani");
        Pair<Manager> manager = new Pair<>(m1, m2);
        Pair<Employee> emps = new Pair<>(new Employee(1,"A","B"),
                new Employee(2,"C","D"));
        Pair<? extends Employee> managerExtends = manager;

        Manager m3 = new Manager(3,"Anita","Hajdari");

        Manager mdyshi =(Manager)managerExtends.getFirst();
        //managerExtends.setFirst(m3);//compile time
    }
}
