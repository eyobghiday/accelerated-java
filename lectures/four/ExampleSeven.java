package lectures.four;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExampleSeven {

	// This program does the following:
	// 1. Prompt the user for the number of values they plan to enter
	// 2. Prompt the user for values until they enter a negative number
	// 3. Prompt the user with a variety of options to get information about the values entered
	// 4. implement menu options
	// 5. exit successfully
	
	// Method keeps prompting the user for an integer and returns once they have
	public static int promptForInt(Scanner input, String prompt) {
		int n = 0;
		boolean done = false;
		do {
			String value = "";
			try {
				System.out.print(prompt);
				value = input.nextLine();
				n = Integer.parseInt(value);
				done = true;
			} catch (NumberFormatException e) {
				System.out.println("\"" + value + "\" is not an integer...");
			}
		} while (!done);
		
		return n;
	}
	
	// Method keeps prompting the user for a double and returns once they have
	public static double promptForDouble(Scanner input, String prompt) {
		double n = 0;
		boolean done = false;
		do {
			String value = "";
			try {
				System.out.print(prompt);
				value = input.nextLine();
				n = Double.parseDouble(value);
				done = true;
			} catch (NumberFormatException e) {
				System.out.println("\"" + value + "\" is not number...");
			}
		} while (!done);
		
		return n;
	}
	
	// Save the contents of our array to a file specified by the user (in this directory)
	public static void saveToFile(Scanner input, double[] values) {
		System.out.print("Filename: ");
		String name = input.nextLine();
		
		try {
			FileWriter out = new FileWriter("src/lectures/four/" + name);
			
			for (int i=0; i<values.length; i++) {
				out.write(values[i] + "\n");
				out.flush();
			}
			
			out.close();
		} catch (IOException io) {
			System.out.println("Error saving to file.");
		}
	}
	
	// Calculate the total of the array
	public static double total(double[] values) {
		double total = 0.0;
		for (int i=0; i<values.length; i++) {
			total = total + values[i];
		}
		
		return total;
	}
	
	// Calculate the average value in the array
	public static double average(double[] values) {
		double total = total(values);
		
		return total / values.length;
	}
	
	// Find the minimum value in the array
	public static double min(double[] array) {
		double min = array[0];
		for (int i=1; i<array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
	}
	
	// Find the maximum value in the array
	public static double max(double[] array) {
		double max = array[0];
		for (int i=1; i<array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		double[] values;
		// Prompt for number of values to be entered
		Scanner input = new Scanner(System.in);
		
		int n = promptForInt(input, "About how many numbers: ");
		
		// Prompt for n values
		values = new double[n];
		double value = 0.0;
		int i = 0;
		do {
			value = promptForDouble(input, "Enter value " + (i+1) + ": ");
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
		
		boolean done = false;
		do {
			// print menu
			System.out.println();
			System.out.println("1. Find minimum");
			System.out.println("2. Find maximum");
			System.out.println("3. Find average");
			System.out.println("4. Find total");
			System.out.println("5. Save to file");
			System.out.println("6. Exit");
			// prompt for option
			int opt = promptForInt(input, "Enter your choice: ");
			// switch over option selected
			switch (opt) {
				case 0:	// Hidden option to print out values in the array
					for (i=0; i<values.length; i++) {
						System.out.print(values[i] + (i==(values.length-1)?"":", "));
					}
					System.out.println();
					break;
				case 1: // min
					System.out.println("The minimum is " + min(values));
					break;
				case 2: // max
					System.out.println("The maximum is " + max(values));
					break;
				case 3: // average
					System.out.println("The average is " + average(values));
					break;
				case 4: // total
					System.out.println("The total is " + total(values));
					break;
				case 5: // save
					saveToFile(input, values);
					break;
				case 6:	// exit
					done = true;
					break;
				default:
					System.out.println(opt + " is not a valid option.");
			}
		} while (!done);
		
		System.out.println("Goodbye!"); // Say goodbye
	}

}
