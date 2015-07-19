package ba.bitcamp.homework09.task01;

import java.util.Arrays;

public class StringStackArray {
	
	private String[] strings;
	
	public StringStackArray() {
		this.strings = new String[0];
	}
	
	public boolean isEmpty() {
		return (strings.length == 0);
	}
	
	public String push(String str) {
		String[] temp = new String[strings.length + 1];
		for (int i = 0; i < strings.length; i++) {
			temp[i] = strings[i];
		}
		temp[temp.length - 1] = str;
		strings = temp;
		return str;
	}
	
	public String pop() {
		String temp = strings[strings.length -1];
		strings = Arrays.copyOf(strings, strings.length-1);
		return temp;
	}
	
	public String peek(){
		return strings[strings.length-1];
	}
	
	public int search(String str) {
		int i;
		for (i = 0; i < strings.length; i++) {
			if (strings[i].equals(str)) {
				break;
			}
		}
		return i;
	}
	
	public String toString(){
		return Arrays.toString(strings);
	}

	public static void main(String[] args) {
		
		StringStackArray ss = new StringStackArray();
//		String sarajevo = "Sarajevo";
//		String edin = "Edin";
//		String azra = "Azra";
//		String omar = "Omar";
//		ss.push(sarajevo);
//		ss.push(edin);
//		ss.push(azra);
//		ss.push(omar);
//		System.out.println(ss.isEmpty());
//		System.out.println(ss.pop());
//		System.out.println(ss);
//		System.out.println(ss.peek());
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			ss.push(i + ", ");
		}
		System.out.println(System.currentTimeMillis() - start);
		
		System.out.println(ss.search("44444, "));
		

	}

}
