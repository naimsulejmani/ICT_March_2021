package oop.ict.kosovo.growth.ushtrimi12_streams.basic.functions;

import oop.ict.kosovo.growth.ushtrimi12_streams.basic.Product;

import java.util.ArrayList;
import java.util.List;

public class TestPeekMapMethods {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Produkti A", 99));
        products.add(new Product(2, "Produkti B", 89));
        products.add(new Product(3, "Produkti C", 1));

        products.stream() // kthe listen e produkteve ne stream
        .filter(p->p.getPrice()<90) // filtro ose kthe te gjithe produktet qe kane cmimin njeshifrore ose negate
        .peek(p->p.setPrice(p.getPrice()*1.20)) //shto 20% ne cmimi
        .map(p->p.getName()) //mappoma produktin ne string
        .forEach(p->{
            p=p.replace("Produkti","Product");
            System.out.println(p);
        }); //per secilin produkt beni replace stringu dhe shtype

    }
}
