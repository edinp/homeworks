package ba.bitcamp.homework04.task02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Randomise first and last name, clicking on left and right buttons
 */
public class Task02 extends JFrame {

	private static final long serialVersionUID = -246335548710419729L;
	private JButton b1 = new JButton("First name");
	private JButton b2 = new JButton("Last name");
	private JLabel label = new JLabel("ime i prezime");
	
	/*
	 * Constructor for this JFrame, with BorderLayout
	 * 
	 */
	public Task02(){
		setLayout(new BorderLayout());
		setVisible(true);
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Action listen = new Action();
		
		add(b1, BorderLayout.WEST);
		add(b2, BorderLayout.EAST);
		add(label, BorderLayout.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		b1.addActionListener(listen);
		b2.addActionListener(listen);
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				label.setText(generateName(Names.getNames()) + " " + LastNames.LASTNAMES[0]);
			}
			if (e.getSource() == b2) {
				label.setText(Names.NAMES[0] + " " + generateName(LastNames.getLastNames()));
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		new Task02();

	}
	
	/*
	 * Class as structure of random names
	 */
	private static class Names {
		private static String[] NAMES = new String[] {
			"edin",
			"azra",
			"omar",
			"emir",
			"mersiha",
			"aida",
			"leila",
			"ella",
			"fahrudin",
			"lutvo",
			"rabija"
		};
		
		public static String[] getNames() {
			return NAMES;
		}
	}
	
	/*
	 * Class as structure of random last names
	 */
	private static class LastNames {
		private static String[] LASTNAMES = new String[] {
				"pilavdzic",
				"kapetanovic",
				"somun",
				"haskovic",
				"bogicevic",
				"radanovic",
				"silajdzic",
				"stepanov",
				"berberovic"
		};
		
		public static String[] getLastNames() {
			return LASTNAMES;
		}
		
		public void generateName() {
			LASTNAMES[(int)(Math.random()*LASTNAMES.length)].toString();
		}
		
	}
	
	/*
	 * Generates random strings from String arrays.
	 */
	public static String generateName(String[] names) {
		return names[(int)(Math.random()*names.length)];
	}

}
