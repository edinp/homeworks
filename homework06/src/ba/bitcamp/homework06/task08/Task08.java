package ba.bitcamp.homework06.task08;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Task08 extends JFrame {

	private static final long serialVersionUID = -4529730576509628431L;
	private final int WIDTH = 200;
	private final int HEIGHT = 300;
	private JTextField name = new JTextField("Username", 12);
	private JPasswordField pass1 = new JPasswordField("sarajevo", 12);
	private JPasswordField pass2 = new JPasswordField("sarajevo", 12);
	private JButton clear = new JButton("Clear");
	private JButton submit = new JButton("Submit");
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JCheckBox box = new JCheckBox("I Accept");

	public Task08() {
		super("Register");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(panel1);
		add(panel2);

		panel1.setBorder(BorderFactory.createTitledBorder("Text Fields"));
		panel2.setBorder(BorderFactory.createTitledBorder("Buttons"));

		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));

		panel1.setPreferredSize(new Dimension(200, 200));
		panel2.setPreferredSize(new Dimension(200, 100));

		panel1.add(new JLabel("Username: "));
		panel1.add(name);
		panel1.add(new JLabel("Password: "));
		panel1.add(pass1);
		panel1.add(new JLabel("Repeat Password: "));
		panel1.add(pass2);
		panel1.add(box);

		panel2.add(clear);
		panel2.add(submit);


		clear.addActionListener(new Action());
		submit.addActionListener(new Action());
		name.addActionListener(new Action());
		box.addActionListener(new Action());
		submit.setEnabled(false);

		pass1.setForeground(Color.GRAY);
		pass2.setForeground(Color.GRAY);

		name.addFocusListener(new Focus());
		pass1.addFocusListener(new Focus());
		pass2.addFocusListener(new Focus());

		name.setToolTipText("Ime treba imati minimalno 6 karaktera");
		pass1.setToolTipText("Pass treba imati minimalno 6 karaktera, od cega barem jedan broj");

		setResizable(false);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class Focus implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			if (e.getSource() == name && name.getText().equals("Username")) {
				name.setText("");
				name.setForeground(Color.BLACK);
				name.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
			}
			if (e.getSource() == pass1) {
				pass1.setText("");
				pass1.setForeground(Color.BLACK);
			}
			if (e.getSource() == pass2) {
				pass2.setText("");
				pass2.setForeground(Color.BLACK);
			}

		}

		@Override
		public void focusLost(FocusEvent e) {
			if (e.getSource() == name && name.getText().equals("")) {
				name.setText("Username");
				name.setForeground(Color.GRAY);
				name.setFont(new Font(Font.DIALOG, Font.ITALIC, 12));
			}
			if (e.getSource() == pass1 && pass1.getPassword().length > 0) {
				pass1.setForeground(Color.GRAY);
			}
			if (e.getSource() == pass2) {
				pass2.setForeground(Color.GRAY);
			}

		}

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String p1 = String.valueOf(pass1.getPassword());
			String p2 = String.valueOf(pass2.getPassword());
			String n1 = String.valueOf(name.getText());
			char[] numbers = new char[] { '1', '2', '3', '4', '5', '6', '7',
					'8', '9', '0' };
			char[] characters = new char[p1.length()];
			int count = 0;

			for (int i = 0; i < characters.length; i++) {
				characters[i] = p1.charAt(i);
			}

			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < characters.length; j++) {
					if (numbers[i] == characters[j]) {
						count++;
					}
				}
			}

			if (e.getSource() == box) {
				submit.setEnabled(box.isSelected());
			}

			if (e.getSource() == clear) {
				name.setText("");
				pass1.setText("");
				pass2.setText("");
			}
			if (e.getSource() == submit) {
				if (p1.equals(p2) && p1.length() > 5 && n1.length() > 5
						&& count > 0) {
					JOptionPane
							.showMessageDialog(null, "Uspjesna registracija");
					System.exit(0);
				} else if (!p1.equals(p2) && p1.length() <= 5
						&& n1.length() <= 5) {
					JOptionPane.showMessageDialog(null, "Nista ba ne valja");
				} else if (!p1.equals(p2)) {
					JOptionPane.showMessageDialog(null,
							"Greska, razliciti passwordi");
				} else if (n1.length() <= 5 && p1.length() <= 5) {
					JOptionPane.showMessageDialog(null,
							"Prekratko i ime i passoword");
				} else if (n1.length() <= 5) {
					JOptionPane.showMessageDialog(null, "Prekratko ime");
				} else if (p1.length() <= 5) {
					JOptionPane.showMessageDialog(null, "Prekratak passoword");
				} else if (count == 0) {
					JOptionPane.showMessageDialog(null,
							"Ubaci koji broj u pass");
				}
			}
		}

	}

	public static void main(String[] args) {
		new Task08();
	}

}
