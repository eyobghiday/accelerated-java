package lectures.nine;

import java.util.Scanner;

public class StringListApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringList list = new StringList();
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
		
		System.out.println("\n Remaining \n");
		
//		for (int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		
		input.close();
	}

}
