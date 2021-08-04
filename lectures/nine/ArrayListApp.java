package lectures.nine;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("Enter some text ('done' to exit): ");
		String in = input.nextLine();
		
		while (!in.equalsIgnoreCase("done")) {
			list.add(in);
			System.out.print("Enter some more text ('done' to exit): ");
			in = input.nextLine();
		}
		
		System.out.print("Enter an index to remove: ");
		int r = Integer.parseInt(input.nextLine());
		System.out.println("Removed " + list.remove(r));
		
		System.out.print("Lookup an element: ");
		in = input.nextLine();
		System.out.println("'" + in + "' is at position " + list.indexOf(in));
		
		System.out.println("\n Remaining \n");
		
//		for (int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		for (String current : list) {
			System.out.println(current);
		}
		
		input.close();
	}

}
