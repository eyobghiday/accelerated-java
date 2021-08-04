package lectures.nine;

public class StringList {

	private int size;
	private int current;
	private String[] array;
	
	public StringList() {
		size = 0;
		current = -1;
		array = new String[10];
	}
	
	public StringList(int capacity) {
		this();
		if (capacity > 0) {
			array = new String[capacity];
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean add(String element) {
		boolean resized = false;
		if (size == array.length) {
			resizeArray(size + 10);
			resized = true;
		}
		
		array[size] = element;
		size++;
		
		return resized;
	}
	
	private void resizeArray(int s) {
		String[] temp = new String[s];
		int minLength = s > array.length ? array.length : s;
		for (int i=0; i<minLength; i++) {
			temp[i] = array[i];
		}
		
		array = temp;
		temp = null;
	}
	
	public void clear() {
		array = new String[array.length];
		size = 0;
	}
	
	public String remove(int i) {
		if (i >= size || i < 0) {
			return null;
		}
		
		String removed = array[i];
		
		for (int j=i; j<(size-1); j++) {
			array[j] = array[j+1];
		}
		
		size--;
		
		return removed;
	}
	
	public String get(int i) {
		if (i >= size || i < 0) {
			return null;
		}
		
		return array[i];
	}
	
	public String set(int i, String element) {
		if (i >= size || i < 0) {
			return null;
		}
		
		String old = array[i];
		array[i] = element;
		return old;
	}
	
	public boolean equals(StringList l) {
		if (size != l.size()) {
			return false;
		}
		
		for (int i=0; i<size; i++) {
			if (!array[i].equals(l.get(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean hasNext() {
		return current < (size - 1);
	}
	
	public String next() {
		if (!hasNext()) {
			return null;
		}
		
		current++;
		return array[current];
	}
}
