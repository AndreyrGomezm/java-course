package generics;

import app.model.entity.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Andres", "Guzmán"));

        Client andres = clients.iterator().next();

        Client[] clientsArrangement = {new Client("Luci", "Martínez"),
                new Client("Andres", "Guzmán")};
        Integer[] integersArrangement = {1,2,3};

        List<Client> clientsList = arrayToList(clientsArrangement);
        List<Integer> integersList = Main.arrayToList(integersArrangement);

        clientsList.forEach(System.out::println);
        integersList.forEach(System.out::println);

        List<String> names = arrayToList(new String[]{"Andrés", "Pepe",
        "Luci", "Bea", "John"}, integersArrangement);
        names.forEach(System.out::println);

        List<PremiumClient> premiumClientsList = arrayToList(
                new PremiumClient[]{new PremiumClient("Paco", "Fernández")});

        printClients(clients);
        printClients(clientsList);
        printClients(premiumClientsList);

        System.out.println("Max of 1, 9 and 4 is: " + max(1, 9, 4));
        System.out.println("Max of 3.9, 11.6 and 7.78 is: " + max(3.9, 11.6, 7.78));
        System.out.println("Máximo de zanahoria, arándanos, manzana es: "
                + max("zanahoria", "arándano", "manzana"));

    }

    public static <T> List<T> arrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> arrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Client & Comparable<T>> List<T> arrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> arrayToList(T[] c, G[] x){
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void printClients(List<? extends Client> clients){
        clients.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
