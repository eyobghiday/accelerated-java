package lectures.two;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) throws IOException {
		File text = new File("src/lectures/two/example.txt");
		Scanner input = new Scanner(text);
		
		int lineNumber = 1;
		
		while (input.hasNextLine()) {
			System.out.println(lineNumber + " " + input.nextLine());
			lineNumber = lineNumber + 1;
		}
		
		input.close();
	}

}
