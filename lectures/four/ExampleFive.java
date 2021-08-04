package lectures.four;

import java.util.Scanner;

public class ExampleFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		boolean done = false;
		do {
			String value = "";
			try {
				System.out.print("Enter an integer: ");
				value = input.nextLine();
				n = Integer.parseInt(value);
				done = true;
			} catch (NumberFormatException e) {
				System.out.println("\"" + value + "\" is not an integer...");
			}
		} while (!done);
		
		System.out.println(n);
	}

}
