package labs.lab1;
import java.util.Scanner;

// Fahrenheit to Celsius converter and vice versa
//Pseudocode
//1. Prompt user for degree in Fahrenheit
//2. Initialize value 1 (note that I'm initializing and assigning at the same time)
//3. Check if input is valid using try-catch excepetion
//4. Convert temperature to degree Celsius
//5. Print out the results to console. 
//6. Prompt user for degree in Celsius
//7. Initialize value 2 (note that I'm initializing and assigning at the same time)
//8. Check if input is valid using try-catch excepetion
//9. Convert temperature to degree Fahrenheit
//10. Print out the results to console. 


public class Question1 {
	public static void main(String[] args) {
		Scanner deg = new Scanner(System.in);	
		try {
			System.out.print("Enter Temperature in Fahrenheit: ");
			 double val1 = deg.nextDouble();
			 double degC=(val1-32)*(5.0/9.0);
				System.out.println("Temperature is " + degC + " degree Ceslsius");
				
				System.out.print("\nEnter Temperature in Ceslsius: ");
				 double val2 = deg.nextDouble();
				 double degF=(val2 * (9.0/5.0)) + 32;
					System.out.println("Temperature is " + degF + " degree Fahrenheit");
		} catch (Exception e) {
			System.out.println("\nThe value you entered is not a number...Try again!");
	}
}
	}
