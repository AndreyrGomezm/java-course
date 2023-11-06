package model.validator;

public class RequiredValidator extends Validator {
    protected String message = "field %s is required";

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean isValid(String value) {
        return (value != null && value.length() > 0);
    }
}
