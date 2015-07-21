package ba.bitcamp.homework09.task04;

public class DoubleQueueLinkedList {
	
	Node start;
	Node finish;
	
	public boolean add(double d) {
		Node newNode = new Node(d);
		if (start == null) {
			start = newNode;
			finish = newNode;
		} else if (start == finish) {
			start.setNext(newNode);
			finish = newNode;
		} else {
			finish.setNext(newNode);
			finish = newNode;
		}
		return true;
	}
	
//	public boolean add(double d) {
//		Node newNode = new Node(d);
//		if (start == null) {
//			start = newNode;
//			last = newNode;
//		} else {
//			Node temp = start;
//			while (temp.getNext() != null) {
//				temp = temp.getNext();
//			}
//			temp.setNext(newNode);
//			last = temp;
//		}
//		return true;
//	}
	
	public double poll() {
		double poll = start.getValue();
		start = start.getNext();
		return poll;
	}
	
	public double peek() {
		return start.getValue();
	}
	
	public String toString() {
		return start.toString();
	}
	
	

	public static void main(String[] args) {
		
		DoubleQueueLinkedList dq = new DoubleQueueLinkedList();
//		System.out.println(dq.add(2.4));
//		System.out.println(dq.add(4.6));
//		System.out.println(dq.add(5.8));
//		System.out.println(dq.add(8.6));
//		System.out.println(dq);
//		System.out.println(dq.peek());
//		System.out.println(dq.poll());
//		System.out.println(dq);
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			dq.add(0.1 + i);
		}
		System.out.println(System.currentTimeMillis() - start);
		

	}
	
	
	
	public class Node {
		double value;
		Node next;
		
		public Node (double value) {
			this.value = value;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public double getValue() {
			return value;
		}
		
		public void setValue(double value) {
			this.value = value;
		}
		
		public String toString() {
			if (next == null) {
				return value + "";
			}
			return value + ", " + next.toString();
		}
	}

}
