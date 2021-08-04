package lectures.thirteen;

public class DateApplication {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		
		Date d2 = new Date(2021, Month.JULY, 26);
		System.out.println(d2.toString());
		
		Date d3 = new Date(2021, 7, 26);
		System.out.println(d3.toString());
		
		Date d4 = Date.parseDate("1991-11-26");
		System.out.println(d4.toString());
		
		Date d5 = new Date("1991-11-26");
		System.out.println(d5.toString());
		
		Date invalid1 = new Date("2000-02-31");
		System.out.println(invalid1.toString());
		
		Date invalid2 = new Date("2000-13-42");
		System.out.println(invalid2.toString());
	}

}
