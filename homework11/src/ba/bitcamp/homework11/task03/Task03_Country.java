package ba.bitcamp.homework11.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;

public class Task03_Country implements Comparable<Task03_Country> {

	private String name;
	private Integer population;
	private Integer area;

	public enum sort {
		NAME, POPULATION, AREA
	};

	public Task03_Country(String name, Integer population, Integer area) {
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public static void sort(EnumSet<sort> set, List<Task03_Country> list) {
		if (set.contains(sort.NAME) && set.contains(sort.POPULATION)
				&& set.contains(sort.AREA)) {
			Collections.sort(list);
		} else if (set.contains(sort.NAME)) {
			list.sort(new Comparator<Task03_Country>() {

				@Override
				public int compare(Task03_Country o1, Task03_Country o2) {
					return o1.name.compareTo(o2.name);
				}
			});
		} else if (set.contains(sort.POPULATION)) {
			list.sort(new Comparator<Task03_Country>() {

				@Override
				public int compare(Task03_Country o1, Task03_Country o2) {
					return o1.population.compareTo(o2.population);
				}
			});
		} else if (set.contains(sort.AREA)) {
			list.sort(new Comparator<Task03_Country>() {

				@Override
				public int compare(Task03_Country o1, Task03_Country o2) {
					return o1.area.compareTo(o2.area);
				}
			});
		}
	}
	
	public String toString() {
		return name + ", population: " + population + ", area: " + area;
	}
	

	public static void main(String[] args) {
		
		Task03_Country c1 = new Task03_Country("Bosna", 10, 1);
		Task03_Country c2 = new Task03_Country("Hrvatska", 15, 2);
		Task03_Country c3 = new Task03_Country("Srbija", 20, 3);
		Task03_Country c4 = new Task03_Country("Makedonija", 5, 4);
		Task03_Country c5 = new Task03_Country("Slovenija", 3, 6);
		
		ArrayList<Task03_Country> list = new ArrayList<Task03_Country>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		
		EnumSet<sort> set = EnumSet.of(sort.NAME, sort.POPULATION, sort.AREA);
		
		Task03_Country.sort(set, list);
		
		for (Task03_Country country : list) {
			System.out.println(country);
		}
		
	}

	@Override
	public int compareTo(Task03_Country o) {
		if (!this.name.equals(o.name)) {
			return this.name.compareTo(o.name);			
		} else if (this.area != o.area) {
			return this.area.compareTo(o.area);			
		} else {
			return this.population.compareTo(o.population);
		}
	}

}
