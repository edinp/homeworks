package ba.bitcamp.homework05.task01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	private final int WIDTHX = 600;
	private final int HEIGHTY = 600;
	private final int SIZE = 20;
	private final int STARTX = 40;
	private final int STARTY = 40;
	private int x = 300;
	private int y = 500;
	private Color background = Color.WHITE;
	private Color wall = Color.BLACK;
	private int[][] fields = new int[10][10];
	
	public Main() {
		add(new Maze());
		addKeyListener(new Key());
		setSize(800, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Maze extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillOval(x, y, SIZE, SIZE);
			g.setColor(wall);
			g.drawRect(STARTX, STARTY, WIDTHX, HEIGHTY);
			g.fillRect(STARTX+SIZE, STARTY+SIZE, SIZE, HEIGHTY-2*SIZE);
			
		}
	}
	
	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT && x>STARTX) {
				x-=SIZE;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT && x<WIDTHX+SIZE) {
				x+=SIZE;
			}
			if (e.getKeyCode() == KeyEvent.VK_UP && y>STARTY) {
				y-=SIZE;
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN && y<HEIGHTY+SIZE) {
				y+=SIZE;
			}
			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
