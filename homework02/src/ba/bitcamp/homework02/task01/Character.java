package ba.bitcamp.homework02.task01;

public class Character extends StoryElement {
	
	private String gender;
	private Boolean alive;
	private Boolean capable;
	
	public Character(String name, String gender, Boolean capable){
		super(name);
		this.gender = gender;
		this.capable = capable;
		this.alive = true;
	}
	
	public Boolean getAlive() {
		return alive;
	}
	
	public Boolean getCapable() {
		return capable;
	}
	
	
	public void killCharacter(){
		this.alive = false;
	}
	
	public void setCapable () {
		this.capable = true;
	}
	
	public String toString() {
		return super.getName() + " (" + gender + "). \nCapable: " + capable + "\nAlive: " + alive;
	}

}
