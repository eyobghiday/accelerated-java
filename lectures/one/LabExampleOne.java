package lectures.one;

import java.util.Scanner;

public class LabExampleOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//Create the Scanner
		
		System.out.println("Enter yes or no: ");	//Prompt for input
		
		String word = input.nextLine();	//Read input
		
		String response = "yes".equalsIgnoreCase(word) ? "no": "yes";	//Conditional operator with Strings
		
		System.out.println(response);	//Print response
	}

}
