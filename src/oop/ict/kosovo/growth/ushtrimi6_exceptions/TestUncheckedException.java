package oop.ict.kosovo.growth.ushtrimi6_exceptions;

public class TestUncheckedException {
    public static void main(String[] args) {
        args = new String[]{"1","anc" ,"2", "3"};

        try {
            int sum = 0;
            for (String str : args) {
                sum += Integer.parseInt(str);
            }
            System.out.println(sum);
        } catch (NumberFormatException ex) {
            System.out.println("Argumenti i dhene nuk eshte numer!");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
