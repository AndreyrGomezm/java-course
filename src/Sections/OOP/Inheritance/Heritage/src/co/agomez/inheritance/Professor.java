package co.agomez.inheritance;

public class Professor extends Person {
    private String subject;

    public Professor() {
        System.out.println("Professor: initializing constructor...");
    }

    public Professor(String name, String lastName) {
        super(name, lastName);
    }

    public Professor(String name, String lastName, String subject) {
        super(name, lastName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String greet() {
        return "Good morning i'm the professor of " + getSubject() + ", my name's" + getSubject();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nsubject='" + subject + '\'';
    }
}
