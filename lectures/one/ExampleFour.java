package lectures.one;

import java.util.Scanner;

public class ExampleFour {
	
	// Want: ask the user for 2 numbers, assign the minimum to a variable
	
	// 1. Prompt for number 1 (x)
	// 2. Prompt for number 2 (y)
	// 3. Set variable (min) to minimum of number 1 (x) and number 2 (y)
	// 4. Print value of min

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Implement step 1
		System.out.println("Enter a number: ");
		int x = scan.nextInt();
		
		// Implement step 2
		System.out.println("Enter another number: ");
		int y = scan.nextInt();

		// Implement step 3 (option 1)
//		int min;
//		if (x < y) {
//			min = x;
//		} else {
//			min = y;
//		}
		
		// Implement step 3 (option 2)
		int min = (x < y) ? x : y;
		
		// Implement step 4
		System.out.println("The minimum is " + min);
		
	}

}
