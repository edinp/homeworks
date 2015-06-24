package ba.bitcamp.homework02.task01;

public class Goal extends StoryElement {
	
	public static final Integer EASY = 1;
	public static final Integer HARD = 2;
	public static final Integer IMPOSSIBLE = 3;
	
	private Integer level;
	private String what;
	private Character who;
	
	public Goal(String name, Integer level, String what, Character who){
		super(name);
		this.level = level;
		this.what = what;
		this.who = who;
	}
	
	public Integer getLevel(){
		return level;
	}
	
	public String getEvent(){
		return what;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public String toString() {
		return "Goal is " + what;
	}

}
