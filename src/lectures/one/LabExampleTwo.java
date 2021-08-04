package lectures.one;

import java.util.Scanner;

public class LabExampleTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//Create Scanner
		
		System.out.println("Enter one or two: ");	//Prompt for input
		
		String word = input.nextLine();	//Read input
		
		int response = "one".equalsIgnoreCase(word) ? 1: 2;	//Conditional with Strings in condition, returns integer
		
		System.out.println(response);	//Print response
	}

}
