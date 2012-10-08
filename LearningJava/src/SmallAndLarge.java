// Exercise 2.17
import java.util.Scanner;

public class SmallAndLarge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int sum = 0;
		int product = 0;
		int average = 0;
		int smallest = 0;
		int largest = 0;
		
		System.out.print( "Please enter first integer: ");
		num1 = input.nextInt();
		
		System.out.print( "Please enter second integer: ");
		num2 = input.nextInt();
		
		System.out.print( "Please enter third integer: ");
		num3 = input.nextInt();
		
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		average = sum / 3;
		
		if ( num1 > num2 && num1 > num3 ) {
			largest = num1;
			if ( num2 < num3 ) {
				smallest = num2;
			}
			else {
				smallest = num3;
			}
		}
		else if ( num2 > num1 && num2 > num3 ) {
			largest = num2;
			if ( num1 < num3 ){
				smallest = num1;
			}
			else {
				smallest = num3;
			}
		}
		else if ( num3 > num1 && num3 > num2 ) {
			largest = num3;
			if ( num1 < num2 ){
				smallest = num1;
			}
			else {
				smallest = num2;
			}
		}
	
		System.out.printf( "Sum: %d\nProduct: %d\nAverage: %d\nLargest: %d\nSmallest: %d", sum, product, average, largest, smallest);

	}

}
