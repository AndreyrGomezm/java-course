package co.agomez.app.model;

abstract public class Feline extends Mammal {
    protected float clawSize;
    protected int speed;

    public Feline(float clawSize, int speed, String habitat, float height, float length, float weight) {
        super(habitat, height, length, weight);
        this.clawSize = clawSize;
        this.speed = speed;
    }

    public float getClawSize() {
        return clawSize;
    }

    public int getSpeed() {
        return speed;
    }
}
