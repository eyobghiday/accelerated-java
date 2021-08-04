package lectures.ten;

import java.util.Scanner;

public class ExampleOne {
	
	public static int sum(int n) {
		// base case
		if (n==1) {
			return 1;
		}
		
		return n + sum(n-1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = Integer.parseInt(input.nextLine());
		System.out.println(sum(n));
	}

}
