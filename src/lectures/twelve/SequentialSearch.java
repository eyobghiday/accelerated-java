package lectures.twelve;

import java.util.Scanner;

public class SequentialSearch {
	
	public static int search(String[] array, String value) {
		for (int i=0; i<array.length; i++) {
			if (array[i].equalsIgnoreCase(value)) {
				return i;
			}
		}
		
		return -1; // not found
	}

	public static void main(String[] args) {
		String[] lang = {"basic", "c", "haskell", "java", "prolog", "python", "rust", "scala"};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Search term: ");
		String value = input.nextLine();
		int index = search(lang, value);
		if (index == -1) {
			System.out.println(value + " not found.");
		} else {
			System.out.println(value + " found at index " + index + ".");
		}

		input.close();
	}

}
