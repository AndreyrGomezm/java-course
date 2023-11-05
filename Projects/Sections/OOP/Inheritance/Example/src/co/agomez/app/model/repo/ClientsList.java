package co.agomez.app.model.repo;

import java.util.*;
import co.agomez.app.model.client.Client;

public class ClientsList implements IFull {
    private List<Client> dataSource;

    public ClientsList() {
        dataSource = new ArrayList<>();
    }

    public static int order(String field, Client a, Client b) {
        int result = 0;
        switch (field) {
            case "id" ->
                result = a.getId().compareTo(b.getId());
            case "name" ->
                result = a.getName().compareTo(b.getName());
            case "lastName" ->
                result = a.getLastName().compareTo(b.getLastName());
        }
        return result;
    }

    @Override
    public Client byId(Integer id) {
        Client result = null;
        for (Client cus : dataSource) {
            if (cus.getId() != null && cus.getId().equals(id)) {
                result = cus;
                break;
            }
        }
        return result;
    }

    @Override
    public void create(Client customer) {
        dataSource.add(customer);
    }

    @Override
    public void edit(Client customer) {
        Client c = byId(customer.getId());
        c.setName(customer.getName());
        c.setLastName(customer.getLastName());
    }

    @Override
    public void delete(Integer id) {
        dataSource.remove(byId(id));
    }

    @Override
    public List<Client> toList() {
        return dataSource;
    }

    @Override
    public List<Client> toList(int since, int until) {
        return dataSource.subList(since, until);
    }

    @Override
    public List<Client> toList(String field, Address address) {
        List<Client> sortedList = new ArrayList<>(dataSource);
        dataSource.sort((a, b) -> {
            int result = 0;
            if (address == Address.ASC) {
                result = order(field, a, b);
            } else if (address == Address.DESC) {
                result = order(field, b, a);
            }
            return result;
        });
        return sortedList;
    }

    @Override
    public int total() {
        return dataSource.size();
    }
}