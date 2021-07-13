package labs.lab3;

//In the UML Readme file "id" is listed as String, but in discord we are informed its data type is integer.
//For this reason I use id as an integer.
public class Employee {
    private int id;
    private String name;
    private int yearsEmployed;
    private static int currentMaxID = 0;

    //i'm going to use the default constructor
    public Employee() {
        
        currentMaxID = currentMaxID + 1; //increase the currentMaxID by 1 everytime we read new employee
        id = currentMaxID;
        name = "";
        yearsEmployed = 0;
    }

    public Employee(String name, int yearsEmployed) {
        currentMaxID = currentMaxID + 1;
        id = currentMaxID;
        this.name = name;
        this.yearsEmployed = yearsEmployed;
    }
    
    public void setName(String name) { 
    	this.name = name; 
    }
     
    public void setYearsEmployed(int years) { 
    	this.yearsEmployed = years; 
    }

    
    public String getName() { 
    	return this.name; 
    }
   
    public int getYearsEmployed() { 
    	return this.yearsEmployed; 
    }

    //I'm assuming this is to return string parameters of an employee. since id is an integer, i'm not going to return it. 
    public String toString() {
        return name+","+yearsEmployed;
    }

    public boolean equals(Employee e) {
        if(this.id == e.id && this.name.equals(e.getName()) && this.yearsEmployed == e.getYearsEmployed())
            return true; //if everything is the same I return that employee already exists. 
    
        else 
            return false;   
    }

    
    public double pay() { 
    	return 0; 
    }
}