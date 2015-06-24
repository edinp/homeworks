package ba.bitcamp.homework02.task01;

public class Protagonist extends Character {
	
	private Goal goal;
	private Character[] characters;
	private Character enemy;
	
	public Protagonist(String name, String gender, Boolean capable){
		super(name, gender, capable);
		this.characters = new Character[3];
	}
	
	public void setEnemy(Character e){
		this.enemy = e;
	}
	
	public void addFriend (Character f) {
		if (characters.length < 4) {
			characters[characters.length] = f;
		} else
			System.out.println("Your lead character can not have any more friends.");
	}
	
//		int count = 0;
//		for (int i = 0; i < 3; i++){
//			if (characters[i] != null) {
//				count++;
//			}
//		}
//		
//		if (count < 4) {
//			for (int i = 0; i < 3; i++) {
//				if (characters[i] == null) {
//					characters[i] = f;
//				}
//			}
//		} else {
//			System.out.println("Your lead character can not have any more friends.");
//		}
//	}
	
	public void attainGoal() {
		int probability = 0;
		if (this.getAlive() == true) {
			if (this.getCapable() == true) {
				probability+=40;
			}
			for (int i = 0; i < characters.length; i++) {
				if (characters[i].getCapable() == true) {
					probability+=20;
				}
			}
			if (enemy.getCapable() == true) {
				probability-=30;
			}
			if (goal.getLevel() == Goal.HARD) {
				probability-=20;
			}
			if (goal.getLevel() == Goal.IMPOSSIBLE) {
				probability = 0;
			}
		} else {
			System.out.println("Main character is already dead.");
		}
		if (probability > 50) {
			System.out.println("Main chacacter did " + goal.toString());
			for (int i = 0; i < characters.length; i++) {
				if (characters[i].getCapable() == false)
					characters[i].setCapable();
					break;
			}
		} else {
			System.out.println("Main character failed to " + goal.toString());
			for (int i = 0; i < characters.length; i++) {
				if (characters[i].getAlive() == true) {
					characters[i].killCharacter();
					break;
				}
			}
		}
	}
}