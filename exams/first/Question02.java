package exams.first;

//Question 02
//Prompt the user for an integer.
//Check to see if the integer is valid and is a positve number.
//Use a "for" loop to factor out odd numbers. 
//Display the results to the console.

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        System.out.println("Enter any integer:");
	        int num = in.nextInt();
	        if(num > 0)
	        {
	            for(int i = 0 ; i <= num ; i++)
	            {
	                if(i%2 != 0)
	                {
	                    System.out.print(  i + " ");
	                }
	            }
	        }
	        else
	        {
	            System.out.println("The integer you entered is not a positive number.");
	        }
	}

}
