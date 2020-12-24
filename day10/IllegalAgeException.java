package day10;

public class IllegalAgeException extends Exception {
	String msg;

	public IllegalAgeException(String msg) {
		super();
		this.msg = msg;
	}

}
