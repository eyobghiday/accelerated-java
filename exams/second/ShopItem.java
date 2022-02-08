package exams.second;

public abstract class ShopItem {
	protected String name;
	private double price;

	public ShopItem() {
		//this is my default constuctor
		price = 0; //minimum price is 0 since it can't be negative. 
	}

	public ShopItem(String name, double price) {
		this.price = price;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name=" + name + "and price=" + price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ShopItem obj2)) {
			return false;
		}

		return name.equals(obj2.name) && price == obj2.price;
	}

	public abstract double purchase(double paid);

}
