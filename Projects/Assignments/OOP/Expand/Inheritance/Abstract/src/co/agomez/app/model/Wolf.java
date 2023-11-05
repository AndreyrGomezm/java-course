package co.agomez.app.model;

public class Wolf extends Canine {

    private int packSize;
    private String wolfSpecies;

    public Wolf(int packSize, String wolfSpecies, float fangSize, String color, String habitat, float height,
            float length, float weight) {
        super(fangSize, color, habitat, height, length, weight);
        this.packSize = packSize;
        this.wolfSpecies = wolfSpecies;
    }

    public String getWolfSpecies() {
        return wolfSpecies;
    }

    public int getPackSize() {
        return packSize;
    }

    @Override
    public String eat() {
        return "The " + wolfSpecies + " Wolf hunts with its pack of " + packSize + " individuals in the forests of "
                + habitat;
    }

    @Override
    public String sleep() {
        return "The " + color + " Wolf sleeps in the caves of " + habitat;
    }

    @Override
    public String run() {
        return "The " + wolfSpecies + " Wolf runs on the plains near the forests of " + habitat;
    }

    @Override
    public String communicate() {
        return "The " + wolfSpecies + " Wolf " + color + " howls under the full moon.";
    }
}
