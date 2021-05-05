package oop.ict.kosovo.growth.ushtrimi9_generics.datastructure;

public class Element<T extends Comparable<T>> {
    private T data;
    private Element left;
    private Element right;
}
