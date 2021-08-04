package lectures.five;

public class CatClient {

	public static void main(String[] args) {
		Cat c = new Cat("Wash");
		
		System.out.println(c.fed);
		c.fed = true;
		System.out.println(c.fed);
		c.setFed(false);
		System.out.println(c.fed);
		
		System.out.println(c.getName());
		c.setAge(-100);
		System.out.println(c.getAge());
		System.out.println(c.isNeutered());
		System.out.println(c.isFed());
		c.setMood("Barking");
		System.out.println(c.getMood());
		
		System.out.println(c);
		c.setMood("Hunting");
		System.out.println(c.toString());
		
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		
		System.out.println(c.equals(c2));
		System.out.println(c2.equals(c3));
		
		System.out.println(c.talk());
		System.out.println(c2.talk());
	}

}
