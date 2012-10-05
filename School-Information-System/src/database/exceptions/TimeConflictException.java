package database.exceptions;

public class TimeConflictException extends Exception {

	private static final long serialVersionUID = 1L;

	public TimeConflictException() {
	}

	public TimeConflictException(String message) {
		super(message);
	}

	public TimeConflictException(Throwable cause) {
		super(cause);
	}

	public TimeConflictException(String message, Throwable cause) {
		super(message, cause);
	}

}
