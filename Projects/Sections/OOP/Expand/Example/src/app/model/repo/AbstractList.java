package app.model.repo;

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
    public T byId(Integer id) {
        T result = null;
        for(T cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                result = cli;
                break;
            }
        }
        return result;
    }

    @Override
    public AbstractList create(T t) {
        this.dataSource.add(t);
        return this;
    }

    @Override
    public AbstractList delete(Integer id) {
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
