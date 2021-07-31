package labs.lab5;
//Bubble sort
//1. Prompt user for a list of words
//2. check user input for "done" string
//3. halt and sort the array using for loop
//4. print out the newly sorted array
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    String[] inp=new String[1000];
	    int k=0;
	    System.out.print("Enter a String, type 'done' to stop:\n");
	    for(int i=0;;i++) //this is so that I can exit the loop once user enters done 
	    {
	        String str=s.nextLine();
	        if(str.equals("done")) 
	        {
	            break;
	        }
	        inp[k++]=str;
	    }
	    for(int i=0;i<k-1;i++)
	    { 
	        for(int j=i+1;j<k;j++)
	        {
	            if(inp[j].length()<inp[i].length())
	            {//swap 
	                String temp=inp[i];
	                inp[i]=inp[j];
	                inp[j]=temp;
	            }
	        }
	    }
	    System.out.print("\nThe sorted array is: \n");
	        for(int i=0;i<k;i++)
	            System.out.println(inp[i]);
	}

}
