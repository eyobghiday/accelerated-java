package lectures.thirteen;

import java.util.regex.Pattern;

public class ExampleOne {

	public static void main(String[] args) {
		String regex = "\\d+";
		System.out.println(Pattern.matches(regex, "123456789"));
		System.out.println(Pattern.matches(regex, "hello"));
		System.out.println(Pattern.matches(regex, "Example1"));
		System.out.println(Pattern.matches(regex, ""));
	}

}
