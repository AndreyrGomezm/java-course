package ui;

import model.*;

public class Main {

    public static void main(String[] args) {

        Mammal[] mammals = new Mammal[6];

        Mammal lion = new Lion(120d, 5, 7.5f, 58, "South Africa", 120, 220, 190);
        Mammal tiger = new Tiger("Siberian", 7.9f, 72, "Russia", 130, 330, 300);
        Mammal wolf = new Wolf(9, "Iberian", 2.5f, "Gray, brown, and black", "Europe", 80, 120, 70);
        Mammal dog = new Dog(317, 2.5f, "Tricolor with black, white, and rust spots", "Africa", 43, 70, 15);
        Mammal bengalTiger = new Tiger("Bengal", 7.9f, 72, "India and Indonesia", 110, 270, 220);
        Mammal cheetah = new Cheetah(4.9f, 130, "Africa", 94, 140, 72);

        mammals[0] = lion;
        mammals[1] = tiger;
        mammals[2] = wolf;
        mammals[3] = dog;
        mammals[4] = bengalTiger;
        mammals[5] = cheetah;

        for (Mammal animal : mammals) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitat());
            System.out.println("Height:" + animal.getHeight());
            System.out.println("Length:" + animal.getLength());
            System.out.println("Weight:" + animal.getWeight());

            if (animal instanceof Canine) {
                System.out.println("Fang Size:" + ((Canine) animal).getFangSize());
                System.out.println("Color:" + ((Canine) animal).getColor());

                if (animal instanceof Wolf) {
                    System.out.println("Wolf Species:" + ((Wolf) animal).getWolfSpecies());
                    System.out.println("Number of Pack Members:" + ((Wolf) animal).getPackSize());
                }
                if (animal instanceof Dog) {
                    System.out.println("Bite Force (kg):" + ((Dog) animal).getBiteForce());
                }
            }

            if (animal instanceof Feline) {
                System.out.println("Claw Size:" + ((Feline) animal).getClawSize());
                System.out.println("Speed:" + ((Feline) animal).getSpeed());

                if (animal instanceof Lion) {
                    System.out.println("Roar Power:" + ((Lion) animal).getRoarPowerInDecibels());
                    System.out.println("Number of Pride Members:" + ((Lion) animal).getNumberOfPrideMembers());
                }
                if (animal instanceof Tiger) {
                    System.out.println("Tiger Species:" + ((Tiger) animal).getTigerSpecies());
                }
            }

            System.out.println(animal.eat());
            System.out.println(animal.sleep());
            System.out.println(animal.run());
            System.out.println(animal.communicate());
        }
    }
}
