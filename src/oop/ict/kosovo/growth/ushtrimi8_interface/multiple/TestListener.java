package oop.ict.kosovo.growth.ushtrimi8_interface.multiple;

import javax.swing.*;

public class TestListener {
    public static void main(String[] args) {
        ActionListener al = new MyListener();
        KeyListener kl = new MyListener();
        MyListener ml = new MyListener();



        ActionListener l; //= null
        System.out.println(ml instanceof KeyListener);
        System.out.println(ml instanceof ActionListener);


    }
}
