package lectures.five;

public class Cat {
	
	private String name;
	private int age;
	private boolean neutered;
	public boolean fed;
	private String mood;
	
	public Cat() {
		name = "Mal";
		age = 5;
		neutered = true;
		fed = false;
		mood = "Asleep";
	}
	
	public Cat(String name) {
		this();
		this.name = name;
	}
	
	public Cat(String n, int a, boolean ne) {
		this();
		name = n;
		age = a;
		neutered = ne;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
	
	public void setNeutered(boolean neutered) {
		this.neutered = neutered;
	}
	
	public void setFed(boolean fed) {
		this.fed = false;
	}
	
	public void setMood(String mood) {
		switch (mood) {
			case "Asleep":
			case "Hunting":
			case "Eating":
			case "Bathroom":
			case "Cuddling":
				this.mood = mood;
				break;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isNeutered() {
		return neutered;
	}
	
	public boolean isFed() {
		return fed;
	}
	
	public String getMood() {
		return mood;
	}
	
	public String toString() {
		return name + " is age " + age + " years old. They are " +
				(neutered?"":"not ") + "neutered and " +
				(fed?"":"not ") + "fed. They are currently " + mood + ".";
	}
	
	public boolean equals(Cat c) {
		if (!this.name.equals(c.getName())) {
			return false;
		} else if (this.age != c.getAge()) {
			return false;
		} else if (this.neutered != c.isNeutered()) {
			return false;
		} else if (!this.mood.equals(c.getMood())) {
			return false;
		}
		
		return true;
	}
	
	public String talk() {
		String text;
		switch (mood) {
			case "Asleep":
				text = "Zzzz";
				break;
			case "Hunting":
			case "Bathroom":
				text =  "...";
				break;
			case "Eating":
				text = "Nom";
				break;
			case "Cuddling":
				text = "Purrrr";
				break;
			default:
				text = "HISSSS";
		}
		
		return name + ": " + text;
	}

}
