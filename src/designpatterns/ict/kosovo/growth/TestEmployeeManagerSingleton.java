package designpatterns.ict.kosovo.growth;

import designpatterns.ict.kosovo.growth.singletons.EmployeeManager;

public class TestEmployeeManagerSingleton {
    public static void main(String[] args) {
        EmployeeManager manager = EmployeeManager.getInstance();
        addMore();
        manager.add("Mentor");
        manager.add("Besnik");
        manager.printAll();
    }

    public static void addMore() {
        EmployeeManager managerTjeter = EmployeeManager.getInstance();
        managerTjeter.add("Anita");
        managerTjeter.add("Donarta");
    }
}
