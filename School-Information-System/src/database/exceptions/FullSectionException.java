package database.exceptions;

public class FullSectionException extends Exception {

	private static final long serialVersionUID = 1L;

	public FullSectionException() {

	}

	public FullSectionException(String message) {
		super(message);
	}

	public FullSectionException(Throwable cause) {
		super(cause);
	}

	public FullSectionException(String message, Throwable cause) {
		super(message, cause);
	}

}
