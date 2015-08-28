package ba.bitcamp.homework18.task01;

public class Complain {
	
	private Integer id;
	private String name;
	private String text;
	private String date;
	private String time;
	
	/*
	 * Constructor for object Complain.
	 * Id is unique number from database.
	 * String name is entered name through form for adding complains.
	 * String text is entered complain text through form for adding complains.
	 * String date is value taken from Calendar class.
	 * String time is value taken from Calendar class.
	 */
	public Complain(Integer id, String name, String text, String date, String time) {
		this.id = id;
		this.name = name;
		this.text = text;
		this.date = date;
		this.time = time;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}
	
	public String toString() {
		return id + ". " + name + " (" + time + ", " + date + ")\n" + text + "\n---------------";
	}

}
