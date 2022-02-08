package exams.second;
//Question One: Inheritance/Polymorphism/Abstract Classes
//1. This application class is not required but I'm just trying to implement my methods
//2. Has main method and Checks basic things and instantiation of inherited classes
//3. The rest is self explanotaroy
public class ShopApplication {

	public static void main(String[] args) {
		//note here we can't instantiate abstract class but we'll use the classes that inherited it
		Drink s1 = new Drink("Soda",3, 2);
		s1.setName("John Smith");
		s1.setPrice(5);
		s1.setSize(2);
		System.out.println("Name is "+s1.getName());
		System.out.println("Price is "+s1.getPrice());
		double change =s1.purchase(100);
		System.out.println("Change left is "+ change);
		System.out.println("\nNext order: "+s1);

	}

}
