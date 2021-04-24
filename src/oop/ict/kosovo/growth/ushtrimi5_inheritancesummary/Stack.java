package oop.ict.kosovo.growth.ushtrimi5_inheritancesummary;

import java.util.ArrayList;

//misuse
//Stack is an ArrayList
public class Stack  {
    private ArrayList elements;

    public void push(Object o) {
        elements.add(0, o);
    }

    public void pop() {
        elements.remove(0);
    }
}
