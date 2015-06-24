package ba.bitcamp.homework01.task01;

public class CampStringBuilder {
	
	private char[] characters;
	private String str = "";

	
	public CampStringBuilder(char[] characters){
		this.characters = characters;
	}
	
	private String toString(char[] characters) {
		for (int i = 0; i < characters.length; i++) {
			str += characters[i];
		}
		return str;
	}

	public void append(Object a) {
		toString(characters);
		String append = a.toString();
		str = str + append;
		System.out.println(str);
	}

	public void prepend(Object a) {
		toString(characters);
		String prepend = a.toString();
		str = prepend + str;
		System.out.println(str);
	}

}