package pixogram.sprint1;

public class ValidationException extends Exception {
	String message;

	public ValidationException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "ValidationException [message=" + message + "]";
	}

}
