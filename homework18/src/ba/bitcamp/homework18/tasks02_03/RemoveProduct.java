package ba.bitcamp.homework18.tasks02_03;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class RemoveProduct extends JFrame {
	
	SQLConn connection = null;
	Statement statement = null;
	ResultSet result = null;
	
	private JComboBox<String> list = new JComboBox<>();
	private JPanel panel = new JPanel();
	private JButton button = new JButton("Remove");
	
	/*
	 * Constructor of GUI for Removing Products.
	 */
	public RemoveProduct() {
		
		connection = new SQLConn();
		
		add(panel);
		panel.add(list);
		panel.add(button);
		list.setPreferredSize(new Dimension(150, 20));
		
		addToCombo();
		
		button.addActionListener(new Action());
		
		setSize(190, 90);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
	
	/*
	 * Action Listener for button remove.
	 * It activates removeItem(String) method.
	 */
	class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				removeItem((String)list.getSelectedItem());
			}
			
		}
		
	}
	
	/*
	 * This method adds product names from database to combo list.
	 */
	private void addToCombo() {
		try {
			statement = connection.getConnection().createStatement();
			String query = "select name from product";
			result = statement.executeQuery(query);
			while(result.next()) {
				list.addItem(result.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * This method removes selected items from database.
	 */
	private void removeItem(String name) {
		try {
			statement = connection.getConnection().createStatement();
			String update = "delete from product where name = '" + name + "'";
			System.out.println(update);
			statement.executeUpdate(update);
			for (int i = 0; i < list.getItemCount(); i++) {
				if (list.getItemAt(i).equals(name)) {
					list.removeItemAt(i);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
