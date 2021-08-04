package labs.lab1;
import java.util.Scanner;

//Computing the average of grades
//Pseudocode
//1. Prompt user for the number of grades wish to report
//2. Check if input is valid using try-catch excepetion
//3. Initialize default values and counters 
//4. Add total and compute average
//5. Print out the results to console. 

public class Question4 {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		try {
			System.out.print("Enter the number of grades you want to report: ");
			 int i = num.nextInt();
			 double total=0,average=0;
			 for (int j=0;j<i;j++)
			 {
				 System.out.print("Enter student "+(j+1)+" grade: ");
				 double grade = num.nextDouble();
				 total+=grade;
			 }
			 //compute the average of the class
			 average=total/i;
				System.out.println("\nThe avaerage of the Class is " + average);
		} catch (Exception e) {
			System.out.println("\n The value you entered is not a number...Try again!");
	}
}
	}
