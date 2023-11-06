package app.model.repo;

import java.util.List;

public interface ICrud<T> {
    List<T> toList();
    T byId(Integer id);
    ICrud create(T t);
    ICrud edit(T t);
    ICrud delete(Integer id);
}
