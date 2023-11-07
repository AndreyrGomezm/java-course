package app.model.repo;

import app.model.repo.exceptions.DataAccessException;

import java.util.List;

public interface ICrud<T> {
    List<T> toList();
    T byId(Integer id) throws DataAccessException;
    ICrud create(T t) throws DataAccessException;
    ICrud edit(T t) throws DataAccessException;
    ICrud delete(Integer id) throws DataAccessException;
}
