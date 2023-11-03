package co.agomez.app.repo;

import co.agomez.app.model.Client;
import java.util.List;

public interface ISortable {
    List<Client> toList(String field, Address address);
}