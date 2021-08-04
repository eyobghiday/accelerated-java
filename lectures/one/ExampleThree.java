package lectures.one;

import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int x = scan.nextInt();
		
		if (x % 2 == 0) {
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}
	}

}
