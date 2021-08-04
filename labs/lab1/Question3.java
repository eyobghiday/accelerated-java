package labs.lab1;
import java.util.Scanner;

// Printing a triangle of * shapes based on a user input
//Pseudocode
//1. Prompt a user for a number
//2. write a try block to check if input is valid
//3. Initialize and assign counters
//4. create a nested for loop (one for hold the number of rows and one for counting the printed *
//5. printing out the shape interms *

public class Question3 {
	public static void main(String[] args) {
		try {
		   System.out.print("Enter a number you want: ");
		 Scanner input = new Scanner(System.in);
				    int i = input.nextInt();

		   for(int j=1;j<=i;j++)
		   {
			for(int k=1;k<=j;k++)
			  System.out.print("*");

		    System.out.println(); //for starting a new row
		    }
		}
		catch (Exception e) {
		System.out.println("The value you entered is not a number...Try again!");
}
		   
}
	}
