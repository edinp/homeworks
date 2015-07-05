package ba.bitcamp.homework06.task07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task07 extends JFrame {

	private int x;
	private int y;
	private int a = 10;
	private Panel panel = new Panel();
	private Color color = Color.WHITE;
	private JPanel panel1 = new JPanel();
	private JSlider slider = new JSlider(10, 300, 10);
	
	public Task07() {
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.SOUTH);
		panel1.add(slider);
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				if(e.getSource() == slider) {
					a = slider.getValue();
					repaint();
				}
				
			}
		});
		add(panel, BorderLayout.CENTER);
		panel.setBackground(color);
		
		panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getSource() == panel) {
					x = e.getX()-a/2;
					y = e.getY()-a/2;
					color = Color.BLACK;
					panel.repaint();
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
		
				
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private class Panel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(color);
			g.drawOval(x, y, a, a);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Task07();
	}

}
