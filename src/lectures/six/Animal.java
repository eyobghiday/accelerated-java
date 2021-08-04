package lectures.six;

public class Animal {
	
	private String name;
	private int age;
	private double weight;
	
	public Animal() {
		name = "Spot";
		age = 0;
		weight = 0.0;
	}
	
	public Animal(String name, int age, double weight) {
		this();
		this.name = name;
		setAge(age);
		setWeight(weight);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
	
	public void setWeight(double weight) {
		if (weight >= 0.0) {
			this.weight = weight;
		}
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String toString() {
		return "Name: " + name + ";age: " + age + ";weight: " + weight;
	}
	
	public boolean equals(Animal a) {
		if (!this.name.equals(a.getName())) {
			return false;
		} else if (this.age != a.getAge()) {
			return false;
		} else if (Math.abs(this.weight - a.getWeight()) > 0.001) {
			return false;
		}
		
		return true;
	}
	
	public void sleep() {
		System.out.println(name + ": Zzzzz");
	}
	
	public double feed(Food f) {
		System.out.println(name + " eats " + f.get());
		weight += 0.01;
		return weight;
	}
}
