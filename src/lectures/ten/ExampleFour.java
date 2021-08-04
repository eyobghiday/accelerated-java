package lectures.ten;

import java.util.ArrayList;
import java.util.Scanner;

public class ExampleFour {

	public static int search(ArrayList<String> terms, String searchTerm, int index) {
		if (terms.size() == index) {
			// searchTerm not found
			return -1;
		} else if (terms.get(index).equalsIgnoreCase(searchTerm)) {
			return index;
		}
		
		return search(terms, searchTerm, index+1);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> terms = new ArrayList<String>();
		
		boolean done = false;
		do {
			System.out.print("Enter a term: ");
			String in = input.nextLine();
			if ("done".equalsIgnoreCase(in)) {
				done = true;
			} else {
				terms.add(in);
			}
		} while(!done);
		
		System.out.print("Enter term to search: ");
		String searchTerm = input.nextLine();
		
		System.out.println(search(terms, searchTerm, 0));
		
		input.close();
	}

}
