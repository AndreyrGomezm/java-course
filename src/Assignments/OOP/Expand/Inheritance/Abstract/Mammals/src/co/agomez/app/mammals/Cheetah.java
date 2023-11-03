package co.agomez.app.mammals;

public class Cheetah extends Feline {
    public Cheetah(float clawSize, int speed, String habitat, float height, float length, float weight) {
        super(clawSize, speed, habitat, height, length, weight);
    }

    @Override
    public String eat() {
        return "The Cheetah hunts in groups on the African plains, with a much lower bite force than other large felines.";
    }

    @Override
    public String sleep() {
        return "The Cheetah sleeps in the African savannas.";
    }

    @Override
    public String run() {
        return "The Cheetah is the fastest feline in the world, running at " + speed + " km/hr";
    }

    @Override
    public String communicate() {
        return "The Cheetah roars, but not as loudly as the Lion.";
    }
}
