package lectures.ten;

import java.util.ArrayList;

public class ExampleThree {
	
	public static void printRev(ArrayList<Integer> data, int end) {
		if (end < 0) {
			return;
		}
		
		System.out.print(data.get(end) + " ");
		printRev(data, end - 1);
	}
	
	public static void printOtherRev(ArrayList<Integer> data, int start) {
		if (start == data.size()) {
			return;
		}
		
		printOtherRev(data, start + 1);
		System.out.print(" " + data.get(start));
	}

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>(4);
		data.add(74);
		data.add(36);
		data.add(87);
		data.add(95);
		
		printRev(data, data.size()-1);
		System.out.println();
		printOtherRev(data, 0);
	}

}
