package lectures.eleven;

public class MergeSort {
	
	public static String[] sort(String[] array) {
		mergeSort(array, new String[array.length], array.length);
		return array;
	}
	
	public static void mergeSort(String[] a, String[] b, int n) {
		splitMerge(a, 0, n, b);
	}
	
	public static void splitMerge(String[] a, int start, int end, String[] b) {
		if (end-start < 2) {
			return;
		}
		
		int middle = (end + start)/2;
		
		splitMerge(a, start, middle, b);
		splitMerge(a, middle, end, b);
		merge(a, start, middle, end, b);
		// b is sorted between start and end
		copyArray(b, start, end, a);

		printArray(a);
	}
	
	public static void merge(String[] a, int start, int middle, int end, String[] b) {
		int left = start;
		int right = middle;
		for (int j=start; j<end; j++) {
			if (left < middle && (right >=end || a[left].compareTo(a[right]) <= 0)) {
				b[j] = a[left];
				left++;
			} else {
				b[j] = a[right];
				right++;
			}
		}
	}
	
	public static void copyArray(String[] b, int start, int end, String[] a) {
		for (int k=start; k<end; k++) {
			a[k] = b[k];
		}
	}
	
	public static void printArray(String[] a) {
		for (String l : a) {
			System.out.print(l + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] lang = {"java", "python", "c", "rust", "scala", "basic", "haskell", "prolog"};
		
		lang = sort(lang);
		
		for (String l : lang) {
			System.out.print(l + " ");
		}
		
	}

}
