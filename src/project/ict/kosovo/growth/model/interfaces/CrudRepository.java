package project.ict.kosovo.growth.model.interfaces;

import java.util.List;

//->C# I
public interface CrudRepository<T> {
    //tipi kthyes -> void, boolean, int
    boolean add(T item);
    boolean modify(T item);
    boolean remove(int id);
    boolean remove(T item);
    T get(int id);
    List<T> getAll();
    List<T> getAll(int pageNo, int pageSize);
}
