package lectures.thirteen;

public enum Month {
	JANUARY(1,31), FEBRUARY(2, 28), MARCH(3,31), APRIL(4, 30), MAY(5, 31), JUNE(6, 30), JULY(7,31), AUGUST(8,31), SEPTEMBER(9,30),
	OCTOBER(10,31),NOVEMBER(11,30), DECEMBER(12,31);
	
	private int num;
	private int days;
	
	Month(int num, int days) {
		this.num = num;
		this.days = days;
	}
	
	public int numberOfDays() {
		return days;
	}
	
	public int number() {
		return num;
	}
	
	public static Month getMonth(int m) {
		switch (m) {
			case 1:
				return JANUARY;
			case 2:
				return FEBRUARY;
			case 3:
				return MARCH;
			case 4:
				return APRIL;
			case 5:
				return MAY;
			case 6:
				return JUNE;
			case 7:
				return JULY;
			case 8:
				return AUGUST;
			case 9:
				return SEPTEMBER;
			case 10:
				return OCTOBER;
			case 11:
				return NOVEMBER;
			case 12:
				return DECEMBER;
			default:
				return null;
		}
	}
}
