package designpatterns.ict.kosovo.growth.singletons;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private static EmployeeManager instance;
    private EmployeeManager() {
    }

    public static EmployeeManager getInstance() {
        if (instance == null) {
            synchronized (EmployeeManager.class) {
                instance = new EmployeeManager();
            }
        }
        return instance;
    }

    List<String> employeeNames = new ArrayList<>();
    public void add(String name) {
        employeeNames.add(name);
    }
    //.... other methods here
    public void printAll() {
        employeeNames.stream().forEach(System.out::println);
    }
}
