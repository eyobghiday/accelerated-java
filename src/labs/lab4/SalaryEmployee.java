package labs.lab4;

public class SalaryEmployee extends Employee {
	private double salary;

	public SalaryEmployee() {

	}

	public SalaryEmployee(String name, int yearsEmployed, double salary) {
		super(name, yearsEmployed);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		
		return (getId() + ", " + getName() + ", " + "Year=" + getYearsEmployed() + ", " + "Salary=" + salary + ", "
				+ "Pay=" + pay());
		
	}

	public boolean equals(SalaryEmployee obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalaryEmployee other = obj;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public double pay() {
		return salary / 52;
	}
}