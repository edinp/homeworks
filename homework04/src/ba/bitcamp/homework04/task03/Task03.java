package ba.bitcamp.homework04.task03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Creates array of numbers, one from each columns,
 * by clicking buttons in Border Layout, 
 * in 2 rows and 5 columns.
 */
public class Task03 extends JFrame {

	private static final long serialVersionUID = 4917844607529053614L;
	JButton[] buttons = new JButton[10];
	String[] array = new String[5];
	
	/*
	 * Constructor for this JFrame, BorderLayout
	 */
	public Task03() {
		setVisible(true);
		setSize(400,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,5));
		
		Action listen = new Action();
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("" + i);
			add(buttons[i]);
			buttons[i].addActionListener(listen);
		}
	}
	
	/*
	 * Allows to choose only one number from each column
	 */
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttons[0]) {
				buttons[0].setEnabled(false);
				buttons[5].setEnabled(true);
				array[0] = buttons[0].getText();
			}
			if (e.getSource() == buttons[1]) {
				buttons[1].setEnabled(false);
				buttons[6].setEnabled(true);
				array[1] = buttons[1].getText();
			}
			if (e.getSource() == buttons[2]) {
				buttons[2].setEnabled(false);
				buttons[7].setEnabled(true);
				array[2] = buttons[2].getText();
			}
			if (e.getSource() == buttons[3]) {
				buttons[3].setEnabled(false);
				buttons[8].setEnabled(true);
				array[3] = buttons[3].getText();
			}
			if (e.getSource() == buttons[4]) {
				buttons[4].setEnabled(false);
				buttons[9].setEnabled(true);
				array[4] = buttons[4].getText();
			}
			if (e.getSource() == buttons[5]) {
				buttons[5].setEnabled(false);
				buttons[0].setEnabled(true);
				array[0] = buttons[5].getText();
			}
			if (e.getSource() == buttons[6]) {
				buttons[6].setEnabled(false);
				buttons[1].setEnabled(true);
				array[1] = buttons[6].getText();
			}
			if (e.getSource() == buttons[7]) {
				buttons[7].setEnabled(false);
				buttons[2].setEnabled(true);
				array[2] = buttons[7].getText();
			}
			if (e.getSource() == buttons[8]) {
				buttons[8].setEnabled(false);
				buttons[3].setEnabled(true);
				array[3] = buttons[8].getText();
			}
			if (e.getSource() == buttons[9]) {
				buttons[9].setEnabled(false);
				buttons[4].setEnabled(true);
				array[4] = buttons[9].getText();
			}
			if (e.getSource() == buttons[0] || e.getSource() == buttons[5] &&
				e.getSource() == buttons[1] || e.getSource() == buttons[6] &&
				e.getSource() == buttons[2] || e.getSource() == buttons[7] &&
				e.getSource() == buttons[3] || e.getSource() == buttons[8] &&
				e.getSource() == buttons[4] || e.getSource() == buttons[9]) {
				JOptionPane.showMessageDialog(null, Arrays.toString(array));
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new Task03();

	}

}
