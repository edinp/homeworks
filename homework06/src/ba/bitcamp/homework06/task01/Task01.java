package ba.bitcamp.homework06.task01;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task01 extends JFrame {

	private JSlider slider = new JSlider(10,100,50);
	private int fontSize = 10;
	private String text = "Edin";
	private JLabel label = new JLabel(text);
	private JPanel panel = new JPanel();
	
	public Task01() {
		
		add(panel);
		panel.setLayout(new GridLayout(2,1));
		slider.setMajorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		panel.add(label);
		label.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 50));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(slider);

		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				fontSize = slider.getValue();
				label.setFont(new Font(Font.MONOSPACED, Font.PLAIN, fontSize));
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task01();

	}

}
