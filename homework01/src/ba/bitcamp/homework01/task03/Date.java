package ba.bitcamp.homework01.task03;

public class Date {
	
	private Integer day;
	private Integer month;
	private Integer year;
	
	public String toString() {
		String s = day + "." + month + "." + year + ".";
		return s;
	}
	
	public Date(Integer day) {
		this(day, 1, 1);		
	}
	
	public Date(Integer day, Integer month) {
		this(day, month, 1);
	}
	
	public Date(Integer day, Integer month, Integer year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(Integer day) {
		if (day > 0 && day < 32) {
			this.day = day;
			System.out.println(this);
		} else
			System.out.println("Number must be between 1 and 31.");
	}
	
	public void setMonth(Integer month) {
		if (month > 0 && month < 13) {
			this.month = month;
			System.out.println(this);
		} else
			System.out.println("Number must be between 1 and 12.");
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public void dayPassed() {
		day+=1;
		if (day == 32) {
			day = 1;
			month+=1;
			if (month == 13) {
				month = 1;
				year+=1;
			}
		}
		System.out.println(this);
	}
	
	public void monthPassed() {
		month+=1;
		if (month == 13) {
			month = 1;
			year+=1;
		}
		System.out.println(this);
	}

}
