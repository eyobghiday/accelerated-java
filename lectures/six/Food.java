package lectures.six;

public class Food {

	private String name;
	
	public Food() {
		name = "lettuce";
	}
	
	public Food(String name) {
		this.name = name;
	}
	
	public void set(String name) {
		this.name = name;
	}
	
	public String get() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Food f) {
		return name.equals(f.get());
	}
	
}
