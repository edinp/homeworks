package ba.bitcamp.homework18.task01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConn {
	
	Connection conn = null;
	
	/*
	 * Constructor for SQL Connection to our database.
	 */
	public SQLConn() {
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:edindb.db");
			System.out.println("Connected to database");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	

}
