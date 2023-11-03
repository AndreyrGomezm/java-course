public class Automobile implements Comparable<Automobile> {

    private int id;
    private String maker;
    private String model;
    private Color color = Color.GREY;
    private Motor motor;
    private Pond pond;
    private Person owner;
    private Wheel[] wheels;
    private int indexWheels;

    private Type type;

    private static Color patentColor = Color.ORANGE;
    private static int staticPondCapacity = 30;
    private static int lastId;

    public static final int MAXIMUM_ROAD_SPEED = 120;
    public static final int MAXIMUM_CITY_SPEED = 60;

    public static final String COLOR_RED = "Red";
    public static final String COLOR_YELLOW = "Yellow";
    public static final String COLOR_BLUE = "Blue";
    public static final String COLOR_WHITE = "White";
    public static final String COLOR_GREY = "Dark gray";
    public static final String COLOR_ORANGE = "Orange";

    public Automobile() {
        id = ++lastId;
        wheels = new Wheel[5];
    }

    public Automobile(String maker, String model) {
        this();
        this.maker = maker;
        this.model = model;
    }

    public Automobile(String maker, String model, Color color) {
        this(maker, model);
        this.color = color;
    }

    public Automobile(String maker, String model, Color color, Motor motor) {
        this(maker, model, color);
        this.color = color;
        this.motor = motor;
    }

    public Automobile(String maker, String model, Color color, Motor motor, Pond pond) {
        this(maker, model, color, motor);
        this.pond = pond;
    }

    public Automobile(String maker, String model, Color color, Motor motor, Pond pond, Person owner, Wheel[] wheels) {
        this(maker, model, color, motor, pond);
        this.owner = owner;
        this.wheels = wheels;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Pond getPond() {
        if (pond == null) {
            this.pond = new Pond();
        }
        return pond;
    }

    public void setPond(Pond pond) {
        this.pond = pond;
    }

    public static Color getPatentColor() {
        return patentColor;
    }

    public static void setPatentColor(Color patentColor) {
        Automobile.patentColor = patentColor;
    }

    public static int getStaticPondCapacity() {
        return staticPondCapacity;
    }

    public static void setStaticPondCapacity(int staticPondCapacity) {
        Automobile.staticPondCapacity = staticPondCapacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Automobile addWheels(Wheel wheel) {
        if (indexWheels < wheels.length) {
            wheels[indexWheels++] = wheel;
        }
        return this;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String detail() {
        String d = "id = " + id +
                "\nmaker = " + maker +
                "\nmodel = " + model;

        if (getType() != null) {
            d += "\ntype = " + getType().getDescription();
        }

        d += "\ncolor = " + color +
                "\npatentColor = " + patentColor;

        if (motor != null) {
            d += "\ndisplacement = " + motor.getDisplacement();
        }
        if (owner != null) {
            d += "\nAutomobile owner: " + getOwner();
        }

        if (getWheels() != null) {
            d += "\nautomobile wheels:";
            for (Wheel w : getWheels()) {
                d += "\n" + w.getMaker() + ", Ring: " + w.getRing() + ", Wide:" + w.getWide();
            }
        }
        return d;
    }

    public String speedUp(int rpm) {
        return "The " + maker + " car accelerating at " + rpm + "rpm";
    }

    public String curb() {
        return maker + " " + model + " braking!";
    }

    public String accelerateCurb(int rpm) {
        String speedUp = speedUp(rpm);
        String curb = curb();
        return speedUp + "\n" + curb;
    }

    public double calculateConsumption(int km, double percentageBenzine) {
        return km / (getPond().getCapacity() * percentageBenzine);
    }

    public double calculateConsumption(int km, int percentageBenzine) {
        return km / (getPond().getCapacity() * (percentageBenzine / 100d));
    }

    public static double calculateStaticConsumption(int km, int percentageBenzine) {
        return km / (staticPondCapacity * (percentageBenzine / 100d));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Automobile)) {
            return false;
        }
        Automobile a = (Automobile) obj;
        return (this.maker != null && this.maker.equals(a.maker) && this.model != null && this.model.equals(a.model));
    }

    @Override
    public String toString() {
        return id + " " + maker + " " + model;
    }

    @Override
    public int compareTo(Automobile a) {
        return maker.compareTo(a.maker);
    }
}