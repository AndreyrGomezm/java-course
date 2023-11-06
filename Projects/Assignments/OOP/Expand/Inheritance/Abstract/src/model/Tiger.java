package model;

public class Tiger extends Feline {

    private final String tigerSpecies;

    public Tiger(String tigerSpecies, float clawSize, int speed, String habitat, float height, float length,
                 float weight) {
        super(clawSize, speed, habitat, height, length, weight);
        this.tigerSpecies = tigerSpecies;
    }

    public String getTigerSpecies() {
        return tigerSpecies;
    }

    @Override
    public String eat() {
        return "The " + tigerSpecies + " Tiger hunts alone in the mangroves and monsoon forests of " + habitat
                + ", they are the most stealthy mammalian hunters.";
    }

    @Override
    public String sleep() {
        return "The " + tigerSpecies + " Tiger sleeps in the jungles of " + habitat;
    }

    @Override
    public String run() {
        return "The " + tigerSpecies + " Tiger runs at " + speed + " km/hr";
    }

    @Override
    public String communicate() {
        return "The Tiger roars and flattens its ears.";
    }
}
