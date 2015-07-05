package ba.bitcamp.homework06.task06;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Task06 extends JFrame {

	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private JTextField field = new JTextField();
	private JButton button = new JButton("Start");
	private int num;
	private Timer timer;
	
	public Task06() {
		add(panel);
		panel.setLayout(new GridLayout(3, 1));
		panel.add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(field);
		panel.add(button);

		timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				num = Integer.parseInt(label.getText());
				num--;
				label.setText(Integer.toString(num));
				if (num == 0) {
					timer.stop();
					JOptionPane.showMessageDialog(null, "Good Night !!");
				}
			}
		});

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					if (field.getText() != null) {
						label.setText(field.getText());
						timer.start();
					} 
				}
			}
		});

		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task06();
	}
}
