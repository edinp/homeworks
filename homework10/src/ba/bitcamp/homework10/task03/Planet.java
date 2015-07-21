package ba.bitcamp.homework10.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Planet implements Comparable<Planet> {
	
	private String name;
	private Integer diameter;
	private Double mass;
	private Integer distance;
	
	public Planet(String name, Integer diameter, Double mass, Integer distance) {
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.distance = distance;
	}
	
	public static void sortByDiameter(Planet[] planets){
		Arrays.sort(planets, new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return o1.diameter.compareTo(o2.diameter);
			}
		});
	}
	
	public static void sortByMass(Planet[] planets) {
		Arrays.sort(planets, new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return o1.mass.compareTo(o2.mass);
			}
		});
	}
	
	public static void sortByDistance(Planet[] planets) {
		Arrays.sort(planets, new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return o1.distance.compareTo(o2.distance);
			}
		});
	}
	
	public String toString() {
		return name + ", diameter: " + diameter + ", mass: " + mass + ", distance: " + distance;
	}
	
	@Override
	public int compareTo(Planet o) {
		return this.name.compareTo(o.name);
	}

	
	
	public static void main(String[] args) {
		Planet p1 = new Planet("Earth", 4, 0.0, 1);
		Planet p2 = new Planet("Pluton", 3, 2.2, 2);
		
		/*
		 * SORTIRANJE PREKO ARRAYLIST
		 */
		ArrayList<Planet> planets1 = new ArrayList<>();
		planets1.add(p2);
		planets1.add(p1);
		
		planets1.sort(new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		for (Planet planet : planets1) {
			System.out.println(planet);
		}
		
		
		/*
		 * SORTIRANJE PREKO ARRAYS
		 */
		Planet[] planets = new Planet[] {p2,p1};
		Arrays.sort(planets);

		for (Planet planet : planets) {
			System.out.println(planet);
		}
		
		System.out.println();
		
		Planet.sortByMass(planets);
		Planet.sortByDistance(planets);
		Planet.sortByDiameter(planets);
		
		for (Planet planet : planets) {
			System.out.println(planet);
		}

	}


}
