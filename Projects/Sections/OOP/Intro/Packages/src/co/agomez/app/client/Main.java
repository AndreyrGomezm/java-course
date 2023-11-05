package co.agomez.app.client;

import co.agomez.app.ui.Dog;

import static co.agomez.app.client.Person.greet;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Dog dog = new Dog();
        String greet = greet();
    }
}
