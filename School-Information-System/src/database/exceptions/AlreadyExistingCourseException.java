package database.exceptions;

public class AlreadyExistingCourseException extends Exception {

	private static final long serialVersionUID = 1L;

	public AlreadyExistingCourseException() {
	}

	public AlreadyExistingCourseException(String message) {
		super(message);
	}

	public AlreadyExistingCourseException(Throwable cause) {
		super(cause);
	}

	public AlreadyExistingCourseException(String message, Throwable cause) {
		super(message, cause);
	}

}
