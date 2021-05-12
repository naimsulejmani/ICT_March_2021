package project.ict.kosovo.growth.repository;

import project.ict.kosovo.growth.model.Product;
import project.ict.kosovo.growth.model.interfaces.BaseRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements BaseRepository<Product, Integer> {
    //me simulu databazen
    private List<Product> products = new ArrayList<>();

    @Override
    public Product get(Integer id) {
        //duhe tme u konektu ne databaze
        //me thirr nje query ose procedure duke ia dhene parametrin id
        //pastaj e pret rezultatin e thirrjes
        //e konverton resultatin (resulset=in) ne object te product
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public boolean add(Product item) {
        return false;
    }

    @Override
    public boolean modify(Product item) {
        return false;
    }

    @Override
    public boolean removeById(Integer id) {
        return false;
    }

    @Override
    public boolean remove(Product item) {
        return false;
    }
}
