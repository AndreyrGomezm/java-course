package co.agomez.app.client.elements;

import java.util.*;

import co.agomez.app.client.validator.Validator;
import co.agomez.app.client.validator.message.IFormattableMessage;
import co.agomez.app.validator.*;

abstract public class FormElement {
    protected String name;
    protected String value;

    private List<String> errors;
    private List<Validator> validators;

    public FormElement() {
        validators = new ArrayList<>();
        errors = new ArrayList<>();
    }

    public FormElement(String name) {
        this();
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getErrors() {
        return errors;
    }

    public FormElement addValidator(Validator validator) {
        validators.add(validator);
        return this;
    }

    public boolean isValidate() {
        for (Validator v : validators) {
            if (!v.isValid(value)) {
                if (v instanceof IFormattableMessage) {
                    errors.add(((IFormattableMessage) v).getFormattedMessage(name));
                } else {
                    errors.add(String.format(v.getMessage(), name));
                }
            }
        }
        return errors.isEmpty();
    }

    abstract public String drawHtml();
}