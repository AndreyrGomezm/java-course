package co.agomez.app.ui;

import co.agomez.app.model.*;
import static co.agomez.app.model.Person.*;
import static co.agomez.app.model.HairColor.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Person p = new Person();
        p.setName("Andrey");
        p.setLastName("Gomez");
        p.setHairColor(BLACK);
        System.out.println(p.getName());

        Dog dog = new Dog();
        dog.name = "Zeus";
        dog.breed = "Siberian wolf";

        String playing = dog.play(p);
        System.out.println("playing" + playing);
        String greet = greet();
        System.out.println("greet = " + greet);
        String genderFemale = FEMALE_GENDER;
        String genderMale = MALE_GENDER;
    }
}
