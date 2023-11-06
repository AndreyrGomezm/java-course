package model;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String email;

    public Person() {
        System.out.println("Person: initializing constructor...");
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Person(String name, String lastName, int age) {
        this(name, lastName);
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String greet() {
        return "Hi, how are you?";
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", greet='" + greet() + '\'';
    }
}