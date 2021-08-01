package labs.lab6;
//Sequential searching algorithm using recursion
//1. Prompt user for to enter a word
//2. search the word in the given array using recurstion method
//3. if found inform the user with its index
//4. if not exit informing the user "the word doesn't exist in the array"
import java.util.Scanner;

	public class Question03 {
		
	   public static void main(String[] args)
	   {
	       Scanner scan = new Scanner(System.in);
	       String[] terms = new String[] {"c", "html", "java", "python", "ruby", "scala"};
	       System.out.print("Enter the word you want to search: ");
	       String term = scan.nextLine();
	       int start=0;
	       int index = recursion(terms,term, start, terms.length );
	       if(index == -1)
	    	   System.out.print("Element not found in the array!");
	       else
	    	   System.out.print("The term exists and is at at index " + index);
	   }
	   
	   static int recursion(String[] x, String y, int v, int w)
	   {
	        if (v <= w)
	        {
	            int mid = v + (w - v) / 2;

	            if (x[mid].compareTo(y) == 0)
	              
	                return mid;
	    
	            if (x[mid].compareTo(y) > 0)
	              
	                return recursion(x, y, v, mid - 1);
	              
	            else
	          
	                return recursion(x, y, mid + 1, w);
	        }

	        return -1;
	}
}

