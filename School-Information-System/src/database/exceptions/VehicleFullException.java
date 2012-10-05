package database.exceptions;

public class VehicleFullException extends Exception {


	private static final long serialVersionUID = 1L;

	public VehicleFullException() {
		super();
	}

	public VehicleFullException(String message) {
		super(message);
	}

	public VehicleFullException(Throwable cause) {
		super(cause);
	}

	public VehicleFullException(String message, Throwable cause) {
		super(message, cause);
	}

}
