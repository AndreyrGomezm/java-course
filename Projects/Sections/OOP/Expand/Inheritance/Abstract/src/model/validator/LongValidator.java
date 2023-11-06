package model.validator;

import model.validator.message.IFormattableMessage;

public class LongValidator extends Validator implements IFormattableMessage {
    protected String message = "field %s must have min %d characters and max %d characters";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LongValidator() {
    }

    public LongValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public boolean isValid(String value) {
        if (value == null) {
            return true;
        }
        int length = value.length();
        return (length >= min && length <= max);
    }

    @Override
    public String getFormattedMessage(String field) {
        return String.format(message, field, min, max);
    }
}
