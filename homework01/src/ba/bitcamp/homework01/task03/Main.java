package ba.bitcamp.homework01.task03;

public class Main {
	
	public static void main(String[] args) {
		Date d1 = new Date(1);
		System.out.println(d1);
		d1.dayPassed();
		d1.monthPassed();
		d1.setMonth(12);
		d1.monthPassed();
		d1.setDay(31);
		d1.dayPassed();
		d1.setDay(31);
		d1.setMonth(12);
		d1.dayPassed();
	}
	
	

}
