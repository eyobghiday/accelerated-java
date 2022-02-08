package exams.first;

import java.util.InputMismatchException;

//Question 03
//Prompt the user for an integer value of array.
//Depending on the question I'm assuming the user strictly enters an integer value.
//Check to see if the input is valid.
//Use a for loop to factor out odd numbers. 
//Display the results to the console.

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		
	       try
	       {
	    	   Scanner sc=new Scanner(System.in);
		       int arr[]=new int[10];
		       int temp = 0, count = 0;
		       System.out.print("Enter the array list: ");
		      
		       for(int i=0;i<arr.length;i++) {
		           arr[i]=sc.nextInt();
		       }
		     
		       for (int i = 0; i < arr.length; i++) {
		    	   for(int j=i+1;j<arr.length;j++) {
		    	    	  if(arr[i]==arr[j]) {
		    	            count++;
		    	            temp = arr[i];
		    	      }
		    	      
		    	   }
		       }
	if (count>=0) System.out.println(temp + " is the most frequent integer in the array");
	else  System.out.println(" There's no repeating value in the array");
	}  
		       
		       
	       
	    catch(InputMismatchException e)
	       {
	    	System.out.println("Input is not a valid integer, please try again");
	    	System.exit(0); //to exit system
	       }
	       
	}
}

