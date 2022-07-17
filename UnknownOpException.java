/**
 * @author Arash
 *
 */

public class UnknownOpException extends Exception {

	// default constructor
	public UnknownOpException() {
		super("UnknownOpException");
	}

	// overloaded constructor
	public UnknownOpException(char op) {
		super(op + " is an unknown operator.");
	}

	public UnknownOpException(String message) {
		super(message);
	}
}