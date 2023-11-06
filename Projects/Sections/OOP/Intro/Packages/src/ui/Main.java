package ui;

import model.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Person p = new Person();
        p.setName("Andrey");
        p.setLastName("Gomez");
        p.setHairColor(HairColor.BLACK);
        System.out.println(p.getName());

        Dog dog = new Dog();
        dog.name = "Zeus";
        dog.breed = "Siberian wolf";

        String playing = dog.play(p);
        System.out.println("playing" + playing);
        String greet = Person.greet();
        System.out.println("greet = " + greet);
        String genderFemale = Person.FEMALE_GENDER;
        String genderMale = Person.MALE_GENDER;
    }
}
