package co.agomez.app.model.repo;

import co.agomez.app.model.client.Client;

import java.util.List;

public interface ICrud {
    List<Client> toList();

    Client byId(Integer id);

    void create(Client customer);

    void edit(Client customer);

    void delete(Integer id);
}