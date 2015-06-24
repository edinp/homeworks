package ba.bitcamp.homework02.task01;

public abstract class StoryElement {
	
	private String name;
	
	public StoryElement(String name) {
		this.name = name;
	}
	
	public StoryElement(){
		this("STElement");
	}
	
	public String getName() {
		return name;
	}

}
