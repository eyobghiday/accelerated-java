package labs.lab4;
//An application Java for employee mangment system.
//With added menu options to edit details
//LookUp by name and Exit

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EmployeeManagementApp {

	static final String csv = "src/labs/lab4/employee.csv";
	static Scanner scanner = new Scanner(System.in);
	static List<Employee> employees;

	public static void main(String[] args) {

		employees = readExistingFile();

		while (true) {
			System.out.println("\n1. List All Employees: ");
			System.out.println("2. Lookup An Employee: ");
			System.out.println("3. Create New Employee: ");
			System.out.println("4. Edit An Employee: ");
			System.out.println("5. Remove an Employee: ");
			System.out.println("6. Exit: \n");

			System.out.println("Enter your option from 1 to 6: ");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				listEmployees();
				break;

			case 2:
				lookupEmployee();
				break;

			case 3:
				createEmployee();
				break;

			case 4:
				editEmployee();
				break;

			case 5:
				removeEmployee();
				break;

			case 6:
				System.out.println("Goood bye!");
				System.exit(0);
				break;

			default:
				System.out.println("Please enter an option from above given menu.");
				break;
			}
		}
	}

	private static void editEmployee() {
		System.out.println("Enter employee's Id to edit the details: ");
		String id = scanner.next();
		Iterator<Employee> itr = employees.iterator();
		boolean isEmpFound = false;
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (id.equalsIgnoreCase(emp.getId())) {
				isEmpFound = true;
				System.out.println("Employee number " + id + " has been found!");

				System.out.println("Enter new name to update employee " + id);
				scanner.nextLine();
				String name = scanner.nextLine();
				emp.setName(name);
				System.out.println("Name has been updated:");

				System.out.println("Enter years employed to update:");
				int yearsEmployed = scanner.nextInt();
				emp.setYearsEmployed(yearsEmployed);
				System.out.println("Years Employed has been updated: \n");

				System.out.println("All details has been updated successfully!");

			}
		}
		if (!isEmpFound) {
			System.out.println("No employee exists with id " + id);
		}
	}

	private static void lookupEmployee() {
		System.out.println("Enter the name of employee to lookup: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		Iterator<Employee> itr = employees.iterator();
		boolean isEmpFound = false;
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (name.equalsIgnoreCase(emp.getName())) {
				isEmpFound = true;
				System.out.println("\nHere are the details for the employee: ");
				System.out.println(emp);
			}
		}
		if (!isEmpFound) {
			System.out.println("\nNo employee exists with the name " + name);
		}

	}

	private static void listEmployees() {
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

	private static void removeEmployee() {
		System.out.println("Enter employee's Id to remove: ");
		String id = scanner.next();
		Iterator<Employee> itr = employees.iterator();
		boolean isEmpFound = false;
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (id.equalsIgnoreCase(emp.getId())) {
				isEmpFound = true;
				itr.remove();
				System.out.println("Employee with id " + id + " has been removed successfully!");
			}
		}
		if (!isEmpFound) {
			System.out.println("No employee exists with id " + id);
		}
	}

	private static void createEmployee() {
		System.out.println("Enter name:");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter years employed:");
		int yearsEmployed = scanner.nextInt();
		System.out.println("Enter type of employee S for Salary or H for Hourly):");
		String type = scanner.next();
		if (type.equalsIgnoreCase("S")) {
			System.out.println("Enter salary:");
			double salary = scanner.nextDouble();
			SalaryEmployee se = new SalaryEmployee(name, yearsEmployed, salary);
			employees.add(se);
		} else if (type.equalsIgnoreCase("H")) {
			System.out.println("Enter Hourly Pay:");
			double pay = scanner.nextDouble();
			System.out.println("Enter Hours Worked:");
			double hours = scanner.nextDouble();
			HourlyEmployee he = new HourlyEmployee(name, yearsEmployed, pay, hours);
			employees.add(he);
		}
		System.out.println("Employee added successfully!");
	}

	private static List<Employee> readExistingFile() {
		List<Employee> employees = new ArrayList<Employee>();
		try {
			File file = new File(csv);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] empArr = line.split(",");
				String name = empArr[0];
				int yearsEmployed = Integer.parseInt(empArr[1]);
				String type = empArr[2];

				if (type.equalsIgnoreCase("Salary")) {
					double salary = Double.parseDouble(empArr[3]);
					SalaryEmployee se = new SalaryEmployee(name, yearsEmployed, salary);
					employees.add(se);
				} else if (type.equalsIgnoreCase("Hourly")) {
					double pay = Double.parseDouble(empArr[3]);
					HourlyEmployee he = new HourlyEmployee(name, yearsEmployed, pay, 8);
					employees.add(he);
				}
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return employees;
	}
}