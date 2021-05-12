package project.ict.kosovo.growth.model.interfaces;

public interface WriteOnlyRepository <T, Tid>{
    boolean add(T item);
    boolean modify(T item);
    boolean removeById(Tid id);
    boolean remove(T item);
}
