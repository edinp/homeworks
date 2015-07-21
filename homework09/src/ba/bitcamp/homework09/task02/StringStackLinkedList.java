package ba.bitcamp.homework09.task02;

public class StringStackLinkedList {
	
	private Node start;
	
	public StringStackLinkedList() {
		start = null;
	}
	
	public boolean isEmpty() {
		return (start == null);
	}
	
	public String push(String str) {
		Node newNode = new Node(str);
		if (start == null) {
			start = newNode;
		} else {
			newNode.setNext(start);
			start = newNode;
		}
		return str;
	}
	
	public String peek() {
		if (start == null) {
			return "StringStackLinkedList is empty";
		} else {
			return start.getValue();
		}
	}
	
	public String pop() {
		Node temp = start;
		if (start == null) {
			return "StringStackLinkedList is empty";
		} else {
			start = start.getNext();
		}
		return temp.getValue();
	}
	
	public int search(String str) {
		Node temp = start;
		int index = 0;
		while (temp != null && !temp.getValue().equals(str)) {
			temp = temp.getNext();
			index++;
		}
		return index;
	}
	
	public String toString() {
		if (start == null) {
			return "StringStackLinkedList is empty";
		}
		return start.toString();
	}
	
	

	public static void main(String[] args) {
		
		StringStackLinkedList ss = new StringStackLinkedList();
//		String edin = "Edin";
//		String azra = "Azra";
//		String omar = "Omar";
//		ss.push(edin);
//		ss.push(azra);
//		ss.push(omar);
//		System.out.println(ss);
//		System.out.println(ss.peek());
//		System.out.println(ss.pop());
//		System.out.println(ss.peek());
//		System.out.println(ss);
//		System.out.println(ss.isEmpty());
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			ss.push(i + ", ");
		}
		System.out.println(System.currentTimeMillis() - start);
		
		System.out.println(ss.search("0, "));

	}
	
	

	public class Node {
		
		String value;
		Node next;
		
		public Node(String value) {
			this.value = value;
			next = null;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node n) {
			this.next = n;
		}
		
		public String getValue() {
			return value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
		
		public String toString() {
			if (next == null) {
				return value;
			}
			return value + ", " + next.toString();
		}
		
	}
}
