package lectures.two;

import java.util.Scanner;

// Test Plan:
// (1) Negative entered first, Expected: exists immediately, Actual: exists immediately
// (2) Numbers entered followed by negative, Expected: correct average, Actual: correct average
// (3) 10 Numbers entered, Expected: no more prompts and correct average, Actual: no more prompts and correct average

public class ExampleThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean done = false;
		int entered = 0;
		int total = 0;
		
		while (!done) {
			System.out.println("Enter an integer (" + (entered + 1) + "): ");
			int value = input.nextInt();
			
			if (value >= 0) {
				total = total + value;
				entered = entered + 1;
				
				if (entered == 10) {
					done = true;
				}
			} else {
				// entered a negative, finished.
				done = true;
			}
		}
		
		if (entered == 0) {
			System.out.println("Goodbye");
		} else {
			System.out.println("Average: " + (total/entered));
		}
	}

}
