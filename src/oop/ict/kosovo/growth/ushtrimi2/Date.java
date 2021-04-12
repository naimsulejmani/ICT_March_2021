package oop.ict.kosovo.growth.ushtrimi2;
public class Date {
    //variablat instance
    private int day, month, year;
    //Konstruktoret -> menyrat e krijimit te objektit te dates sone
    public Date() {
        this(1970, 1, 1);
//        month = day = 1;
//        year = 1970;
        //default konsturkotir
    }
    public Date(int year) {
        this(year, 1, 1);
//        this.year = year;
//        month = day = 1;
    }
    public Date(int year, int month) {
        this(year, month, 1);
//        this.year = year;
//        this.month = month;
//        this.day = 1;
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


}
