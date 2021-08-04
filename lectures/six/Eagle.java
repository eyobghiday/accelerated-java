package lectures.six;

public class Eagle extends Animal {

	public boolean equals(Animal a) {
		if (!(a instanceof Eagle)) {
			return false;
		}
		
		return super.equals(a);
	}
	
	public double feed(Food f) {
		if (f instanceof Meat) {
			return super.feed(f);
		}
		
		System.out.println(getName() + " doesn't eat " + f.get());
		return getWeight();
	}
	
}
