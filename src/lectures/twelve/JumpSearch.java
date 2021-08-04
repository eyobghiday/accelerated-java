package lectures.twelve;

import java.util.Scanner;

public class JumpSearch {
	
	public static int search(String[] array, String value) {
		int stepSize = (int)Math.sqrt(array.length);
		int step = stepSize;
		int prev = 0;
		
		// Find correct section
		while (array[Math.min(step, array.length)-1].compareToIgnoreCase(value) < 0) {
			prev = step;
			step += stepSize;
			if (prev >= array.length) {
				return -1; // hit end of array, not found
			}
		}
		
		// Look within section
		while (array[prev].compareToIgnoreCase(value) < 0) {
			prev++;
			if (prev == Math.min(step, array.length)) {
				return -1;	// hit end of section and not found
			}
		}
		
		if (array[prev].equalsIgnoreCase(value)) {
			return prev; // found
		}
		
		return -1;
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
