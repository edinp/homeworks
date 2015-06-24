package ba.bitcamp.homework01.task02;

import java.util.Arrays;

public class BookStore {
	
	private String name;
	private Book[] books;
	
	/**
	 * Constructor for BookStore
	 * @param name - of BookStore
	 * @param books - array of Books in BookStore
	 */
	public BookStore(String name, Book[] books) {
		this.name = name;
		this.books = books;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	/**
	 * Increases the capacity of Book Store
	 * Creates longer array of Books.
	 * @param a - number that increases the capacity
	 */
	public void addBooks (Integer a) {
		Book[] addBooks = new Book[books.length + a];
		for (int i = 0; i < books.length; i++){
			addBooks[i] = books[i];
		}
		books = addBooks;
	}
	
	/**
	 * If there is free space in Book Store, adds new Books.
	 * @param a - Book to be added to Book Store.
	 */
	public void addBook(Book a) {
		int count = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				count++;
			}
		}
		if (count > 0) {
			for (int i = 0; i < books.length; i++) {
				if (books[i] == null) {
					books[i] = a;
					System.out.println("Book '" + a.getTitle() + "' added to Book Store.");
					break;
				} 
			}
		} else {
			System.out.println("No more space in Book Store.");
		}
	}
	
	/**
	 * If there is wanted Book, removes it from Book Store
	 * @param a - wanted Book
	 */
	public void sellBook (Book a) {
		int count = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i].equals(a)) {
				count++;
			}
		}
		if (count > 0) {
			for (int i = 0; i < books.length; i++) {
				if (books[i].equals(a)) {
					System.out.println("Book '" + books[i].getTitle() + "' sold!");
					books[i] = null;
					break;
				}
			}
		} else {
			System.out.println("Sorry, Book Store don't have that title.");
		}
	}
	
	/**
	 * Prints information about all books in Book Store
	 */
	public void printBooksInStore() {
		System.out.println("All titles in this Book Store are: ");
		for (int i = 0; i < books.length; i ++) {
			if (books[i] != null) {
				System.out.println("- '" + books[i].getTitle() + "'" 
					+ ", from author " + books[i].getAuthor().getName());
			} else {
				System.out.println("<empty space in bookstore>");
			}
		}
	}
	
	/**
	 * Prints all book titles from wanted author.
	 * @param a - wanted author.
	 */
	public void printBooksFromAuthor(Author a) {
		int count = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthor().equals(a)) {
				count++;
			}
		}
		if (count > 0) {
			for (int i = 0; i < books.length; i++) {
				if (books[i].getAuthor().equals(a)) {
					System.out.println(books[i].getTitle());
				}
			}
		} else
			System.out.println("Book Store don't have any title from that author.");
	}
}
