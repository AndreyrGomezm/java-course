package model;

public class Person {
    public static final String MALE_GENDER = "Male";
    public static final String FEMALE_GENDER = "Female";
    private String name;
    private String lastName;
    private HairColor hairColor;

    public static String greet() {
        return "Hi how are you!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public String throwBall() {
        return "Throw the ball to the dog!";
    }
}
