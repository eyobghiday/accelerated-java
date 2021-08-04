package labs.lab5;

//Selection sort
//1. Prompt user for a list of strings
//2. check user for "done" string
//3. halt and sort the array using compareTo
//4. print out the newly sorted arrays

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       ArrayList<String>values=new ArrayList<>();
	       System.out.print("Enter a String, type 'done' to stop:\n");
	       while(true)
	       {
	           String str=sc.nextLine();
	           if(str.compareTo("done")==0)
	           {
	               break;
	           }
	           values.add(str);
	       }
	       for(int i=0;i<values.size()-1;i++)
	       {
	           int minIndex=i;
	           for(int j=i+1;j<values.size();j++)
	           {
	               if(values.get(j).compareTo(values.get(minIndex))<0)
	               {
	                   minIndex=j;
	               }
	           }
	           Collections.swap(values,minIndex,i);
	       }    
	       System.out.println("The strings are sorted alphabetically:");
           System.out.println(Arrays.asList(values));

	}

}
