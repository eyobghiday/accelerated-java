package labs.lab5;

//Insertion sort
//1. Prompt user for a numbers but we have to check for validation this time
//2. If input is not a number warn user it's invalid and move on.
//3. check user input for "done" string
//4. halt and sort the array using insertion sort
//5. print out the newly sorted array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question02 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                ArrayList<Integer> values = new ArrayList<Integer>();
                String tempInput; 
                Boolean test = true;  
                System.out.print("Enter number then type 'done' to sort: \n"); 
                while(test) {                  
                        tempInput = sc.next();
                        
                        if (tempInput.contains("done"))
                                test = false;
                        else {  //this is just to check for an exception according the note* given
                                try {
                                        values.add(Integer.parseInt(tempInput));
                                }
                                catch (NumberFormatException e) {
                                        System.out.println("It is invalid");
                                }
                        }  
                }             
                for(int n = 1; n < values.size(); n++) {
                        int currrentValue = values.get(n);  
                        int m = n;
                          while(m > 0 && values.get(m - 1) > currrentValue) {
                                values.set(m, values.get(m-1));
                                m = m - 1;  
                        }
                        
                        values.set(m, currrentValue);
                }
                
                System.out.println("\nThe numbers are sorted in ascending order:");
                System.out.println(Arrays.asList(values));

        }
}