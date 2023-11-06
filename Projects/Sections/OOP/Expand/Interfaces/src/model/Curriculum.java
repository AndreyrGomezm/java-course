package model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Sheet implements IPrintable {
    private final Person person;
    private final String career;
    private final List<String> experiences;

    public Curriculum(Person person, String career, String content) {
        super(content);
        this.person = person;
        this.career = career;
        experiences = new ArrayList<>();
    }

    public Curriculum addExperience(String exp) {
        experiences.add(exp);
        return this;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder("Name: ");
        sb.append(person).append("\n")
                .append("Summary: ").append(content).append("\n")
                .append("Profession: ").append(career).append("\n")
                .append("Experiences: \n");
        for (String exp : experiences) {
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }

}
