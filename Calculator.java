import java.util.Scanner;

/**
 * 
 */

/**
 * @author Arash
 *
 */
public class Calculator extends PrelimCalculator {

	// attribute
	private double memory;

	// default constructor
	public Calculator() {
		super();
		memory = 0.0;
	}

	/**
	 * @param memory
	 */
	public void setMemory(double memory) {
		this.memory = memory;
	}

	/**
	 * @return memory
	 */
	public double getMemory() {
		return memory;
	}

	/**
	 * @param nextOp
	 * @throws UnknownOpException
	 */
	public void doCalculation(char nextOp) throws UnknownOpException {

		if ((nextOp == 'e') || (nextOp == 'E')) {
			System.out.println("The final result is " + getResult());
			System.out.println("Calculator program ending.");
			System.exit(0);
		} else if ((nextOp == 'c') || (nextOp == 'C')) {
			reset();
			throw new UnknownOpException("result = " + getResult());
		} else if ((nextOp == 'm') || (nextOp == 'M')) {
			memory = getResult();
			throw new UnknownOpException("memory = " + getMemory());
		} else if ((nextOp == 'r') || (nextOp == 'R')) {
			throw new UnknownOpException("recalled memory value = " + getMemory());
		} else
			super.evaluate(nextOp);
	}
}