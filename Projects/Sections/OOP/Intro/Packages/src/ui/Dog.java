package ui;

import model.Person;

public class Dog {

    protected String name;
    protected String breed;

    String play(Person person) {
        return person.throwBall();
    }
}
