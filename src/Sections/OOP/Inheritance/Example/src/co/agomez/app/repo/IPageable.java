package co.agomez.app.repo;

import co.agomez.app.model.Client;
import java.util.List;

public interface IPageable {
    List<Client> toList(int since, int until);
}
