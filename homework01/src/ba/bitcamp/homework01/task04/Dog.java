package ba.bitcamp.homework01.task04;

public class Dog extends Pet {
	
	private String breed;
	
	public Dog(String name, Integer age, String species, String breed) {
		super(name, age, species);
		this.breed = breed;
	}
	
	public String toString(){
		return "Av av";
	}

}
