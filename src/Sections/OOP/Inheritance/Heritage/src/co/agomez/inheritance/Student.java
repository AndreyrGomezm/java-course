package co.agomez.inheritance;

public class Student extends Person {
    private String institution;
    private double mathNote;
    private double spanishNote;
    private double historyNote;

    public Student() {
        System.out.println("Student: initializing constructor...");
    }

    public Student(String name, String lastName) {
        super(name, lastName);
    }

    public Student(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    public Student(String name, String lastName, int age, String institution) {
        super(name, lastName, age);
        this.institution = institution;
    }

    public Student(String name, String lastName, int age, String institution, double mathNote, double spanishNote,
            double historyNote) {
        this(name, lastName, age, institution);
        this.mathNote = mathNote;
        this.spanishNote = spanishNote;
        this.historyNote = historyNote;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public double getMathNote() {
        return mathNote;
    }

    public void setMathNote(double mathNote) {
        this.mathNote = mathNote;
    }

    public double getSpanishNote() {
        return spanishNote;
    }

    public void setSpanishNote(double spanishNote) {
        this.spanishNote = spanishNote;
    }

    public double getHistoryNote() {
        return historyNote;
    }

    public void setHistoryNote(double historyNote) {
        this.historyNote = historyNote;
    }

    public double calculateAverage() {
        return (historyNote + spanishNote + mathNote) / 3;
    }

    @Override
    public String greet() {
        return super.greet() + " I'm a student and my name's " + getName();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ninstitution='" + institution + '\'' +
                ", mathNote=" + mathNote +
                ", spanishNote=" + spanishNote +
                ", historyNote=" + historyNote +
                ", average=" + calculateAverage();
    }
}
