package oop.ict.kosovo.growth.ushtrimi1;

public class Doctor {
    //id-ja identifikuese e doktorit
    //prej numrit 1 deri ne 1_000_000;
    private int id;

    //kete e krijon java per neve nese skemi definu asnje konstruktor
    public Doctor() {
        //default konstruktori
    }

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        if (_id >= 1 && _id <= 1_000_000)
            id = _id;
        else {
            System.out.printf("Parametri id nuk eshte ne rangun e vlerave 1 dhe 1M: %d%n", _id);
        }
    }
}
