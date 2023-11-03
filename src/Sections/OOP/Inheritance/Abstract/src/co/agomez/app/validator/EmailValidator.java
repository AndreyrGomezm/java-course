package co.agomez.app.validator;

public class EmailValidator extends Validator {
    protected String message = "field %s has an invalid mail format";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

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
