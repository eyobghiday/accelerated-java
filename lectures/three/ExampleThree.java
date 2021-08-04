package lectures.three;

import java.util.Scanner;

public class ExampleThree {

	// This program does the following:
	// 1. Prompt the user for the number of values they plan to enter
	// 2. Prompt the user for values until they enter a negative number
	// 3. Print out the values entered
	
	public static void main(String[] args) {
		double[] values;
		// Prompt for number of values to be entered
		Scanner input = new Scanner(System.in);
		
		System.out.print("About how many numbers: ");
		int n = input.nextInt();
		
		// Prompt for n values
		values = new double[n];
		double value = 0.0;
		int i = 0;
		do {
			System.out.print("Enter value " + (i+1) + ": ");
			value = input.nextDouble();
			if (value > 0.0) {
				if (i >= values.length) { // Resize my array
					double[] temp = new double[values.length + 10];
					for (int j=0; j<values.length; j++) {
						temp[j] = values[j];
					}
					values = temp;
					temp = null;
				}
				values[i] = value;
				i++;
			}
		} while (value > 0.0);
		
		if (i < values.length) { // Should we trim the array?
			double[] temp = new double[i]; // Trim the array to exactly the number of values entered
			for (int j=0; j<i; j++) {
				temp[j] = values[j];
			}
			values = temp;
			temp = null;
		}
		
		// Print out values
		for (i=0; i<values.length; i++) {
			System.out.print(values[i] + (i==(values.length-1)?"":", "));
		}
	}

}
