package lectures.eleven;

public class QuickSort {
	
	public static String[] sort(String[] array) {
		quickSort(array, 0, array.length - 1);
		return array;
	}
	
	public static void quickSort(String[] a, int left, int right) {
		if (left < right) {
			int p = partition(a, left, right);
			quickSort(a, left, p-1);
			quickSort(a, p+1, right);
		}
	}
	
	public static int partition(String[] a, int left, int right) {
		String pivot = a[right];
		
		int i=left-1;
		for (int j=left; j<=right; j++) {
			if (a[j].compareTo(pivot)<0) {
				i=i+1;
				swap(a, i, j);
			}
		}
		
		swap(a, i+1, right);
		return i+1;
	}
	
	public static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		String[] lang = {"java", "python", "c", "rust", "scala", "basic", "haskell", "prolog"};
		
		lang = sort(lang);
		
		for (String l : lang) {
			System.out.print(l + " ");
		}
		
	}

}
