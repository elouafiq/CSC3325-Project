package database.exceptions;

public class SectionNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public SectionNotFoundException() {
	}

	public SectionNotFoundException(String message) {
		super(message);
	}

	public SectionNotFoundException(Throwable cause) {
		super(cause);
	}

	public SectionNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
