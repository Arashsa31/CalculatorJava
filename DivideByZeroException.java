/**
 * @author Arash
 *
 */

public class DivideByZeroException extends Exception {

	// default constructor
	public DivideByZeroException() {
		super("Dividing by Zero!");
	}

	// overloaded constructor
	public DivideByZeroException(String message) {
		super(message);
	}
}