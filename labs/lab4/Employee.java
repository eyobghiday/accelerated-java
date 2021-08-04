package labs.lab4;

//Not so much change from my previos lab
//But more cleaner and concise

public class Employee {

	private String id;
	private String name;
	private int yearsEmployed;
	static int currentMaxID;

	public Employee() {
		currentMaxID++;
		this.id = String.valueOf(currentMaxID);
	}

	public Employee(String name, int yearsEmployed) {
		this.name = name;
		this.yearsEmployed = yearsEmployed;
		currentMaxID++;
		this.id = String.valueOf(currentMaxID);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsEmployed() {
		return yearsEmployed;
	}

	public void setYearsEmployed(int yearsEmployed) {
		this.yearsEmployed = yearsEmployed;
	}

	public String getId() {
		return id;
	}

	public String toString() {
		return " Employee [id=" + id + ", name=" + name + ", yearsEmployed=" + yearsEmployed + "]";
	}

	public boolean equals(Employee obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (yearsEmployed != other.yearsEmployed)
			return false;
		return true;
	}

	public double pay() {
		return 0;
	}

}
