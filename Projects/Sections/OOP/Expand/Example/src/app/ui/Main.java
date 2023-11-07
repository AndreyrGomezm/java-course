package app.ui;

import app.model.repo.*;
import app.model.entity.Client;
import app.model.repo.exceptions.*;
import app.model.repo.list.ClientList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            IFull<Client> repo = new ClientList();
            repo.create(new Client("Jano", "Pérez"))
                    .create(new Client("Bea", "González"))
                    .create(new Client("Luci", "Martínez"));
            Client andrey = new Client("Andrey", "Gomez");
            repo.create(andrey);
            repo.create(andrey);

            List<Client> clients = repo.toList();
            clients.forEach(System.out::println);
            System.out.println("===== pageable =====");
            List<Client> pageable = repo.toList(1, 4);
            pageable.forEach(System.out::println);

            System.out.println("===== sorteable =====");
            List<Client> ClientsAscOrder = repo.toList("lastName", Address.ASC);
            for (Client c : ClientsAscOrder) {
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
        } catch (DuplicateRecordDataAccessException e) {
            System.err.println("Duplicate Record: " + e.getMessage());
            e.printStackTrace();
        } catch (ReadingDataAccessException e) {
            System.err.println("Reading: " + e.getMessage());
            e.printStackTrace();
        } catch (WriteDataAccessException e) {
            System.err.println("Write: " + e.getMessage());
            e.printStackTrace();
        }catch (DataAccessException e) {
            System.err.println("Generic: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
