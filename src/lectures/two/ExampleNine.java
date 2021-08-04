package lectures.two;

import java.util.Scanner;

public class ExampleNine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Base: ");
		int base = input.nextInt();
		
		System.out.print("Power: ");
		int power = input.nextInt();
			
		int result = 1;
		for (int p=1; p<=power; p++) {
			result = result*base;
		}
		
		System.out.println(base + "^" + power + "=" + result);
	}

}
