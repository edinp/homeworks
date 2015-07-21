package ba.bitcamp.homework11.task01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Task01_ListIterator {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		for (int i = 0; i < 20; i++) {
			list1.add((int)(Math.random()*50+50));
		}
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		ListIterator<Integer> it = list1.listIterator();
		
		while (it.hasNext()) {
			int num = it.next();
			list2.add(num);
		}
		
		System.out.println(list2);
		
		while (it.hasPrevious()) {
			int num = it.previous();
			list2.add(num);
		}
		
		System.out.println(list2);
		
		
	}
	

}
