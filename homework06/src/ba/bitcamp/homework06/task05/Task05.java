package ba.bitcamp.homework06.task05;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task05 extends JFrame {

	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JSlider red = new JSlider(0,255,255);
	private JSlider green = new JSlider(0,255,255);
	private JSlider blue = new JSlider(0,255,255);
	private int colorRed = 255;
	private int colorGreen = 255;
	private int colorBlue = 255;
	
	public Task05() {
		setLayout(new GridLayout(2,1));
		add(panel1);
		add(panel2);
		panel1.setBorder(BorderFactory.createTitledBorder("Preview"));
		panel2.setBorder(BorderFactory.createTitledBorder("Change colors"));
		panel2.setLayout(new GridLayout(3,1));
		panel2.add(red);
		panel2.add(green);
		panel2.add(blue);
		red.addChangeListener(new Change());
		green.addChangeListener(new Change());
		blue.addChangeListener(new Change());
		panel1.setBackground(new Color(colorRed, colorGreen, colorBlue));
		
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Change implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if (e.getSource() == red) {
				colorRed = red.getValue();
				panel1.setBackground(new Color(colorRed, colorGreen, colorBlue));
			}
			if (e.getSource() == green) {
				colorGreen = green.getValue();
				panel1.setBackground(new Color(colorRed, colorGreen, colorBlue));
			}
			if (e.getSource() == blue) {
				colorBlue = blue.getValue();
				panel1.setBackground(new Color(colorRed, colorGreen, colorBlue));
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Task05();
	}

}
