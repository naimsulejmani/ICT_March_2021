package basic.ict.kosovo.growth;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String emri = "Naim";
        String mbiemri = "Sulejmani";
        String fullName = emri + " " + mbiemri;
        Scanner obj = new Scanner(System.in);


        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.charAt(8));
        System.out.println(fullName.replace('a','o'));
        System.out.println(fullName.replace("Sulejmani","Caka"));
        System.out.println(fullName.substring(5));
        System.out.println(fullName.substring(6,10));
        System.out.println(fullName.equals("Hasan Bislimi"));
        System.out.println(fullName.compareTo("Naim Sulejmani"));
        System.out.println(fullName.indexOf("S"));
        System.out.println(fullName.concat(" shume i shpejte!"));
        System.out.println(fullName.repeat(2));
        System.out.println(fullName.length());


    }
}
