package ba.bitcamp.homework09.task03;

import java.util.Arrays;

public class DoubleQueueArray {
	
	double[] numbers;
	
	public DoubleQueueArray () {
		this.numbers = new double[0];
	}
	
	public boolean add(double d) {
		numbers = Arrays.copyOf(numbers, numbers.length+1);
		numbers[numbers.length-1] = d;
		return true;
	}
	
	public double poll() {
		double poll = numbers[0];
		double[] temp = new double[numbers.length-1];
		for (int i = 1; i < numbers.length; i++) {
			temp[i-1] = numbers[i];
		}
		numbers = temp;
		return poll;
	}
	
	public double peek() {
		return numbers[0];
	}
	
	
	public String toString() {
		return Arrays.toString(numbers);
	}
	
	

	public static void main(String[] args) {
		DoubleQueueArray dq = new DoubleQueueArray();
//		System.out.println(dq.add(2.1));
//		System.out.println(dq.add(4.8));
//		System.out.println(dq.poll());
//		System.out.println(dq);
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			dq.add(0.1 + i);
		}
		System.out.println(System.currentTimeMillis() - start);
		
		

	}

}
