package ba.bitcamp.homework18.task01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddComplain extends JFrame {
	
	private static final long serialVersionUID = 7691213307856276530L;
	private JPanel panel = new JPanel();
	private JTextField nameField = new JTextField(20);
	private JTextArea areaField = new JTextArea(10,20);
	private JLabel nameLabel = new JLabel("Your name:");
	private JLabel areaLabel = new JLabel("Your complain:");
	private JButton send = new JButton("Send complain");
	private JButton view = new JButton("View complains");
	
	SQLConn connection = null;
	Statement statement = null;
	
	/*
	 * Constructor of GUI for adding complains.
	 * There is initialized statement for creating table in database (if not exists),
	 * and there are two buttons with ActionListeners.
	 */
	public AddComplain(SQLConn connection) {
		this.connection = connection;
		
		try {
			statement = connection.getConn().createStatement();
			String createTable = "create table IF NOT EXISTS complain (id Integer primary key, name varchar(20), text varchar(255), date varchar(255), time varchar(255))";
			statement.executeUpdate(createTable);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(areaLabel);
		panel.add(areaField);
		panel.add(send);
		panel.add(view);
		areaField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		send.addActionListener(new Action());
		view.addActionListener(new Action());
		
		setSize(300, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
	
	/*
	 * This class implements ActionListener for buttons on our GUI.
	 * If button SEND is pressed, then it calls method for adding complains
	 * to database.
	 * If button VIEW is pressed, it calls for other GUI where we see
	 * all complains from database.
	 */
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == send) {
				addComplain();
			} else if (e.getSource() == view) {
				new ViewComplains(connection);
			}
		}
	}
	
	/*
	 * Method for adding complains to our database.
	 * It takes values from our input fields, and using
	 * statement puts data to database.
	 */
	private void addComplain() {
		String name = nameField.getText();
		String text = areaField.getText();
		String[] parts = Calendar.getInstance().getTime().toString().split(" ");
		String time = parts[3];
		String date = parts[2] + " " + parts[1] + " " + parts[5];
		String insert = "insert into complain values(null, '" + name + "', '" + text + "', '" + date + "', '" + time + "')";
		try {
			statement.executeUpdate(insert);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
