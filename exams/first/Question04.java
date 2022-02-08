package exams.first;

//Question 04
//This has an additinal Rectangle class file. 
//Prompt the user for a postive Height and Width.
//Check to see if their values are positve.
//if positive contue to evaluate if not exit the program.
//Test out different methods and implementations. 
//Display the results to the console.
//Confirm output.


import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		//Let's create instance of an object using default constructor
	       Rectangle r1=new Rectangle();
	       
	       Scanner in = new Scanner(System.in);
	        System.out.println("Enter height:");
	        double h = in.nextDouble();
	        if(h <= 0) {
	        	System.out.println("Please enter a postive number");
	        	System.exit(0); //eexiting my program
	        }

	        System.out.println("Enter width:");
	        double w = in.nextDouble();
	        if(w <= 0) {
	        	System.out.println("Please enter a postive number");
	        	System.exit(0);
	        }
	       r1.setHeight(h); 
	       r1.setWidth(w); 
	      
	     //Let's assign some values for non default constructor here
	       double height=h;
	       double width=w;
	      
	       //I'm Creating an object using non-default constructor
	       Rectangle r2=new Rectangle(h,w);
	      
	       System.out.println("\nImplementing Rectangle 1 using default constructor:");
	      
	       System.out.println("Height is:"+r1.getHeight()); 
	       System.out.println("Width is:"+r1.getWidth());
	      
	       System.out.println("\nImplementing Rectangle 2 using non-default constructor:");
	      
	       System.out.println("Height is:"+r2.getHeight());
	       System.out.println("Width is:"+r2.getWidth());
	       
	       System.out.println("\nTesting the to String method for r1");       
	       System.out.println("For r1 "+r1);
	       
	       System.out.println("\nTesting Perimeter method for r1");       
	       System.out.println("The perimeter is "+r1.perimeter());
	       
	       System.out.println("\nTesting Area method for r1");       
	       System.out.println("The area for r1 is "+r1.area());
	  
	       
	       System.out.println("\nChecking to see if r1 and r2 are the same recatangle:");
	       System.out.println(r1.equals(r2));
	       
	       //Check with another r3 rectangle: 
	       Rectangle r3=new Rectangle(11,2.5);
	       System.out.println("\nChecking to see if r1 and r3 are the same recatangle:");
	       System.out.println(r1.equals(r3));

	}

}
