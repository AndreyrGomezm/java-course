package app.model.repo;

import app.model.repo.exceptions.*;
import app.model.entity.BaseEntity;

import java.util.*;

public abstract class AbstractList<T extends BaseEntity> implements IFull<T> {

    protected List<T> dataSource;

    public AbstractList() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> toList() {
        return dataSource;
    }

    @Override
    public T byId(Integer id) throws ReadingDataAccessException {
        if (id == null || id <= 0) {
            throw new ReadingDataAccessException("Invalid id must be > 0");
        }
        T result = null;
        for (T cli : dataSource) {
            if (cli.getId() != null && cli.getId().equals(id)) {
                result = cli;
                break;
            }
        }
        if (result == null) {
            throw new ReadingDataAccessException("The record with id does not exist: " + id);
        }
        return result;
    }

    @Override
    public AbstractList create(T t) throws WriteDataAccessException {
        if (t == null) {
            throw new WriteDataAccessException("Error inserting a null object");
        }
        if (dataSource.contains(t)){
            throw new DuplicateRecordDataAccessException("Error object with id "
                    + t.getId() + " exists in the repository");
        }
        this.dataSource.add(t);
        return this;
    }

    @Override
    public AbstractList delete(Integer id) throws ReadingDataAccessException {
        this.dataSource.remove(this.byId(id));
        return this;
    }

    @Override
    public List<T> toList(int since, int until) {
        return dataSource.subList(since, until);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
