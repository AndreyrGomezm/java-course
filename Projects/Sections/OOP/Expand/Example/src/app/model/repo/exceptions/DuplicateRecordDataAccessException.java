package app.model.repo.exceptions;

public class DuplicateRecordDataAccessException extends WriteDataAccessException {
    public DuplicateRecordDataAccessException(String message) {
        super(message);
    }
}
