package lectures.six;

public class Veggie extends Food {

	private boolean fruit;
	
	public Veggie() {
		super();
		fruit = false;
	}
	
	public Veggie(String name) {
		super(name);
		fruit = false;
	}
	
	public Veggie(String name, boolean fruit) {
		super(name);
		this.fruit = fruit;
	}
	
	public void setName(String name) {
		super.set(name);
	}
	
	public String getName() {
		return super.get();
	}
	
	public void setFruit(boolean fruit) {
		this.fruit = fruit;
	}
	
	public boolean isFruit() {
		return fruit;
	}
	
	public String toString() {
		return super.toString() + " - " + (fruit?"fruit":"veg");
	}
	
	public boolean equals(Food f) {
		if (!(f instanceof Veggie)) {
			return false;
		}
		
		Veggie v = (Veggie) f;
		if (!super.equals(v)) {
			return false;
		} else if (this.fruit != v.isFruit()) {
			return false;
		}
		
		return true;
	}
	
}
