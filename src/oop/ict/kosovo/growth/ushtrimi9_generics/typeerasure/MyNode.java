package oop.ict.kosovo.growth.ushtrimi9_generics.typeerasure;

public class MyNode extends Node<Integer>{
    public MyNode(Integer data) {
        super(data);
    }

    @Override
    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
