package oop.ict.kosovo.growth.ushtrimi2;

public class DateTest {
    public static void main(String[] args) {
        Date data = new Date();
        Date data1 = new Date(1999);
        Date data2 = new Date(2000, 7);
        Date data3 = new Date(2000, 7, 17);

        data.print();
        data1.print();
        data2.print();
        data3.print();
    }
}
