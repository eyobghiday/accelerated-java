package lectures.thirteen;

import java.util.regex.Pattern;

public class Date {

	private int year;
	private Month month;
	private int day;
	
	private static String thirtyOneDays = "([0][1-9]|[12][0-9]|[3][01])";
	private static String thirtyDays = "([0][1-9]|[12][0-9]|30)";
	private static String febDays = "([0][1-9]|[12][0-9])";
	private static String datePattern = "(\\d+)(-)(((1|3|5|7|8|10|12)(-)("+thirtyOneDays+"))|((4|6|9|11)(-)("+thirtyDays+"))|(2-("+febDays+")))";
	
	public Date() {
		year = 1970;
		month = Month.JANUARY;
		day =  1;
	}
	
	public Date(int year, int month, int day) {
		this();
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public Date(int year, Month month, int day) {
		this();
		setYear(year);
		this.month = month;
		setDay(day);
	}
	
	public Date(String date) {
		this();
		if (Pattern.matches(datePattern, date)) {
			String[] values = date.split("-");
			setYear(Integer.parseInt(values[0]));
			setMonth(Integer.parseInt(values[1]));
			setDay(Integer.parseInt(values[2]));
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}
	
	public void setMonth(int month) {
		Month m = Month.getMonth(month);
		if (m != null) {
			this.month = m;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= month.numberOfDays()) {
			this.day = day;
		}
	}

	@Override
	public String toString() {
		return year + "-" + formatShortInt(month.number()) + "-" + formatShortInt(day);
	}
	
	private static String formatShortInt(int n) {
		if (n < 10) {
			return "0" + n;
		}
		
		return ""+n;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof Date)) {
			return false;
		}
		
		Date other = (Date) obj;
		if (day != other.getDay()) {
			return false;
		} else if (month != other.getMonth()) {
			return false;
		} else if (year != other.getYear()) {
			return false;
		}
		
		return true;
	}
	
	public static Date parseDate(String d) {
		if (Pattern.matches(datePattern, d)) {
			// Construct a date
			String[] values = d.split("-");
			return new Date(Integer.parseInt(values[0]),Integer.parseInt(values[1]),Integer.parseInt(values[2]));
		}
		
		return null;
	}
	
}
