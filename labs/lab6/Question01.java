package labs.lab6;
//Sequential searching algorithm
//1. Prompt user for to enter a word
//2. search the word in the given array
//3. if found inform the user with its index
//4. if not exit informing the user "the word doesn't exist in the array"
import java.util.Scanner;

	public class Question01 {
		
	   public static void main(String[] args)
	   {
		   String[] terms = new String[] {"a", "bee", "sea", "dog", "egg", "fun"};
		   Scanner scan = new Scanner(System.in);
	       System.out.print("Enter the word or letter you want ot search: ");
	       String term = scan.nextLine();
	       int index = sequential(terms, term);
	       
	       if(index == -1)
	            System.out.print("Element not found in the array!");
	       else
	            System.out.print("The term exists and is at at index " + index);
	   }
	   
	static int sequential(String[] x, String y)
	   {
	        for(int i = 0; i < x.length; i++)
	        {
	            if(x[i].equals(y))
	                return i;
	        }
	        return -1;
	   }
	  
	}

