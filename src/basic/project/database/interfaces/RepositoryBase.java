package basic.project.database.interfaces;

import java.util.List;

public interface RepositoryBase<T, Tid> {
    boolean add(T item); // int add(T item) <0 -> su regjistru >=0, void add(T item)

    boolean modify(T item);

    boolean remove(T item);

    boolean removeById(Tid id);

    T get(Tid id);

    List<T> getAll();
}
