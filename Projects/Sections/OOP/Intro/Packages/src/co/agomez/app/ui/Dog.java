package co.agomez.app.ui;

import co.agomez.app.client.Person;

public class Dog {

    protected String name;
    protected String breed;

    String play(Person person) {
        return person.throwBall();
    }
}
