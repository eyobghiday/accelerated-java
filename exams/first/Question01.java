package exams.first;

// Question 01
// Prompt the user for a letter
// Check to see if the letter is a Vowel or Consonant
// Compare and display the results to the console.

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		Scanner let = new Scanner(System.in);
        System.out.println("Enter a letter of your choice: ");
        char ch = let.next().charAt(0);

        if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
            System.out.println("The Letter " + ch + " is a Vowel.");
        else
            System.out.println("The Letter " + ch + " is a Consonant.");
	}

}
