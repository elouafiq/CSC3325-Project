package database.exceptions;

public class StudentAlreadyEnrolledException extends Exception {

	private static final long serialVersionUID = 1L;

	public StudentAlreadyEnrolledException() {
	}

	public StudentAlreadyEnrolledException(String message) {
		super(message);
	}

	public StudentAlreadyEnrolledException(Throwable cause) {
		super(cause);
	}

	public StudentAlreadyEnrolledException(String message, Throwable cause) {
		super(message, cause);
	}

}
