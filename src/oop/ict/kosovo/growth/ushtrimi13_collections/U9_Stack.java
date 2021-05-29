package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.Stack;

public class U9_Stack {
    public static void main(String[] args) {
        Stack<Product> stack = new Stack<>();
        stack.push(new Product("A"));
        stack.push(new Product("B"));
        Product p = stack.peek();
        System.out.println(stack.size());
        p = stack.pop();
        System.out.println(stack.size());
        Object[] ps = stack.toArray();
    }
}
