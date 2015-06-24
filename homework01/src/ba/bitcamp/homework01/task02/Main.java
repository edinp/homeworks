package ba.bitcamp.homework01.task02;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Author a1 = new Author("Kemo", "kemica@bitcamp.ba", "male");
		Author a2 = new Author("Edin", "edin.pilavdzic@bitcamp.ba", "male");
		
		Book b1 = new Book(a1, "Kuda", 120, Book.ONE);
		Book b2 = new Book(a1, "Sta", 50, Book.THREE);
		Book b3 = new Book(a1, "Zasto", 30, Book.TWO);
		Book b4 = new Book(a1, "Hajde", 15, Book.THREE);
		
		Book[] books = new Book[] {b1, b2};
		
		BookStore bs = new BookStore("Sahinpasic", books);
		
		bs.addBooks(3);
		
		bs.addBook(b4);
		bs.addBook(b4);
		bs.addBook(b4);
		
		bs.addBook(b3); // prints no more space in bookstore
		
		bs.printBooksInStore();
		
		bs.sellBook(b3); // prints bookstore don't have that title
		
		bs.printBooksInStore();
		
		bs.printBooksFromAuthor(a2);
		

	}

}
