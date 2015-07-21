package ba.bitcamp.homework10.task01;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class IteratorLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for (int i = 0; i < 100000; i++) {
			list.add((int)(Math.random()*100+1));
		}
		
		System.out.println(list);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite broj cije djelioce zelite izbaciti sa liste: ");
		int num = in.nextInt();
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int n = it.next();
			if (n % num == 0) {
				it.remove();
			}
		}
		System.out.println(list.size());
		in.close();

	}

}
