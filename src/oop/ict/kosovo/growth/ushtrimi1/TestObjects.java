package oop.ict.kosovo.growth.ushtrimi1;

import java.util.Scanner;

public class TestObjects {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Doctor drFilanFisteku = new Doctor();

        //edhe pse e rregullit 1 deri ne 1M
        drFilanFisteku.setId(100);

        System.out.println(drFilanFisteku.getId());
    }
}
