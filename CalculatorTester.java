import java.util.*;

/**
 * @author Arash
 *
 */
public class CalculatorTester {

	public static void main(String[] args) {

		Calculator clerk = new Calculator();
		Scanner keyboard = new Scanner(System.in);
		double nextNumber = 0.0;

		System.out.println("Calculator is on.");
		System.out.print("Format of each line: ");
		System.out.println("operator space number");
		System.out.println("For example: + 3");

		while (true) {
			System.out.println("To end, enter the letter e." + 
							   "\nTo save, enter letter m."+ 
							   "\nTo clear, enter the letter c." + 
							   "\nTo recall, enter the letter r.");

			System.out.println("\nresult = " + clerk.getResult());

			// determines if user entered e,m,c,r
			char nextOp = keyboard.next().charAt(0);
			try {
				clerk.doCalculation(nextOp);
			} catch (UnknownOpException e) {
				System.out.println(e.getMessage());
				keyboard.nextLine();
				continue;
			}

			// number validation
			try {
				nextNumber = keyboard.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Generic InputMismatchException Occured.");
				continue;
			}

			// evaluate the user input
			try {
				clerk.evaluate(nextOp, clerk.getResult(), nextNumber);
				System.out.println("result " + nextOp + " " + nextNumber + " = " + clerk.getResult());

				// catches issues with dividing by invalid number and operator
			} catch (DivideByZeroException e) {
				System.out.println(e.getMessage());
				keyboard.nextLine();
				continue;
			} catch (UnknownOpException e) {
				System.out.println(e.getMessage());
				keyboard.nextLine();
				continue;
			}
		}

	}
}