package oop.ict.kosovo.growth.ushtrimi9_generics.w3school;

public class TestOption {
    public static void main(String[] args) {
        Option<String,String> option = new Option<>("AL","Albania");
        Option<Integer,String> option1 = new Option<>(1,"Kosova");
        System.out.println(option);
        System.out.println(option1);
    }
}
