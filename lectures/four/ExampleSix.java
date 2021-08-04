package lectures.four;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExampleSix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			FileWriter out = new FileWriter("src/lectures/four/output.txt");
			
			String text = "";
			int line = 1;
			do {
				System.out.print("(" + line + ") ");
				text = input.nextLine();
				line++;
				if (!"done".equalsIgnoreCase(text)) {
					out.write(text);
					out.write("\n");
					out.flush();
				}
			} while (!"done".equalsIgnoreCase(text));
			
			out.close();
		} catch (IOException io) {
			System.out.println("An error occurred while writing to the file.");
			System.out.println(io.getMessage());
		}
	}

}
