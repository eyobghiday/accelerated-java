package exams.second;
public class Food extends ShopItem {
    private boolean kids;

    public Food() {
        kids = false; //I'll assume there are no kids by default
    }

    public Food(String name, double price, boolean kids) {
        super(name, price);
        this.kids = kids;
    }

    public boolean isKids() {
        return kids; //check if customer has kids or not
    }

    public void setKids(boolean kids) {
        this.kids = kids; 
    }

    @Override
    public String toString() {
        return "Name is " + name + " has kids " + kids + "and the Price is $" + getPrice();
    }

    @Override
    public boolean equals(Object obj5) {

        if (obj5 == this) {
            return true;
        }

        if (!(obj5 instanceof Food obj6)) {
            return false;
        }

        return super.equals(obj5) && obj6.kids == kids;
    }

    @Override
    public double purchase(double paid) {
        double totalprice = getPrice() / (kids ? 2 : 1);
        
        if (paid < totalprice) {
			System.out.println("Not enough credit. You'll need more than that");
		}

		return totalprice - paid; //if you pay more this will be your change
    }
}