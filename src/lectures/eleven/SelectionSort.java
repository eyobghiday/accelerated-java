package lectures.eleven;

public class SelectionSort {
	
	public static String[] sort(String[] array) {
		for (int i=0; i<array.length-1; i++) {
			int min = i;
			for (int j=i+1; j<array.length; j++) {
				if (array[j].compareTo(array[min]) < 0) {
					min = j;
				}
			}
			
			if (min != i) {
				String temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		String[] lang = {"java", "python", "c", "rust", "scala", "basic", "haskell", "prolog"};
		
		lang = sort(lang);
		
		for (String l : lang) {
			System.out.print(l + " ");
		}
		
	}

}
