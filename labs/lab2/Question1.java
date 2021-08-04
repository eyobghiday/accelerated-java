package labs.lab2;
//Question 1.
//1. create a scanner and check for exception 
//2. accept values until user enters "done"
//3. prompt user for a file name & extension.
//4. save number lists in the file and exit. 
import java.util.Scanner;
import java.io.*;

public class Question1 {

	public static void main(String[] args) {
		
		try
		{
		Scanner val=new Scanner(System.in);
		String num,str="";
		int values;

		while(true)
		{
		System.out.print("\nEnter a number, after finishing enter 'Done' : ");
		num=val.next();
		
		//I'm ignoring cap size for convenience of a user
		if(num.equalsIgnoreCase("Done"))
		{
		break;
		}
		values=Integer.parseInt(num);
		str=str+values+"\n";
		}

		System.out.print("\nEnter your choice of file name with extension: ");
		String fName=val.next();
		FileWriter out=new FileWriter("src/labs/lab2/" + fName);
		out.write(str);
		System.out.println("\nYour number list is stored in the file successfully. \n");
		out.close();
		}
		catch(Exception e)
		{
		System.out.println("Enter number values only: "+e);
		}

	}

}
