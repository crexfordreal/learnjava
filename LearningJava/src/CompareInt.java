// Exercise 2.16
import java.util.Scanner;

public class CompareInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.print( "Please enter first integer: ");
		num1 = input.nextInt();
		
		System.out.print( "Please enter second integer: ");
		num2 = input.nextInt();
		
		if ( num1 == num2 ){
			System.out.printf( "These numbers are equal.");
		}
		
		if ( num1 > num2 ){
			System.out.printf( "%d is larger.", num1);
		}
		
		if ( num2 > num1){
			System.out.printf( "%d is larger.", num2);
		}

	}

}
