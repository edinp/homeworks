package ba.bitcamp.homework18.tasks02_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConn {
	
	Connection connection = null;
	
	/*
	 * Constructor for SQL Connection to our database.
	 */
	public SQLConn() {
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:products.db");
			System.out.println("Connected to database: products.db");
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found.");
			System.exit(1);
		} catch (SQLException e) {
			System.err.println("Missing database");
			System.exit(1);
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	
	

}
