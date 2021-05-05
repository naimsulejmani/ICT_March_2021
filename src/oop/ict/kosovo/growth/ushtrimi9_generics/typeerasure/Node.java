package oop.ict.kosovo.growth.ushtrimi9_generics.typeerasure;

public class Node<T> {
    private T data;

    public Node() {
//        data = new T();//compile error
//        T[] vargu= new T[100]; //compile error
    }

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}
