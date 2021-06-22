package labs.lab1;
import java.util.Scanner;

// Inches to Centimeters converter
//Pseudocode
//1. Prompt user for the value in Inches
//2. Initialize values (note that I'm initializing and assigning at the same time)
//3. Check if input is valid using try-catch excepetion
//4. Convert dimension to centimeters
//5. Print out the results to console. 

public class Question2 {
	public static void main(String[] args) {
		Scanner dim = new Scanner(System.in);	
		try {
			System.out.print("Enter a value in Inches: ");
			 double inches = dim.nextDouble();
			 double centi=inches*2.54;
				System.out.println("The value is " + centi + " in Centimeters");
		} catch (Exception e) {
			System.out.println("The value you entered is not a number...Try again!");
	}
}
	}
