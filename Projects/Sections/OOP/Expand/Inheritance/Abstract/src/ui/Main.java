package ui;

import model.elements.select.Option;
import model.validator.*;
import model.elements.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidator(new RequiredValidator());

        InputForm password = new InputForm("password", "password");
        password.addValidator(new RequiredValidator())
                .addValidator(new LongValidator(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidator(new RequiredValidator())
                .addValidator(new EmailValidator());

        InputForm age = new InputForm("age", "number");
        age.addValidator(new NumValidator());

        TextareaForm experience = new TextareaForm("exp", 5, 9);

        SelectForm language = new SelectForm("language");
        language.addValidator(new NotNullValidator());

        language.addOption(new Option("1", "Java").setSelected())
                .addOption(new Option("2", "Python"))
                .addOption(new Option("3", "JavaScript"))
                .addOption(new Option("4", "TypeScript"))
                .addOption(new Option("5", "PHP"));

        FormElement greet = new FormElement("greet") {
            @Override
            public String drawHtml() {
                return "<input disabled name'" + name + "' value='" + value + "'>";
            }
        };

        greet.setValue("Hi, how are you, this field is disabled!");
        username.setValue("John.doe");
        password.setValue("a1b2c3");
        email.setValue("john.doe@email.com");
        age.setValue("28");
        experience.setValue("... over 10 years of experience ...");

        List<FormElement> elements = Arrays.asList(username, password, email, age, experience, language, greet);

        elements.forEach(e -> {
            System.out.println(e.drawHtml());
            System.out.println("<br>");
        });

        elements.forEach(e -> {
            if (!e.isValidate()) {
                e.getErrors().forEach(System.out::println);
            }
        });
    }
}
