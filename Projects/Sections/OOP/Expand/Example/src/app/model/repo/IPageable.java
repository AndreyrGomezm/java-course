package app.model.repo;

import java.util.List;

public interface IPageable<T> {
    List<T> toList(int since, int until);
}
