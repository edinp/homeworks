package ba.bitcamp.homework06.task02;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task02 extends JFrame {

	private String text = "Edin";
	private JLabel label = new JLabel(text);
	private JPanel panel = new JPanel();
	private JButton button = new JButton("OK");
	private JCheckBox box1 = new JCheckBox("Bold");
	private JCheckBox box2 = new JCheckBox("Italic");
	private Font f1 = new Font(Font.MONOSPACED, Font.BOLD, 20);
	private Font f2 = new Font(Font.MONOSPACED, Font.ITALIC, 20);
	private Font f3 = new Font(Font.MONOSPACED, Font.PLAIN, 20);
	private Font f4 = new Font(Font.MONOSPACED, Font.BOLD | Font.ITALIC, 20);
	
	public Task02() {
		add(panel);
		panel.setLayout(new GridLayout(4,1));
		panel.add(label);
		panel.add(box1);
		panel.add(box2);
		panel.add(button);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(f3);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					if (box1.isSelected() && box2.isSelected()) {
						label.setFont(f4);
					} 
					else if(box2.isSelected()) {
						label.setFont(f2);
					} 
					else if(box1.isSelected()) {
						label.setFont(f1);
					}
					else
						label.setFont(f3);
				}
				
			}
		});
		
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Task02();

	}

}
