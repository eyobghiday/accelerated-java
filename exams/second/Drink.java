package exams.second;

public class Drink extends ShopItem {
	int size;
	
	public Drink() {
		size = 1; //I'll set the default value to minimum drink size
	}

	public Drink(String name, double price, int size) {
		super(name, price);
		setSize(size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size != 1 && size !=2 && size != 3) {
			System.out.println("Please enter a valid drink size");
		}
		else {
		this.size = size;
		}
	}

	@Override
	public String toString() {
		return "Name is " + name + ", Drink size is " + size + " and the Price is $" + getPrice();
	}

	@Override
	public boolean equals(Object obj3) {

		if (obj3 == this) {
			return true;
		}

		if (!(obj3 instanceof Drink obj4)) {
			return false;
		}

		return super.equals(obj3) && obj4.size == size;
	}

	@Override
	public double purchase(double paid) {
		double totalprice = getPrice() * size;

		if (paid < totalprice) {
			System.out.println("Not enough credit. You'll need more than that");
		}

		return totalprice - paid; //if you pay more this will be your change
	}
}
