package ba.bitcamp.homework02.task01;

public class Main {

	public static void main(String[] args) {


		Character a = new Character("Meho", "male", false);
		System.out.println(a);
		
		a.killCharacter();
		System.out.println(a);
		
		
		
		Protagonist p1 = new Protagonist("Edin", "male", true);
		
		p1.addFriend(a);
		

	}

}
