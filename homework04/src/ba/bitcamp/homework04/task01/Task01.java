package ba.bitcamp.homework04.task01;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Task01 extends JFrame {
	
	private static final long serialVersionUID = -191094256336535347L;

	/*
	 * Array of 10 buttons
	 */
	private static final JButton[] BUTTONS = new JButton[10];
	private static final int MAX_CLICKS = 3;
	
	int count = 0;
	String str = "";
	
	/*
	 * Constructor for this JFrame, with GridLayout, and 10 buttons
	 */
	public Task01() {
	
		setVisible(true);
		setSize(150, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(10,1));
		Action listen = new Action();
		for (int i = 0; i < 10; i++) {
			BUTTONS[i] = new JButton("" + i);
			add(BUTTONS[i]);
			BUTTONS[i].addActionListener(listen);
		}
		
	}
	
	/*
	 * 
	 */
	public class Action implements ActionListener{

		
		/*
		 * When you press three buttons, you get message dialog
		 * with numbers on these buttons.
		 * (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			
			for (int i = 0; i < BUTTONS.length; i++) {
				if (count < MAX_CLICKS && e.getSource() == BUTTONS[i]) {
					BUTTONS[i].setEnabled(false);
					str+=BUTTONS[i].getText();
					count++;
				}
				if (count == MAX_CLICKS){
					JOptionPane.showMessageDialog(null, "Number is: " + str);
					System.exit(0);
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		new Task01();

	}

}
