package database.exceptions;

public class StudentNotFoundInSectionException extends Exception {

	private static final long serialVersionUID = 1L;

	public StudentNotFoundInSectionException() {
	}

	public StudentNotFoundInSectionException(String message) {
		super(message);
	}

	public StudentNotFoundInSectionException(Throwable cause) {
		super(cause);
	}

	public StudentNotFoundInSectionException(String message, Throwable cause) {
		super(message, cause);
	}

}
