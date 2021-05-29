package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class U2 {
    public static void main(String[] args) {
        Product p1 = new Product("Buke");
        Product p2 = new Product("Uje");
        List<Product> menu = new ArrayList<>();

        menu.add(p1);
        menu.add(p2);
        menu.add(null);
        menu.add(3, null);
        menu.add(3, p1);
        menu.add(0, new Product("Coca Cola 2l"));

        menu.stream().forEach(System.out::println);
//        menu.stream().forEach(new Consumer<Product>() {
//            @Override
//            public void accept(Product product) {
//                System.out.println(product);
//            }
//        });
//
//        menu.stream().forEach((p) -> System.out.println(p));


        menu.set(menu.size() - 1, new Product("Monte Choko!"));
        System.out.println("---------------");
        menu.stream().forEach(System.out::println);

        System.out.println("-----AFTER REMOVE-----");
        menu.remove(menu.size() - 1);
        menu.remove(p1);

        menu.stream().forEach(System.out::println);


        boolean existBuke = menu.contains(p1);
        System.out.println("Buka exists = " + existBuke);

        int index = menu.indexOf(p1);
        System.out.println("Buka exists = " + (index >= 0));

        if (index >= 0 && menu.get(index) != null)
            menu.get(index).setName("Buka");

        System.out.println("------AFTER UPDATE--------");
        menu.stream().forEach(System.out::println);
        System.out.println("Total Elements = " + menu.size());
    }

}
