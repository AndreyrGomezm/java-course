package ui;

import model.*;

public class InheritanceExample {
    public static void main(String[] args) {

        System.out.println("========== Creating the Student class instance =====");
        Student student = new Student();
        student.setName("Andrey");
        student.setLastName("Gomez");
        student.setInstitution("National Institute");
        student.setSpanishNote(5.5);
        student.setHistoryNote(6.3);
        student.setMathNote(4.9);

        System.out.println("===== Creating the InternationalStudent class instance =====");
        InternationalStudent intStudent = new InternationalStudent();
        intStudent.setName("Peter");
        intStudent.setLastName("Gosling");
        intStudent.setCountry("Australia");
        intStudent.setAge(15);
        intStudent.setInstitution("National Institute");
        intStudent.setLanguageNote(6.8);
        intStudent.setSpanishNote(6.2);
        intStudent.setHistoryNote(5.8);
        intStudent.setMathNote(6.5);

        System.out.println("===== Creating the Professor class instance =====");
        Professor professor = new Professor();
        professor.setName("Lucí");
        professor.setLastName("Perez");
        professor.setSubject("Math");

        System.out.println("========== - ==========");
        System.out.println(student.getName() + " " + student.getLastName()
                + " " + student.getInstitution());

        System.out.println(intStudent.getName() + " " + intStudent.getLastName()
                + " " + intStudent.getInstitution()
                + " " + intStudent.getCountry());

        System.out.println("Professor " + professor.getSubject() + ": " +
                professor.getName() + " " + professor.getLastName());

        Class classIS = intStudent.getClass();
        while (classIS.getSuperclass() != null) {
            String daughter = classIS.getName();
            String dad = classIS.getSuperclass().getName();
            System.out.println(daughter + " is a child class of the parent class " + dad);
            classIS = classIS.getSuperclass();
        }
    }
}