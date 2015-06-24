package ba.bitcamp.homework03.task01; 

import java.awt.GridLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  

import javax.swing.JButton;  
import javax.swing.JFrame; 


public class Task01 extends JFrame { 
 	 
	private JButton[] buttons = new JButton[9]; 
	 
	String text = "X"; 
	 
	public Task01() { 
		 
		setVisible(true); 
		setTitle("Tic Tac Toe"); 
		setSize(400, 400); 
		setLayout(new GridLayout(3,3)); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		 
		for(int i = 0; i < buttons.length; i++) { 
			buttons[i] = new JButton(); 
			add(buttons[i]); 
			buttons[i].addActionListener(new Action(buttons[i])); 
		} 
	}

	public class Action implements ActionListener { 
		 
		JButton button; 
		 
		public Action(JButton button) { 
			this.button = button; 
		}
		
		@Override 
		public void actionPerformed(ActionEvent e) { 
			button.setText(text); 
			if (text.equals("X")) { 
				text = "0"; 
			} else { 
				text = "X"; 
			}
		}
	}
	
	
	public static void main(String[] args) { 
		new Task01(); 
	}
}