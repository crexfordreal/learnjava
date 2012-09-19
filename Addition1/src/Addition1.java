import java.util.Scanner;

public class Addition1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		int number1 = 0;
		int number2 = 0;
		int sum = 0;
		
		System.out.print( "Please enter the first number: ");
		number1 = input.nextInt();
		
		System.out.print( "Please enter the second number: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		System.out.printf("The sum of %d and %d is %d\n", number1, number2, sum);

	}

}
