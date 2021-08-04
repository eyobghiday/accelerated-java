package lectures.two;

public class ExampleSeven {

	public static void main(String[] args) {
		int row = 0;
		while (row < 3) {
			int col = 0;
			while (col < 3) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
