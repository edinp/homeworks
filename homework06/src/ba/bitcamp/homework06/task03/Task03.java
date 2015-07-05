package ba.bitcamp.homework06.task03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Task03 extends JFrame {

	private JTextField name = new JTextField(10);
	private JPasswordField pass = new JPasswordField(10);
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Name: ");
	private JLabel label2 = new JLabel("Password: ");
	
	public Task03() {
		add(panel);
		setTitle("Login");
		panel.setLayout(new GridLayout(2,2,5,5));
		panel.add(label);
		panel.add(name);
		panel.add(label2);
		panel.add(pass);
		
		pass.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String correct = "1234";
				String given = String.valueOf(pass.getPassword());
				if (!correct.equals(given)) {
					JOptionPane.showMessageDialog(null, "Wrong Password!");
				}
				else
					System.exit(0);
				
			}
		});
		
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Task03();

	}

}
