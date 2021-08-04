package lectures.six;

public class Chimp extends Animal {

	public boolean equals(Animal a) {
		if (!(a instanceof Chimp)) {
			return false;
		}
		
		return super.equals(a);
	}

}
