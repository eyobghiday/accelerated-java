package lectures.six;

public class Elephant extends Animal {
	
	public boolean equals(Animal a) {
		if (!(a instanceof Elephant)) {
			return false;
		}
		
		return super.equals(a);
	}
	
	public double feed(Food f) {
		if (f instanceof Veggie) {
			return super.feed(f);
		}
		
		System.out.println(getName() + " doesn't eat " + f.get());
		return getWeight();
	}

}
