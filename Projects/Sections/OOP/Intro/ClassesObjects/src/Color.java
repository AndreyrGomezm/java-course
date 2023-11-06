public enum Color {
    RED("Red"),
    YELLOW("Yellow"),
    BlUE("Blue"),
    WHITE("White"),
    GREY("Dark grey"),
    ORANGE("Orange");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }
}
