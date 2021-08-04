package lectures.one;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter something: ");
		
		// Hello\n -> Hello
		// Hello World! Can you hear me? -> ... keeps listening ...
		System.out.println(scan.nextLine());
		System.out.println("Enter an integer: ");
		System.out.println(scan.nextInt());
	}

}
