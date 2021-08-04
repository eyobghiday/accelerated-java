package lectures.three;

import java.util.Scanner;

public class ExampleTwo {

	// This program does the following:
	// 1. Prompt the user for the number of values they plan to enter
	// 2. Prompt the user for that many values and store in an array
	// 3. Print out the values entered
	
	public static void main(String[] args) {
		double[] values;
		// Prompt for number of values to be entered
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of values: ");
		int n = input.nextInt();
		
		// Prompt for n values
		values = new double[n];
		for (int i=0; i<n; i++) {
			System.out.print("Enter value " + (i+1) + " of " + n + ": ");
			double value = input.nextDouble();
			values[i] = value;
		}
		
		// Print out values
		for (int i=0; i<values.length; i++) {
			System.out.print(values[i] + (i==(values.length-1)?"":", "));
		}
	}

}
