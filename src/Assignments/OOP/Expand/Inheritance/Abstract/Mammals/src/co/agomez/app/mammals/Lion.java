package co.agomez.app.mammals;

public class Lion extends Feline {

    private int prideMembers;
    private double roarPowerInDecibels;

    public Lion(double roarPowerInDecibels, int prideMembers, float clawSize, int speed, String habitat, float height,
            float length, float weight) {
        super(clawSize, speed, habitat, height, length, weight);
        this.prideMembers = prideMembers;
        this.roarPowerInDecibels = roarPowerInDecibels;
    }

    public int getNumberOfPrideMembers() {
        return prideMembers;
    }

    public double getRoarPowerInDecibels() {
        return roarPowerInDecibels;
    }

    @Override
    public String eat() {
        return "The Lion hunts with its group of " + prideMembers + " individuals on the African plains.";
    }

    @Override
    public String sleep() {
        return "The Lion sleeps in the African savannas.";
    }

    @Override
    public String run() {
        return "The Lion runs at " + speed + " km/hr";
    }

    @Override
    public String communicate() {
        return "The Lion roars loudly at " + roarPowerInDecibels + " decibels.";
    }
}
