package oop.ict.kosovo.growth.ushtrimi5_inheritancesummary.northwind;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee ns = new Employee(1, "Naim", "Sulejmani", "CEO", 0, null);
        Employee gq = new Employee(2, "Gentrit", "Qorri", "Manager", 1, ns);
        Employee et = new Employee(3, "Elfete", "Totaj", "Team Leader", 2, gq);
        Employee bm = new Employee(4, "Besnik", "Mazreku", "Programmer Junnior", 3, et);

        System.out.println(bm.getReportsToEmployee().getName());
        System.out.println(bm.getReportsToEmployee().getReportsToEmployee().getName());
        System.out.println(bm.getReportsToEmployee().getReportsToEmployee().getReportsToEmployee().getName());
        //logjika e listave te nderlidhura (nodes)

    }
}
