package ba.bitcamp.homework18.tasks02_03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddProducts extends JFrame {
	
	private static final long serialVersionUID = -2784296030838209059L;
	SQLConn connection = null;
	Statement statement = null;
	ResultSet result = null;
	
	private JTextField idField = new JTextField(15);
	private JTextField nameField = new JTextField(15);
	private JTextField priceField = new JTextField(15);
	private JLabel idLabel = new JLabel("ID");
	private JLabel nameLabel = new JLabel("NAME");
	private JLabel priceLabel = new JLabel("PRICE");
	private JPanel panel = new JPanel();
	private JButton button = new JButton("ADD");
	private JButton remove = new JButton("Remove Products GUI");
	
	/*
	 * Constructor of GUI for adding new products to database.
	 */
	public AddProducts() {
		
		connection = new SQLConn();
		try {
			statement = connection.getConnection().createStatement();
			String create = "create table IF NOT EXISTS product (id varchar(10) primary key, name varchar(20), price varchar(8))";
			statement.executeUpdate(create);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		add(panel);
		panel.add(idLabel);
		panel.add(idField);
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(priceLabel);
		panel.add(priceField);
		panel.add(button);
		panel.add(remove);

		
		button.addActionListener(new Action());
		remove.addActionListener(new Action());
		
		setSize(190, 240);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		
	}
	
	/*
	 * ActionListener for two buttons:
	 * 1. button ADD
	 * 2. button REMOVE, which onclick opens new GUI for removing items
	 * from database.
	 */
	class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				addToDatabase();
			} else if (e.getSource() == remove) {
				new RemoveProduct();
			}
			
		}
		
	}
	
	/*
	 * Method for adding new products to database.
	 * It takes values from input fields, and puts them
	 * together to database.
	 */
	public void addToDatabase() {
		String id = idField.getText();
		if (checkId(id)) {
			String name = nameField.getText();
			if (checkName(name)) {
				JOptionPane pane = new JOptionPane();
				pane.showMessageDialog(null, "Vec postoji u bazi artikal sa tim imenom.");
			} else {
				String price = priceField.getText();
				String insert = "insert into product values('" + id + "', '" + name + "', '" + price + "')";
				System.out.println(insert);
				try {
					statement.executeUpdate(insert);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				nameField.setText("");
				priceField.setText("");
			}
		} else {
			JOptionPane pane = new JOptionPane();
			pane.showMessageDialog(null, "Ne vaja ti ID");
		}
	}
	
	/*
	 * Because we manually input id number, this method
	 * checks if there is already product in database with
	 * entered id number.
	 */
	public boolean checkId(String id) {
		if (id.length() != 10) {
			return false;
		}
		for (int i = 0; i < id.length(); i++) {
			if (id.charAt(i) < 48 || id.charAt(i) > 57) {
				return false;
			}
		}
		String query = "select id from product";
		try {
			result = statement.executeQuery(query);
			while(result.next()) {
				if (result.getString(1).equals(id)) {
					return false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	/*
	 * Checks if there is already product with entered
	 * name in our database.
	 */
	private boolean checkName(String name) {
		String query = "select name from product";
		try {
			result = statement.executeQuery(query);
			while(result.next()) {
				if (result.getString(1).equals(name)) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
