package ba.bitcamp.homework11.task02;

import java.util.Scanner;
import java.util.TreeSet;

public class Task02_CountLetters {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		System.out.println("Unesite rijeci");
		String word = "";
		
		TreeSet<Character> set = new TreeSet<Character>();
		
		while (!word.equals("end")) {
			word = in.nextLine();
			for (int i = 0; i < word.length(); i++) {
				set.add(word.charAt(i));
			}
		}
		System.out.println(set.size());
		in.close();
		
	}

}
