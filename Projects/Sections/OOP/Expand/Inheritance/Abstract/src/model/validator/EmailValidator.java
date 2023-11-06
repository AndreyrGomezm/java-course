package model.validator;

public class EmailValidator extends Validator {
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";
    protected String message = "field %s has an invalid mail format";

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
        return value.matches(EMAIL_REGEX);
    }
}
