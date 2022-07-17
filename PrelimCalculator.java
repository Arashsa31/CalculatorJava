
/**
 * @author Arash
 *
 */

import java.util.Scanner;

public class PrelimCalculator {

	// attributes
	private double result;

	// default constructor
	public PrelimCalculator() {
		result = 0.0;
	}

	public void reset() {
		result = 0.0;
	}

	/**
	 * @param newResult
	 */
	public void setResult(double result) {
		this.result = result;
	}

	/**
	 * @return result
	 */
	public double getResult() {
		return result;
	}

	/**
	 * @param op
	 * @param n1
	 * @param n2
	 * @throws DivideByZeroException
	 * @throws UnknownOpException
	 * @returns n1 op n2, provided op is one of '+', '–', '*',or '/'. Any other
	 *          value of op throws UnknownOpException.
	 */
	public void evaluate(char op, double n1, double n2) throws DivideByZeroException, UnknownOpException {
		double answer;
		switch (op) {
		case '+':
			answer = n1 + n2;
			break;
		case '-':
			answer = n1 - n2;
			break;
		case '*':
			answer = n1 * n2;
			break;
		case '/':
			if (n2 == 0)
				throw new DivideByZeroException();
			answer = n1 / n2;
			break;
		default:
			throw new UnknownOpException(op);
		}
		setResult(answer);
	}

	/**
	 * @param op
	 * @throws UnknownOpException
	 */
	public void evaluate(char op) throws UnknownOpException {
		switch (op) {
		case '+':
		case '-':
		case '*':
		case '/':
			break;
		default:
			throw new UnknownOpException(op);
		}
	}
}