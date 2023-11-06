package app.model.repo;

import java.util.List;

public interface ISortable<T> {
    List<T> toList(String field, Address address);
}
