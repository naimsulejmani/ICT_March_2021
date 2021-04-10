package oop.ict.kosovo.growth.ushtrimi1;

public class TestWrapperClass {
    public static void main(String[] args) {
        int age = 20;
        boolean isActive = true;
        char gender = 'M';
        long personalNo = 1234567890l;
        double distanceFromEarth = 256262525252.23;
        float salary = 1000.50f;

        //variable reference / objekt duke perdore WRAPPER ne vend te tipit primitv
        Integer ageWrapper = age;
        Integer x = 100;
        Boolean isActiveWrapper = isActive;
        Character genderWrapper = gender;
        Long personalNoWrapper = personalNo;
        Double distanceFromEarthWrapper = distanceFromEarth;
        Float salaryWrapper = salary;

        int number = Integer.parseInt("123132");
        Integer number1 = Integer.parseInt("123132");
        double y = Double.parseDouble("123.123");
        System.out.println(ageWrapper);
        System.out.println(salaryWrapper);

    }
}
