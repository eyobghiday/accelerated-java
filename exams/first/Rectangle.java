package exams.first;

//Writing out a class for Question 04

public class Rectangle {

	// Creating two instance variables
		private double height;
		private double width;
		  
		//This is the default constructor
		   Rectangle() {
		     
		   }
		  
		//This is the non-default constructor
		   public Rectangle(double h, double w) {
		       this.height = h;
		       this.width = w;
		   }

		   //Accessor method for Height
		   public double getHeight() {
		       return height;
		   }
		   
		 //Accessor method for Width
		   public double getWidth() {
		       return width;
		   }
		   //Mutator method for Height
		   public void setHeight(double h) {
		       this.height = h;
		   }
		 
		   //Mutator method for Width
		   public void setWidth(double w) {
		       this.width = w;
		   }
		  
		   //toString() method to return some string value
		   public String toString() {
		       return "The height is "+ height + " and the width is " + width;
		   }
		  
		   //creating the boolean equals that compare two objects
		   public boolean equals(Rectangle r) {
			    if(this.height != r.getHeight()) return false;
			    else if(this.width != r.getWidth()) return false;
			    else return true;
			    }
		//method for evaluating the perimeter
		   public double perimeter() {
		       return 2 * (height + width);
		   }
		   
		 //method for evaluating the area
		   public double area() {
		       return height * width;
		   }
		   
	        
}