package app.model.repo.list;

import app.model.repo.AbstractList;
import app.model.entity.Client;
import app.model.repo.Address;
import app.model.repo.exceptions.ReadingDataAccessException;

import java.util.*;

public class ClientList extends AbstractList<Client> {

    @Override
    public ClientList edit(Client client) throws ReadingDataAccessException {
        Client c = byId(client.getId());
        c.setName(client.getName());
        c.setLastName(client.getLastName());
        return this;
    }

    @Override
    public List<Client> toList(String field, Address address) {
        List<Client> sortedList = new ArrayList<>(dataSource);
        sortedList.sort((a, b) -> {
                int result = 0;
                if(address == Address.ASC){
                    result = order(field, a, b);
                } else if(address == Address.DESC){
                    result = order(field, b, a);
                }
                return result;
        });
        return sortedList;
    }

    public static int order(String campo, Client a, Client b){
        int result = 0;
        switch (campo){
            case "id" ->
                    result = a.getId().compareTo(b.getId());
            case "name" ->
                    result = a.getName().compareTo(b.getName());
            case "lastName" ->
                    result = a.getLastName().compareTo(b.getLastName());
        }
        return result;
    }
}
