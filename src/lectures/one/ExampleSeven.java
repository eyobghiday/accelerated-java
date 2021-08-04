package lectures.one;

import java.util.Scanner;

public class ExampleSeven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter yes or no: ");
		String word = input.nextLine();
		
//		switch (word.toLowerCase()) {
//			case "yes":
//			case "y":
//				System.out.println("YES!!!");
//				break;
//			case "no":
//			case "n":
//				System.out.println("NO!!!");
//				break;
//			default:
//				System.out.println("WHAT!!!");
//		}
		
		if (word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("y")) {
			System.out.println("YES!!!");
		} else if (word.equalsIgnoreCase("no") || word.equalsIgnoreCase("n")) {
			System.out.println("NO!!!");
		} else {
			System.out.println("WHAT!!!");
		}
	}

}
