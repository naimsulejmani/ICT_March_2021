package project.ict.kosovo.growth.model.interfaces;

public interface BaseRepository<T, Tid>
        extends WriteOnlyRepository<T, Tid>, ReadOnlyRepository<T, Tid> {
}
