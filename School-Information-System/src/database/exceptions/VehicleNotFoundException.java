package database.exceptions;

public class VehicleNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public VehicleNotFoundException() {
		super();
	}

	public VehicleNotFoundException(String message) {
		super(message);
	}

	public VehicleNotFoundException(Throwable cause) {
		super(cause);
	}

	public VehicleNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
