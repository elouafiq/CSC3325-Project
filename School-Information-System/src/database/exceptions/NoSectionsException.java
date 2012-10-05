package database.exceptions;

public class NoSectionsException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoSectionsException() {
	}

	public NoSectionsException(String message) {
		super(message);
	}

	public NoSectionsException(Throwable cause) {
		super(cause);
	}

	public NoSectionsException(String message, Throwable cause) {
		super(message, cause);
	}

}
