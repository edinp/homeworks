package ba.bitcamp.homework01.task04;

public abstract class Pet {
	
	private String name;
	private Integer age;
	private String species;
	
	public Pet(String name, Integer age, String species){
		this.name = name;
		this.age = age;
		this.species = species;
	}
	
	public abstract String toString();
	

}
