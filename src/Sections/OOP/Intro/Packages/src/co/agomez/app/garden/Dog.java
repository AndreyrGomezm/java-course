package co.agomez.app.garden;

import co.agomez.app.home.Person;

public class Dog {

    protected String name;
    protected String breed;

    String play(Person person) {
        return person.throwBall();
    }
}
