package ba.bitcamp.homework08.task01;

import java.awt.List;

public class LinkedListDouble {

	Node start;

	public LinkedListDouble() {

	}

	public LinkedListDouble(LinkedListDouble list) {
		for (int i = 0; i < list.size(); i++) {
			this.add(list.get(i));
		}
	}

	public void add(double d) {
		if (start == null) {
			start = new Node(d);
		} else {
			Node last = getLast();
			last.next = new Node(d);
		}
	}
	
	public void add(double d, int index) {
		
	}

	public Node getLast() {
		if (start == null) {
			return null;
		}
		Node temp = start;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}

	public void remove(int index) {
		Node temp = start;
		if (index == 0) {
			temp = temp.getNext();
			start = temp;
		} else {
			for (int i = 0; i < index; i++) {
				temp = temp.getNext();
			}
			Node previous = getPrevious(temp);
			previous.setNext(temp.getNext());
		}
	}

	public double get(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp.value;
	}

	public int size() {
		int size = 0;
		Node temp = start;
		while (temp != null) {
			size++;
			temp = temp.getNext();
		}
		return size;
	}

	public Node getPrevious(Node n) {
		if (n == start) {
			return null;
		}
		Node temp = start;
		while (temp.getNext() != n) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	public double returnMiddle() {
		int middle = this.size() / 2;
		if (this.size() % 2 == 0) {
			return get(middle-1);			
		}
		return get(middle);
	}
	
	public double getFirstValue(){
		return start.value;
	}
	
	public double getLastValue(){
		return this.getLast().value;
	}
	
	public void deleteFirst(){
		Node temp = start;
		start = temp.getNext();
	}
	
	public void deleteLast(){
		this.remove(size()-1);
	}

	public String toString() {
		if (start == null) {
			return "List is empty";
		}
		return start.toString();
	}


	
	
	
	
	private class Node {
		double value;
		Node next;

		public Node(double value) {
			this.value = value;
		}

		public String toString() {
			if (next == null) {
				return value + "";
			}
			return value + " " + next.toString();
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	
	
	
	
	public static void main(String[] args) {

		LinkedListDouble list = new LinkedListDouble();
		list.add(1.1);
		list.add(2.2);
		list.add(3.3);
		list.add(4.4);
		//System.out.println(list.getLast());
		//System.out.println(list);
		//list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		
		LinkedListDouble list1 = new LinkedListDouble(list);
		System.out.println(list1);
		
		System.out.println(list.returnMiddle());
		
		list.deleteLast();
		System.out.println(list);
		System.out.println(list.getLast());

	}

}
