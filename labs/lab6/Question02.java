package labs.lab6;
//Binary searching Algorithm using iteration
//1. Prompt user for to enter a word
//2. search the word in the given array using iteration
//3. if found inform the user with its index
//4. if not exit informing the user "the word doesn't exist in the array"
import java.util.Scanner;

public class Question02 {

		public static void main(String[] args)
		   {   
		       String[] terms = new String[] {"a", "bee", "dog", "egg", "fun", "sea"};
		       Scanner scan = new Scanner(System.in);
		       System.out.print("Enter the word or letter you want ot search: ");
		       String term = scan.nextLine();
		
		       int index = iteration(terms, term);
		      
		       if(index == -1)
		    	   System.out.print("Element not found in the array!");
		       else
		            System.out.print("The term exists and is at at index " + index);
		   
		   }
		 static int iteration(String[] x, String y)
		   {
		        int low = 0;
		        int high = x.length - 1;
		        int mid;
		        while (low <= high)
		        {
		            mid = (low + high) / 2;
		            if (x[mid].compareTo(y) < 0)
		            {
		                low = mid + 1;
		            }
		            else if (x[mid].compareTo(y) > 0)
		            {
		                high = mid - 1;
		            }
		    
		            else
		            {
		                return mid;
		            }
		        }
		      
		        return -1;
		   }
		  
}
