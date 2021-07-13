package labs.lab3;

public class SalaryEmployee extends Employee {
    
    private double salary;

    // similiarly i'm using the default constructor and demonstraing the super constructor
    public SalaryEmployee() {  	
        super();
        salary = 0;
    }

    public SalaryEmployee(String name, int yearsEmployed, double salary) {
        super(name, yearsEmployed);
        this.salary = salary;
    }

    public void setSalary(double salary) { 
    	this.salary = salary; 
    }

    public double getSalary() { 
    	return this.salary; 
    }

    public String toString() {
        return super.toString()+",Salary,"+String.format("%.0f",pay());
    }

   public boolean equals(SalaryEmployee e) {
        if(super.equals(e) && this.salary == e.getSalary())
            return true;
        else 
            return false;    
    }

    public double pay() {
        return salary/52; //pay is divided by 52 from the question.
    }
}