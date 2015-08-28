package ba.bitcamp.homework18.task01;

public class Main {
	
	public static void main(String[] args) {

		SQLConn connection = new SQLConn();
		new AddComplain(connection);
		
	}
}
