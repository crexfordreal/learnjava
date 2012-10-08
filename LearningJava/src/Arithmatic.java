// Exercise 2.15
import java.util.Scanner;

public class Arithmatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		int number1 = 0;
		int number2 = 0;
		int sum = 0;
		int product = 0;
		int difference = 0;
		int quotient = 0;
		
		System.out.print( "Please enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print( "Please enter second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		difference = number1 - number2;
		product = number1 * number2;
		quotient = number1 / number2;
		
		System.out.printf( "Sum: %d\nDifference: %d\nProduct: %d\nQuotient: %d", sum, difference, product, quotient);
	}

}
