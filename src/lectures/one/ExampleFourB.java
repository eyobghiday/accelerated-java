package lectures.one;

import java.util.Scanner;

public class ExampleFourB {
	
	// Want: ask the user for 3 numbers, assign the minimum to a variable
	
	// 1. Prompt for number 1 (x)
	// 2. Prompt for number 2 (y)
	// 3. Prompt for number 3 (z)
	// 4. Set variable (min) to minimum of number 1 (x), number 2 (y), number 3 (z)
	// 5. Print value of min

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Implement step 1
		System.out.println("Enter a number: ");
		int x = scan.nextInt();
		
		// Implement step 2
		System.out.println("Enter another number: ");
		int y = scan.nextInt();
		
		// Implement step 3
		System.out.println("Enter a third number: ");
		int z = scan.nextInt();
		
		// Implement step 4
		int min = (x < y) ? (x < z ? x : z) : (y < z ? y : z);
		
		// Implement step 5
		System.out.println("The minimum is " + min);
		
	}

}
