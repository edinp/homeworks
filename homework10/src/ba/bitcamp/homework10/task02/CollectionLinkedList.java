package ba.bitcamp.homework10.task02;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionLinkedList implements Collection<Integer> {
	
	Node start;
	Node finish;
	
	public CollectionLinkedList () {
		start = null;
		finish = null;
	}
	
	public String toString() {
		if (start == null) {
			return "Linked List is Empty";
		}
		return start.toString();
	}
	
	public class Node {
		Node next;
		Integer value;
		
		public Node (Integer value) {
			this.value = value;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext (Node next) {
			this.next = next;
		}
		
		public Integer getValue() {
			return value;
		}
		
		public String toString() {
			if (next == null) {
				return value + "";
			}
			return value + ", " + next.toString();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectionLinkedList list = new CollectionLinkedList();
		System.out.println("Add: " + list.add(3));
		list.add(6);
		list.add(2);
		list.add(5);
		System.out.println(list);
//		list.clear();
		System.out.println("Contains: " + list.contains(2));
		System.out.println("Is Empty: " + list.isEmpty());
//		list.remove(6);
//		list.remove(2);
		System.out.println(list.size());
		Integer[] array = (Integer[]) list.toArray();
		System.out.println(Arrays.toString(array));
		
		

	}

	@Override
	public boolean add(Integer e) {
		Node newNode = new Node(e);
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

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		start = null;
	}

	@Override
	public boolean contains(Object o) {
		Integer num = (Integer) o;
		Node temp = start;
		while (temp != null) {
			if (temp.getValue() == num) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return (start == null);
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		Integer num = (Integer) o;
		Node temp = start;
		while (temp != null && temp.getNext().getValue() != num) {
			temp = temp.getNext();
		}
		Node remove = temp.getNext();
		temp.setNext(remove.getNext());
 		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		int size;
		if (start == null) {
			return 0;
		} else {
			Node temp = start;
			size = 1;
			while (temp.getNext() != null) {
				size++;
				temp = temp.getNext();
			}
		}
		return size;
	}

	@Override
	public Object[] toArray() {
		Integer[] array = new Integer[size()];
		if (start == null) {
			return null;
		} else {
			Node temp = start;
			for (int i = 0; i < size(); i++) {
				array[i] = temp.getValue();
				temp = temp.getNext();
			}
		}
		return array;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
