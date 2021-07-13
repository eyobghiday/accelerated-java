package labs.lab3;

public class HourlyEmployee extends Employee {
    private double hourlyPay, hoursWorked;

    public HourlyEmployee() {
        super();
        hourlyPay = 0;
        hoursWorked = 0;
    }

    public HourlyEmployee(String name, int yearsEmployed, double pay, double worked) {
        super(name, yearsEmployed);
        this.hourlyPay = pay;
        this.hoursWorked = worked;
    }

    public void setHourlyPay(double pay) { 
    	this.hourlyPay = pay; 
    }
    public void setHoursWorked(double hours) { 
    	this.hoursWorked = hours; 
    }
    public double getHourlyPay() { 
    	return this.hourlyPay; 
    }
    public double getHoursWorked() { 
    	return this.hoursWorked; 
    }

    public String toString() {
        return super.toString()+",Hourly,"+pay();
    }

    public boolean equals(HourlyEmployee e) {
        if(super.equals(e) && this.hourlyPay == e.getHourlyPay() && this.hoursWorked == e.getHoursWorked())
            return true;
        else 
            return false;    
    }

    public double pay() {
        double payment = hourlyPay * hoursWorked; //pay is based on amount of hours worked. 
        hoursWorked = 0; //this is just for counter check
        return payment;
    }
}
