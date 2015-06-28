package ba.bitcamp.homework04.task01;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Task01 extends JFrame {
	
	private static final long serialVersionUID = -191094256336535347L;

	private JButton[] buttons = new JButton[10];
	
	int count = 0;
	String str = "";
	public Task01() {
	
		setVisible(true);
		setSize(150, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(10,1));
		Action listen = new Action();
		for (int i = 0; i < 10; i++) {
			buttons[i] = new JButton("" + i);
			add(buttons[i]);
			buttons[i].addActionListener(listen);
		}
		
	}
	
	public class Action implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			for (int i = 0; i < buttons.length; i++) {
				if (count < 3 && e.getSource() == buttons[i]) {
					buttons[i].setEnabled(false);
					str+=buttons[i].getText();
					count++;
				}
				if (count == 3){
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
