package ba.bitcamp.homework18.task01;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class ViewComplains extends JFrame {

	private static final long serialVersionUID = -3746179192521483602L;
	SQLConn connection = null;
	Statement statement = null;
	ResultSet result = null;
	ArrayList<Complain> complains;

	private JTextArea area = new JTextArea(17, 22);
	private JPanel panel = new JPanel();
	private JScrollPane pane = new JScrollPane(area);

	public ViewComplains(SQLConn connection) {
		
		this.connection = connection;
		
		add(panel);
		panel.add(pane);
		pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		area.setWrapStyleWord(true);
		area.setLineWrap(true);
		area.setEditable(false);

		printComplains(allComplains());

		setSize(300, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	/*
	 * This method returns all complains from database and puts them to
	 * arraylist as objects "Complain". So we can manipulate them as Objects,
	 * and print them.
	 */
	private ArrayList<Complain> allComplains() {
		complains = new ArrayList<Complain>();
		try {
			statement = connection.getConn().createStatement();
			String query = "select * from complain";
			result = statement.executeQuery(query);

			while (result.next()) {
				Integer id = result.getInt(1);
				String name = result.getString(2);
				String text = result.getString(3);
				String date = result.getString(4);
				String time = result.getString(5);
				Complain c = new Complain(id, name, text, date, time);
				complains.add(c);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return complains;
	}

	/*
	 * This method takes all objects "Complain" from ArrayList and prints them
	 * as Strings on JTextArea.
	 */
	private void printComplains(ArrayList<Complain> complains) {
		//while (true) {
			for (Complain c : complains) {
				area.append(c.toString() + "\n");
			}
		//}
	}

}
