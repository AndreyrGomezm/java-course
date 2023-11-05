package co.agomez.app.model;

abstract public class Mammal {

    protected String habitat;
    protected float height;
    protected float length;
    protected float weight;
    protected String scientificName;

    public Mammal(String habitat, float height, float length, float weight, String scientificName) {
        this.habitat = habitat;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.scientificName = scientificName;
    }

    public Mammal(String habitat, float height, float length, float weight) {
        this.habitat = habitat;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getHeight() {
        return height;
    }

    public float getLength() {
        return length;
    }

    public String getScientificName() {
        return scientificName;
    }

    public float getWeight() {
        return weight;
    }

    abstract public String eat();

    abstract public String sleep();

    abstract public String run();

    abstract public String communicate();
}
