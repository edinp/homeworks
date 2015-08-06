package ba.bitcamp.homework17.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Task01 {

	static ArrayList<Character> list;
	static ArrayList<Worker> workers;
	static LinkedBlockingQueue<Task> queue;
	static Integer counter = 0;
	static Object obj = new Object();

	public static void main(String[] args) {

		list = new ArrayList<Character>();
		queue = new LinkedBlockingQueue<Task>();
		workers = new ArrayList<Worker>();
		
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
		int size = list.size();
		int numOfTasks = 10;
		int step = size/numOfTasks;
		
		for (int i = 0; i < numOfTasks; i++) {
			Task t = new Task(i*step, (i+1)*step);
			queue.add(t);
		}
		
		for (int i = 0; i < 4; i++) {
			Worker w = new Worker();
			workers.add(w);
			w.start();
		}
		
		for (Worker w : workers) {
			try {
				w.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(counter);
		System.out.println(System.currentTimeMillis() - begin);
	}
	
	static class Worker extends Thread {
		@Override
		public void run() {
			while (!queue.isEmpty()) {
				try {
					Task t = queue.take();
					t.run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class Task implements Runnable {

		int start;
		int finish;
		
		public Task(int start, int finish) {
			this.start = start;
			this.finish = finish;
		}
		
		@Override
		public void run() {
			
			char c = list.get(0);
			
			for (int i = start; i < finish; i++) {
				synchronized (obj) {
					if (c == list.get(i)) {
						counter++;
					}					
				}
			}

		}
		
	}

}