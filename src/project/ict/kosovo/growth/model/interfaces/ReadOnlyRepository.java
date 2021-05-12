package project.ict.kosovo.growth.model.interfaces;

import java.util.List;

public interface ReadOnlyRepository<T, Tid> {
    T get(Tid id);
    List<T> getAll();
}
