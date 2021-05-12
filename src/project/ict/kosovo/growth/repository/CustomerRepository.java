package project.ict.kosovo.growth.repository;

import project.ict.kosovo.growth.model.Customer;
import project.ict.kosovo.growth.model.interfaces.BaseRepository;

import java.util.List;

public class CustomerRepository implements BaseRepository<Customer,Integer> {
    @Override
    public Customer get(Integer id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public boolean add(Customer item) {
        return false;
    }

    @Override
    public boolean modify(Customer item) {
        return false;
    }

    @Override
    public boolean removeById(Integer id) {
        return false;
    }

    @Override
    public boolean remove(Customer item) {
        return false;
    }
}
