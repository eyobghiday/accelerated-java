package exams.second;

//Question Two: ArrayLists
//1. Prompt user for to enter a set of words using while loop
//2. use arraylists to store words
//3. Check for the keyword done inorder to exit scanning for words
//4. Count how many words start with the same alphabet using for loop
//5. Print out the alphabets the repitition number using for loop
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		System.out.println("Enter a word. Type 'done' up on finishing");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		String tempInput;
		Boolean test = true; // my while loop checker

		// while loop so that I can terminate after user enters done
		while (test) {
			tempInput = sc.nextLine();
			if (tempInput.contains("done")) {
				test = false;
				break;
			} else
				words.add(tempInput);
		}
	
		int n;
		char[] alpha = new char[] { 'a', 'A', 'b', 'B', 'c', 'C', 'd','D', 'e','E', 'f', 'F', 'g', 'G', 'h', 'H','i','I', 'j','J', 'k','K', 'l','L', 'm', 'M','n','N', 'o','O', 'p', 'P','Q','q',
				'r','R', 's', 'T', 't', 'T','u','U' ,'v','V' ,'w', 'W', 'x', 'X', 'y', 'Y','z','Z' }; //for comparison with each possible char 
		int letter[] = new int[26]; //holder for all my possible starting letter
		for (int j = 0; j < words.size(); j++) {
			for (int i = 0; i < alpha.length; i++) {
				if (words.get(j).charAt(0) == alpha[i]) {
					n = Character.toLowerCase( words.get(j).charAt(0)) - 'a'; //how far from a is my character
					letter[n]++;
				}
			}
		}

		System.out.println("\nThe starting Letter count is: ");
		for (int i = 0; i < letter.length; i++) {
			if (letter[i] != 0) // I only need to print the first characters that are used for the words
				System.out.println((Character.toUpperCase((char) (i + 'a'))) + "=" + letter[i]); 

		}

	}
}
