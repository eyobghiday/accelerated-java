package lectures.thirteen;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ExampleTwo {

	public static void main(String[] args) {
		String datePattern = "([1-9]|[0][1-9]|[12][0-9]|[3][01])(-|/)"
				+ "([1-9]|[0][1-9]|[1][0-2])(-|/)"
				+ "([0-9]{4})";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a date: ");
		String date = input.nextLine();
		
		input.close();
		
		if (Pattern.matches(datePattern, date)) {
			System.out.println("'" + date + "' is a date");
		} else {
			System.out.println("'" + date + "' is not a date");
		}
	}

}
