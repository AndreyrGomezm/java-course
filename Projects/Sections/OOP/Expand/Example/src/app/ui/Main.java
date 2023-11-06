package app.ui;

import app.model.repo.Address;
import app.model.repo.IFull;
import app.model.repo.list.ClientList;
import app.model.entity.Client;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IFull<Client> repo = new ClientList();
        repo.create(new Client("Jano", "Pérez"))
                .create(new Client("Bea", "González"))
                .create(new Client("Luci", "Martínez"))
                .create(new Client("Andrés", "Guzmán"));

        List<Client> clients = repo.toList();
        clients.forEach(System.out::println);
        System.out.println("===== pageable =====");
        List<Client> pageable = repo.toList(1, 4);
        pageable.forEach(System.out::println);

        System.out.println("===== sorteable =====");
        List<Client> ClientsAscOrder = repo.toList("lastName", Address.ASC);
        for(Client c: ClientsAscOrder){
            System.out.println(c);
        }

        System.out.println("===== edit =====");
        Client beaUpdate = new Client("Bea", "Mena");
        beaUpdate.setId(2);
        repo.edit(beaUpdate);
        Client bea = repo.byId(2);
        System.out.println(bea);
        System.out.println(" ============= ");
        repo.toList("name", Address.ASC).forEach(System.out::println);
        System.out.println("===== delete ======");
        repo.delete(2);
        repo.toList().forEach(System.out::println);
        System.out.println("===== total ===== ");
        System.out.println("Total records: " + repo.total());
    }
}
