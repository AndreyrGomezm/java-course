package co.agomez.app.model.repo;

import co.agomez.app.model.client.Client;
import java.util.List;

public interface ISortable {
    List<Client> toList(String field, Address address);
}