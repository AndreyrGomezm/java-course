public enum Type {
    SEDAN("Sedan", "Medium car", 4),
    STATION_WAGON("Station Wagon", "Big car", 5),
    HATCHBACK("Hatchback", "Compact car", 5),
    PICKUP("Pickup", "Pickup truck", 4),
    COUPE("Coupe", "Small car", 2),
    CONVERTIBLE("Convertible", "Sports car", 2),
    VAN("Van", "Utility cart", 3),
    SUV("SUV", "All terrain sports", 5);

    private final String name;
    private final int doorNum;
    private final String description;

    private Type(String name, String description, int doorNum) {
        this.name = name;
        this.doorNum = doorNum;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public String getDescription() {
        return description;
    }
}
