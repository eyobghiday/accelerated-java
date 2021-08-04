package lectures.six;

public class Meat extends Food {

	private boolean redMeat;
	
	public Meat() {
		super();
		redMeat = false;
	}
	
	public Meat(String name) {
		super(name);
		redMeat = false;
	}
	
	public Meat(String name, boolean redMeat) {
		super(name);
		this.redMeat = redMeat;
	}
	
	public void setName(String name) {
		super.set(name);
	}
	
	public String getName() {
		return super.get();
	}
	
	public void setRedMead(boolean redMeat) {
		this.redMeat = redMeat;
	}
	
	public boolean isRedMeat() {
		return redMeat;
	}
	
	public String toString() {
		return super.toString() + " - " + (redMeat?"Red":"White");
	}
	
	public boolean equals(Food f) {
		if (!(f instanceof Meat)) {
			return false;
		}
		
		Meat m = (Meat)f;
		if (!super.equals(m)) {
			return false;
		} else if (this.redMeat != m.isRedMeat()) {
			return false;
		}
		
		return true;
	}
	
}
