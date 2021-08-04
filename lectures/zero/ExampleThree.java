package lectures.zero;

public class ExampleThree {

	public static void main(String[] args) {
		String str = "Hello World!";
		
		System.out.println(str);
		
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(6));
		
		System.out.println(str.substring(6));
		System.out.println(str.substring(0, 5));
		
		System.out.println(str.replace(' ', '-'));
		System.out.println(str.replaceAll("World", "Everyone"));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}

}
