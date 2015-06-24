package ba.bitcamp.homework01.task01;

public class Main {
	
	public static void main(String[] args) {

		char[] characters = new char[] {'k', 'a', 'k', 'o', 's', 'i' };
		CampStringBuilder builder = new CampStringBuilder(characters);
		builder.prepend("sta");
		builder.append("a");

	}

}
