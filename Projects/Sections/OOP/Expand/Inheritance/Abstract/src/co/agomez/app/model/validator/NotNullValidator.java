package co.agomez.app.model.validator;

public class NotNullValidator extends Validator {
    protected String message = "field %s cannot be null";

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
        return (value != null);
    }
}
