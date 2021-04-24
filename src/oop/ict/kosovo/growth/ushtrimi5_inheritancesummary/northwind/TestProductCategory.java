package oop.ict.kosovo.growth.ushtrimi5_inheritancesummary.northwind;

public class TestProductCategory {
    public static void main(String[] args) {
        Category pije = new Category(1,"Pije","xxx",null);
        Category ushqim = new Category(1,"Ushqim","yyy",null);



        Product cocaCola = new Product();
        cocaCola.setProductId(1);
        cocaCola.setProductName("Coca Cola 1l");
        cocaCola.setUnitPrice(1);
        cocaCola.setCategoryId(pije.getCategoryId());
        cocaCola.setCategory(pije);

        Product shwepps = new Product();
        shwepps.setProductId(2);
        shwepps.setCategory(pije);

    }
}
