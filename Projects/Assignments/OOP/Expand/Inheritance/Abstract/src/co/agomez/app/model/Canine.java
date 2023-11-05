package co.agomez.app.model;

abstract public class Canine extends Mammal {
    protected String color;
    protected float fangSize;

    public Canine(float fangSize, String color, String habitat, float height, float length, float weight) {
        super(habitat, height, length, weight);
        this.color = color;
        this.fangSize = fangSize;
    }

    public String getColor() {
        return color;
    }

    public float getFangSize() {
        return fangSize;
    }
}
