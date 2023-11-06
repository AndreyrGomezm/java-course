package ui;

import model.*;

public class ConstructorsInheritanceExample {
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
        System.out.println("printing person type data");
        System.out.println("name: " + person.getName() + ", last name: " + person.getLastName()
                + ", age: " + person.getAge()
                + ", email: " + person.getEmail());

        if (person instanceof Professor) {
            System.out.println("printing professor type data");
            System.out.println("Subject: " + ((Professor) person).getSubject());
        }

        if (person instanceof Student) {
            System.out.println("printing student type data");
            System.out.println("Institution: " + ((Student) person).getInstitution());
            System.out.println("Math note: " + ((Student) person).getMathNote());
            System.out.println("History note: " + ((Student) person).getHistoryNote());
            System.out.println("Spanish note: " + ((Student) person).getSpanishNote());

            if (person instanceof InternationalStudent) {
                System.out.println("printing international student type data");
                System.out.println("Language note: " + ((InternationalStudent) person).getLanguageNote());
                System.out.println("Country: " + ((InternationalStudent) person).getCountry());
            }
            System.out.println("========================= Override average =========================");
            System.out.println("Average: " + ((Student) person).calculateAverage());

        }
        System.out.println("========================= Override greet =========================");
        System.out.println(person.greet());
        System.out.println("==================================================");
    }
}