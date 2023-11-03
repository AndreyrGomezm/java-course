package co.agomez.inheritance;

public final class InternationalStudent extends Student {
    private String country;
    private double languageNote;

    public InternationalStudent() {
        System.out.println("InternationalStudent: initializing constructor...");
    }

    public InternationalStudent(String name, String lastName) {
        super(name, lastName);
    }

    public InternationalStudent(String name, String lastName, String country) {
        super(name, lastName);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLanguageNote() {
        return languageNote;
    }

    public void setLanguageNote(double languageNote) {
        this.languageNote = languageNote;
    }

    @Override
    public String greet() {
        return super.greet() + ", I am a foreign student from the country " + getCountry();
    }

    @Override
    public double calculateAverage() {
        return ((super.calculateAverage() * 3) + languageNote) / 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncountry='" + country + '\'' +
                ", languageNote=" + languageNote;
    }

}
