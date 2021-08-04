package labs.lab4;

public class HourlyEmployee extends Employee {
	private double hourlyPay;
	private double hoursWorked;

	public HourlyEmployee() {

	}

	public HourlyEmployee(String name, int yearsEmployed, double pay, double worked) {
		super(name, yearsEmployed);
		this.hourlyPay = pay;
		this.hoursWorked = worked;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String toString() {
		return (getId() + ", " + getName() + ", " + "Year= " + getYearsEmployed() + ", " + "PerHour=" + hourlyPay + ", "
				+ "HoursWorked=" + hoursWorked + ", " + "Pay=" + pay());
	}

	public boolean equals(HourlyEmployee obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HourlyEmployee other = obj;
		if (Double.doubleToLongBits(hourlyPay) != Double.doubleToLongBits(other.hourlyPay))
			return false;
		if (Double.doubleToLongBits(hoursWorked) != Double.doubleToLongBits(other.hoursWorked))
			return false;
		return true;
	}

	public double pay() {
		double pay = hourlyPay * hoursWorked;
		hoursWorked = 0;
		return pay;
	}

}