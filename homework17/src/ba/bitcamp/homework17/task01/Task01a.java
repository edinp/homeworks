package ba.bitcamp.homework17.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task01a {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("src/text.txt")));
			while(reader.ready()) {
				list.add(Character.toLowerCase((char)reader.read()));
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long begin = System.currentTimeMillis();
		int counter = 0;
		char c = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			if (c == list.get(i)) {
				counter++;
			}

		}
		
		System.out.println(counter);
		System.out.println(System.currentTimeMillis() - begin);
		
	}

}
