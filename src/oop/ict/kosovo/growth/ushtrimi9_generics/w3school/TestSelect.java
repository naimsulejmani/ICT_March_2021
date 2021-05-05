package oop.ict.kosovo.growth.ushtrimi9_generics.w3school;

public class TestSelect {
    public static void main(String[] args) {
        Select selectCountry = new Select("country","Country");
        selectCountry.addOption("ALB","Albania");
        selectCountry.addOption("RKS","Kosova");
        selectCountry.addOption("NMK","North Macedonia");
        selectCountry.addOption("USA","United States of America");

        System.out.println(selectCountry);
    }
}
