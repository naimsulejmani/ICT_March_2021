package oop.ict.kosovo.growth.ushtrimi5_inheritancesummary.northwind;

public class Employee {
    private int employeeId;
    private String name;
    private String surname;
    private String title;
    private int reportsTo;

    private Employee reportsToEmployee;

    public Employee() {
    }

    public Employee(int employeeId, String name, String surname, String title, int reportsTo, Employee reportsToEmployee) {
        this.employeeId = employeeId;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.reportsTo = reportsTo;
        this.reportsToEmployee = reportsToEmployee;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(int reportsTo) {
        this.reportsTo = reportsTo;
    }

    public Employee getReportsToEmployee() {
        return reportsToEmployee;
    }

    public void setReportsToEmployee(Employee reportsToEmployee) {
        this.reportsToEmployee = reportsToEmployee;
    }
}
