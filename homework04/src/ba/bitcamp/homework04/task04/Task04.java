package ba.bitcamp.homework04.task04;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Task04 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	char[] alphabet = new char[] {'a','b','c','d','e','f',
			'g','h','i','j','k','l','m','n','o','p','q','r',
			's','t','u','v','w','x','y','z'};
	
	
	
	char[] label = new char[] {'_'};
	
	public static String generateLabel(char[] label) {
		String str = "";
		for (int i = 0; i < label.length; i++) {
			str += label[i];
		}
		return str;
	}
	
	
	private JButton b1 = new JButton("<");
	private JButton b2 = new JButton(">");
	private JButton b3 = new JButton("Insert");
	private JButton b4 = new JButton("Char: " + generate(alphabet));
	private JLabel l1 = new JLabel(generateLabel(label));
	
	
	
	public Task04 () {
		setVisible(true);
		setLayout(new BorderLayout());
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Action listen = new Action();
		
		add(b1, BorderLayout.WEST);
		add(b2, BorderLayout.EAST);
		add(b3, BorderLayout.SOUTH);
		add(b4, BorderLayout.NORTH);
		add(l1, BorderLayout.CENTER);
		l1.setHorizontalAlignment(JLabel.CENTER);
		
		b4.addActionListener(listen);
		b3.addActionListener(listen);
		b2.addActionListener(listen);
		b1.addActionListener(listen);
		
		
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b4) {
				b4.setText("Char: " + generate(alphabet));
			}
			if(e.getSource() == b3) {
				char[] temp = new char[label.length + 1];
				for (int i = 0; i < label.length; i++) {
					temp[i] = label[i];
				}
				temp[temp.length-1] = b4.getText().charAt(6);
				label = temp;
				l1.setText(generateLabel(label));
			}
			if(e.getSource() == b2) {
				int num = generateLabel(label).indexOf('_');
				if (label.length > num+1) {
					label[num] = label[num+1];
					label[num+1] = '_';
					l1.setText(generateLabel(label));
				} else if (label.length-1 == num) {
					for (int i = 0; i < label.length-1; i++) {
						label[i+1] = label[i];
					}
					label[0] = '_';
					l1.setText(generateLabel(label));
				}
			}
			if(e.getSource() == b1) {
				int num = generateLabel(label).indexOf('_');
				if (num > 0) {
					label[num] = label[num-1];
					label[num-1] = '_';
					l1.setText(generateLabel(label));
				} else if (num == 0) {
					for (int i = 1; i < label.length; i++) {
						label[i-1] = label[i];
					}
					label[label.length-1] = '_';
					l1.setText(generateLabel(label));
				}
			}
			}
		
	}
	
	public static char generate(char[] alphabet) {
		return alphabet[(int)(Math.random()*alphabet.length)];
	}
	

	public static void main(String[] args) {
		new Task04();

	}
}