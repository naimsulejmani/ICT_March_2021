package oop.ict.kosovo.growth.ushtrimi9_generics.datastructure;

public class Node<T extends Comparable<T>> {
    private T data;
    private Node next;
}
