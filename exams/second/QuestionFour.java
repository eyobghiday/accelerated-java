package exams.second;
//Question Four: Searching
//1. Prompt user for to enter a word
//2. search the value in the given array using sequential algorithm 
//3. if found inform the user with its position in the array
//4. If the value doesn't exist print -1 to the output
import java.util.Scanner;

public class QuestionFour {
	
public static void main(String[] args) {
	
		int b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value you want to search:");
		b = scan.nextInt();
		int[] num = { 24, 87, 71, 73, 31, 65, 64, 13, 18, 8 }; 
		search(b, num); //implementing the method

}

static void search(int a, int[] number) {
	for (int i = 0; i < number.length; i++) {
		if (a == number[i]) {
			System.out.println("\nThe position of the value in the array is: " + (i + 1)); //am adding 1 because we are asked for position not the index.
			return;
		}
	}
	System.out.println(-1);
}


}
