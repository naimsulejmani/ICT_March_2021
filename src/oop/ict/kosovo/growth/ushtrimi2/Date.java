package oop.ict.kosovo.growth.ushtrimi2;

public class Date {
    //variablat instance
    private int day, month, year;

    //Konstruktoret -> menyrat e krijimit te objektit te dates sone
    public Date() {
        this(1970, 1, 1);
        //ruaj naj log
        //komuniko me databaze
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
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    private boolean isValidDate(int year, int month, int day) {
        boolean isValid = true;
        if (year <= 0 || month <= 0 || day <= 0) isValid = false;
        else if (day > 32) isValid = false;
        else if (month > 12) isValid = false;
        else if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) isValid = false;
        else if (day > 30 && month == 2) isValid = false;
        // else if (day == 29 && month == 2 && month % 4 % 400 == 0) isValid = false;
        return isValid;
    }


    public void print() {
        //d-digits, s-string, f-float(decimal)
        System.out.printf("%d.%d.%d%n", day, month, year);
        //System.out.println(day+"."+month+"."+year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isGreaterDate(Date otherDate) {
        if(year> otherDate.getYear()) return true;
        return false;
    }
}
