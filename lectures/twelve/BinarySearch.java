package lectures.twelve;

import java.util.Scanner;

public class BinarySearch {
	
	public static int search(String[] array, String value) {
		return search(array, value, 0, array.length);
	}
	
	public static int search(String[] array, String value, int start, int end) {
		if (start >= end) {
			return -1; // not found
		}
		
		int middle = (start + end) / 2;
		if (array[middle].compareToIgnoreCase(value) < 0) {
			return search(array, value, middle+1, end); // value comes after array[middle]
		} else if (array[middle].compareToIgnoreCase(value) > 0) {
			return search(array, value, start, middle);	// value comes before array[middle]
		}
		
		return middle;
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
