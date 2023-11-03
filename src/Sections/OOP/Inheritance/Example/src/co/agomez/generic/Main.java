package co.agomez.generic;

import co.agomez.app.model.Client;
import co.agomez.app.model.PremiumClient;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Andrey", "Gomez"));

        clients.get(0);

        Client[] clientsArrangement = { new Client("Lucy", "Martinez"),
                new Client("Andrey", "Gomez") };
        Integer[] integersArrangement = { 1, 2, 3 };

        List<Client> clientsList = arrayToList(clientsArrangement);
        List<Integer> integersList = arrayToList(integersArrangement);

        clientsList.forEach(System.out::println);
        integersList.forEach(System.out::println);

        List<String> names = arrayToList(new String[] { "Andrey", "Pepe", "Lucy", "Bea", "John" }, integersArrangement);
        names.forEach(System.out::println);

        arrayToList(new PremiumClient[] { new PremiumClient("Paco", "Fernandez") });
    }

    public static <T> List<T> arrayToList(T[] t) {
        return Arrays.asList(t);
    }

    public static <T extends Number> List<T> arrayToList(T[] t) {
        return Arrays.asList(t);
    }

    public static <T extends Client & Comparable<T>> List<T> arrayToList(T[] t) {
        return Arrays.asList(t);
    }

    public static <T, G> List<T> arrayToList(T[] t, G[] g) {
        for (G element : g) {
            System.out.println(element);
        }
        return Arrays.asList(t);
    }
}