package co.agomez.app.home;

import co.agomez.app.garden.Dog;

import static co.agomez.app.home.Person.greet;

public class HomeExample {
    public static void main(String[] args) {
        Person p = new Person();
        Dog dog = new Dog();
        String greet = greet();
    }
}
