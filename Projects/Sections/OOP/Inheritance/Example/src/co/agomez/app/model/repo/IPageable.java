package co.agomez.app.model.repo;

import co.agomez.app.model.client.Client;
import java.util.List;

public interface IPageable {
    List<Client> toList(int since, int until);
}
