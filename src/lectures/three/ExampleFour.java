package lectures.three;

public class ExampleFour {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3, 4};
		// int[] b = {1, 2, 3};
		// int[] b = {1, 4, 3};
		
		// Compare for equality here:
		boolean equal = false;
		if (a.length == b.length) {
			equal = true;
			for (int i=0; i<a.length && equal; i++) {
				equal = a[i] == b[i];
			}
		}
		
		
		// Print the result
		if (equal) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is not equal to b");
		}
	}

}
