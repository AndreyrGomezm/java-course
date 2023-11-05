package co.agomez.app.ui;

import co.agomez.app.model.client.Client;
import co.agomez.app.model.repo.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IFull repo = new ClientsList();
        repo.create(new Client("Jan", "Perez"));
        repo.create(new Client("Bea", "Gonzalez"));
        repo.create(new Client("Lucy", "Martinez"));
        repo.create(new Client("Andrey", "Gomez"));

        List<Client> clients = repo.toList();
        clients.forEach(System.out::print);

        System.out.println("===== pageable =====");
        List<Client> pageable = repo.toList(0, 4);
        pageable.forEach(System.out::print);

        System.out.println("===== order =====");
        List<Client> order = repo.toList("lastName", Address.ASC);
        order.forEach(System.out::print);

        System.out.println("===== edit =====");
        Client beaUpdate = new Client("Bea", "Mena");
        beaUpdate.setId(2);
        repo.edit(beaUpdate);
        Client bea = repo.byId(2);
        System.out.println(bea);

        System.out.println("================");
        repo.toList("lastName", Address.ASC).forEach(System.out::print);

        System.out.println("===== delete =====");
        repo.delete(2);
        repo.toList().forEach(System.out::print);

        System.out.println("===== total =====");
        System.out.println("Total registration: " + repo.total());
    }
}