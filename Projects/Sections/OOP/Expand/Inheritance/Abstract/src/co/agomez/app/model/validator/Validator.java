package co.agomez.app.model.validator;

abstract public class Validator {
    protected String message;

    abstract public String getMessage();

    abstract public void setMessage(String message);

    abstract public boolean isValid(String value);
}
