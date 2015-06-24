package ba.bitcamp.homework01.task02;

public class Book {
	
	public static final Integer ONE = 1;
	public static final Integer TWO = 2;
	public static final Integer THREE = 3;
	public static final Integer NOT_AVAILABLE = 4;
	
	private String title;
	private Integer price;
	private Integer available;
	private Author author;
	
	public Book(Author author, String title, Integer price, Integer available) {
		this.title = title;
		this.price = price;
		this.available = available;
		this.author = author;
	}
	
	public String getTitle(){
		return title;
	}
	public Integer getPrice(){
		return price;
	}
	public Integer getAvailability(){
		return available;
	}
	public Author getAuthor(){
		return author;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setPrice(Integer price){
		this.price = price;
	}
	public void setAvailability(Integer available){
		this.available = available;
	}
	public void setAuthor(Author author){
		this.author = author;
	}
	
	
	/**
	 * Generated equals method.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (available == null) {
			if (other.available != null)
				return false;
		} else if (!available.equals(other.available))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
	
	/*
	 * My EQUALS method, that might work
	 */
//	public boolean equals(Object a){
//		if (this == a) {
//			return true;
//		}
//		if (a == null) {
//			return false;
//		}
//		if (getClass() != a.getClass()) {
//			return false;
//		}
//		Book book = (Book) a;
//		if (!title.equals(book.title)) {
//			return false;
//		} else if (!price.equals(book.price)) {
//			return false;
//		} else if (!author.equals(book.author)) {
//			return false;
//		} else if (!available.equals(book.available)) {
//			return false;
//		} 
//		return true;
//	}
	
	
	/**
	 * Transforms Book to String
	 */
	public String toString(){
		String s = title + price + available + author;
		return s;
	}
	

}
