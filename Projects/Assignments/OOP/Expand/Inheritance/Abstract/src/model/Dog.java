package model;

public class Dog extends Canine {

    private final int biteForce;

    public Dog(int biteForce, float fangSize, String color, String habitat, float height, float length, float weight) {
        super(fangSize, color, habitat, height, length, weight);
        this.biteForce = biteForce;
    }

    public int getBiteForce() {
        return biteForce;
    }

    @Override
    public String eat() {
        return "The African dog hunts in packs with a strong bite force of " + biteForce
                + " PSI, featuring strong jaws and large rounded ears.";
    }

    @Override
    public String sleep() {
        return "The African dog sleeps on the African savanna.";
    }

    @Override
    public String run() {
        return "The African dog runs on the plains adjacent to the savanna!";
    }

    @Override
    public String communicate() {
        return "Dogs bark at night during nocturnal hunts.";
    }
}
