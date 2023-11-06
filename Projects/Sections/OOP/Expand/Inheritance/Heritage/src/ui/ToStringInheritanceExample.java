package ui;

import model.*;

public class ToStringInheritanceExample {
    public static void main(String[] args) {

        System.out.println("========== Creating the Student class instance =====");
        Student student = new Student("Andrey", "Gomez", 18, "Icesi University");
        student.setSpanishNote(5.5);
        student.setHistoryNote(6.3);
        student.setMathNote(4.9);
        student.setEmail("andrey@email.com");

        System.out.println("===== Creating the InternationalStudent class instance =====");
        InternationalStudent intStudent = new InternationalStudent("Peter", "Gosling", "Australia");
        intStudent.setAge(15);
        intStudent.setInstitution("National Institute");
        intStudent.setLanguageNote(6.8);
        intStudent.setSpanishNote(6.2);
        intStudent.setHistoryNote(5.8);
        intStudent.setMathNote(6.5);
        intStudent.setEmail("peter@email.com");

        System.out.println("===== Creating the Professor class instance =====");
        Professor professor = new Professor("Lucí", "Perez", "Math");
        professor.setAge(37);
        professor.setEmail("professor.luci@email.com");

        System.out.println("========== - ==========");
        print(student);
        print(intStudent);
        print(professor);
    }

    public static void print(Person person) {
        System.out.println("========== - ==========");
        System.out.println(person);
    }
}