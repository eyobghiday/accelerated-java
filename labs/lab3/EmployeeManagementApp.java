package labs.lab3;
//An application Java for employee mangment system.
//Fixed i.o issues
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class EmployeeManagementApp {
	
	   static int i = 0;
	    static Scanner sc = new Scanner(System.in);

	    static Employee[] readExistingFile() {
	        Employee[] employees = new Employee[10];
	        
	        try {
	            File csv = new File("src/labs/lab3/employee.csv");
	            Scanner data = new Scanner (csv);
	            while(data.hasNextLine()) {
	            	String line = data.nextLine();
	                String[] rows = line.split(",");
	                if(rows[2].equalsIgnoreCase("Salary")) {
	                    employees[i] = new SalaryEmployee();
	                    employees[i].setName(rows[0]);
	                    employees[i].setYearsEmployed(Integer.parseInt(rows[1]));
	                    ((SalaryEmployee)employees[i]).setSalary(Double.parseDouble(rows[3])*52);
	                    i++;
	                }
	                else if(rows[2].equalsIgnoreCase("Hourly")) {
	                    employees[i] = new HourlyEmployee();
	                    employees[i].setName(rows[0]);
	                    employees[i].setYearsEmployed(Integer.parseInt(rows[1]));
	                    ((HourlyEmployee)employees[i]).setHourlyPay(2);
	                    ((HourlyEmployee)employees[i]).setHoursWorked(Double.parseDouble(rows[3])/2);
	                    i++;
	                }
	            }
//	            i=0;
	            data.close();
	            
	        }catch(IOException ex) {
	            ex.printStackTrace();
	        }
	        return employees;
	        
	    }

	    static Employee[] removeEmployee(Employee[] employees) {
	        boolean found = false;
	        int j = 0;
	        int temp = i;
	        Employee[] rem = new Employee[50];
	        sc.nextLine();
	        System.out.print("Enter the name of the employee to be removed: ");
	        String name = sc.nextLine();
	        for(int l=0; l<temp; l++) {
	            if(employees[l].getName().equalsIgnoreCase(name)) {
	            	found = true;
	            	i--;
	                
	            }
	            else {
	                rem[j] = employees[l];
	                j++;
	            }
	        }

	        if(found) 
	            System.out.println("Employee is removed succesfuly!");
	        else
	            System.out.println("Employee does not exit, please try again later");

	        return rem;
	    }

	    static Employee[] addEmployee(Employee[] employees) {
	        System.out.print("Specify the type of employee whether Salary or Hourly: ");
	        String type = sc.next();
	        sc.nextLine();
	        System.out.print("Enter employee's first and last name: ");
	        String name = sc.nextLine();
	        System.out.print("How many years has the employee been working? Enter a number: ");
	        int years = sc.nextInt();
	        if(type.equalsIgnoreCase("Salary")) {
	            System.out.print("Enter employee's salary: ");
	            double sal = sc.nextDouble();
	            employees[i] = new SalaryEmployee(name, years, sal);
	        }
	        else if(type.equalsIgnoreCase("Hourly")) {
	            System.out.print("What's the employee's hourly pay: ");
	            double hPay = sc.nextDouble();
	            System.out.print("How many hours has the employee worked: ");
	            double hWorked = sc.nextDouble();
	            employees[i] = new HourlyEmployee(name, years, hPay, hWorked);
	        }
	        i++;
	        
	        return employees;
	    }

	    public static void main(String[] args) {
	        int choice;
	        Employee[] empl = new Employee[50];

	        do {
	            System.out.println("Please choose an action otherwise Enter 0 to exit ");
	            System.out.println("1. Read the company's employee list");
	            System.out.println("2. Remove an existing employee from list");
	            System.out.println("3. Add an employee to the list");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            if(choice == 1) {
	                empl = readExistingFile();
	                System.out.println("\nLIst of employees from the file:");
	                for (int k = 0; k < i; k++) 
	                    System.out.println((k+1)+". "+empl[k].toString()); 
	            }
	       
	            else if(choice == 2) {
	                empl = removeEmployee(empl);
	                System.out.println("\nThe employee has been removed and here's an updated list:");
	                for (int p = 0; p < i; p++) 
	                    System.out.println((p+1)+". "+empl[p].toString()); 
	            }
	            else if(choice == 3) {
	                empl = addEmployee(empl);
	                System.out.println("New employee has been added and here's an updated list:\n");
	                for (int q = 0; q < i; q++) 
	                    System.out.println((q+1)+". "+empl[q].toString());
	            }
	            else if(choice == 0) {
	                System.out.println("done, good bye!");
	            }
	            else {
	                System.out.println("Invalid option!");
	            }
	            System.out.println("\n\n");
	          
	        }
	        while(choice != 0);
	    }
	    
}

