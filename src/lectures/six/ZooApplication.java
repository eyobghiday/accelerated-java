package lectures.six;

import java.io.File;
import java.util.Scanner;

public class ZooApplication {
	
	// Read in animals.csv to start our zoo
	public static Animal[] init(String filename) {
		Animal[] animals = new Animal[10];
		int counter = 0;
		try {
			File f = new File(filename);
			Scanner input = new Scanner(f);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				String[] values = line.split(",");
				Animal a;
				switch (values[1]) {
					case "Elephant":
						a = new Elephant();
						break;
					case "Lion":
						a = new Lion();
						break;
					case "Eagle":
						a = new Eagle();
						break;
					case "Chimpanzee":
						a = new Chimp();
						break;
					default:
						a = new Animal();
				}
				a.setName(values[0]);
				a.setAge(Integer.parseInt(values[2]));
				a.setWeight(Double.parseDouble(values[3]));
				
				animals = addElement(animals, a, counter);
				counter++;
			}
			
			input.close();
		} catch (Exception e) {
			System.out.println("Something went wrong building our array of animals.");
		}
		
		animals = trimArray(animals, counter);
		
		return animals;
	}
	
	public static Animal[] addElement(Animal[] animals, Animal a, int used) {
		
		if (used == animals.length) {
			// resize
			Animal[] temp = new Animal[animals.length + 1];
			for (int i=0; i<animals.length; i++) {
				temp[i] = animals[i];
			}
			animals = temp;
			temp = null;
		}
		
		animals[used] = a;
		
		return animals;
	}
	
	public static Animal[] trimArray(Animal[] animals, int used) {
		Animal[] temp = new Animal[used];
		for (int i=0; i<used; i++) {
			temp[i] = animals[i];
		}
		animals = temp;
		temp = null;
		
		return animals;
	}
	
	public static void listAnimals(Animal[] animals) {
		for (int i=0; i<animals.length; i++) {
			System.out.println((i+1) + ". " + animals[i]);
		}
	}
	
	public static void feed(Animal[] animals, Scanner input) {
		int c = findAnimal(animals, input);
		
		System.out.print("What is the food called? ");
		String foodName = input.nextLine();
		System.out.print("Is it meat or veggie? ");
		Food f;
		if (input.nextLine().equalsIgnoreCase("meat")) {
			f = new Meat(foodName);
		} else {
			f = new Veggie(foodName);
		}
		
		animals[c-1].feed(f);
	}
	
	public static int findAnimal(Animal[] animals, Scanner input) {
		int c = -1;
		System.out.println("Which animal?");
		boolean done = false;
		String choice = "";
		do {
			try {
				listAnimals(animals);
				System.out.print("Choice: ");
				choice = input.nextLine();
				c = Integer.parseInt(choice);
				if (c <= 0 || c > animals.length) {
					System.out.println("'" + choice + "' is not within range.");
				} else {
					done = true;
				}
			} catch (Exception e) {
				System.out.println("'" + choice + "' is not a valid option.");
			}
		} while (!done);
		
		return c;
	}
	
	public static void lookAt(Animal[] animals, Scanner input) {
		int c = findAnimal(animals, input);
		
		animals[c-1].sleep();
	}
	
	public static Animal[] addAnimal(Animal[] animals, Scanner input) {
		
		System.out.print("Animal Name: ");
		String name = input.nextLine();
		boolean done = false;
		double weight = 0.0;
		do {
			System.out.print("Animal's Weight: ");
			String value = input.nextLine();
			try {
				weight = Double.parseDouble(value);
				done = true;
			} catch (Exception e) {
				System.out.println("'" + value + "' is not a double. Try again.");
			}
		
		} while (!done);
		
		done = false;
		int age = 0;
		do {
			System.out.print("Animal's Age: ");
			String value = input.nextLine();
			try {
				age = Integer.parseInt(value);
				done = true;
			} catch (Exception e) {
				System.out.println("'" + value + "' is not an int. Try again.");
			}
		
		} while (!done);
		
		done = false;
		String type = "";
		do {
			System.out.print("What type of animal? ('Lion', 'Elephant', 'Chimp', 'Eagle'): ");
			String value = input.nextLine();
			switch(value.toLowerCase()) {
				case "elephant": case "lion": case "chimp": case "eagle":
					type = value.toLowerCase();
					done = true;
					break;
				default:
					System.out.println("'" + value + "' is not 'Lion', 'Elephant', 'Chimp', or 'Eagle'. Please try again.");
			}
		} while (!done);
		
		Animal a;
		switch (type) {
			case "elephant":
				a = new Elephant();
				break;
			case "lion":
				a = new Lion();
				break;
			case "eagle":
				a = new Eagle();
				break;
			case "chimp":
				a = new Chimp();
				break;
			default:
				a = new Animal();
		}
		
		a.setName(name);
		a.setAge(age);
		a.setWeight(weight);
		
		animals = addElement(animals, a, animals.length);
		
		return animals;
	}
	
	public static Animal[] removeAnimal(Animal[] animals, Scanner input) {
		int index = findAnimal(animals, input);
		
		for (int i=index-1; i<(animals.length-1); i++) {
			animals[i] = animals[i+1];
		}
		
		animals = trimArray(animals, animals.length - 1);
		
		return animals;
	}

	public static void main(String[] args) {
		// Read in file - initialize our animals
		Animal[] population = init("src/lectures/six/animals.csv");
		
		// Prompt with menu
		Scanner input = new Scanner(System.in);
		boolean done = false;
		do {
			System.out.println("1. List animals");
			System.out.println("2. Feed animal");
			System.out.println("3. Look at animal");
			System.out.println("4. Add animal");
			System.out.println("5. Remove animal");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");
			
			String choice = input.nextLine();
			
			switch (choice) {
				case "1":
					// list
					listAnimals(population);
					break;
				case "2":
					// feed
					feed(population, input);
					break;
				case "3":
					// look at
					lookAt(population, input);
					break;
				case "4":
					// add
					population = addAnimal(population, input);
					break;
				case "5":
					// remove
					population = removeAnimal(population, input);
					break;
				case "6":
					done = true;
					break;
				default:
					System.out.println("I'm sorry, but I didn't understand that choice. Please try again.");
			}
		} while (!done);
		
		System.out.println("Goodbye!");
	}

}
