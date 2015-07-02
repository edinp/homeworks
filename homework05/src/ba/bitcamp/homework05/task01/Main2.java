package ba.bitcamp.homework05.task01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main2 extends JFrame {
	
	private static final long serialVersionUID = -7780524558343878742L;
	private final int LENGTH = 10;
	private JLabel[][] field = new JLabel[LENGTH][LENGTH];
	private String star = "*";
	private String plus = "+";
	private int x = 0;
	private int y = 0;
	
	public Main2() {
		addKeyListener(new Key());
		setLayout(new GridLayout(LENGTH, LENGTH));
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = new JLabel(star);
				add(field[i][j]);
				field[i][j].setHorizontalAlignment(JLabel.CENTER);
			}
		}
		field[0][0].setText(plus);
		setSize(200,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
//			if (e.getKeyCode() == KeyEvent.VK_RIGHT && y<(LENGTH-1)) {
//				field[x][y+1].setText(plus);
//				field[x][y].setText(star);
//			}
//			if (e.getKeyCode() == KeyEvent.VK_LEFT && y>0) {
//				field[x][y-1].setText(plus);
//				field[x][y].setText(star);
//			}
//			if (e.getKeyCode() == KeyEvent.VK_UP && x>0) {
//				field[x-1][y].setText(plus);
//				field[x][y].setText(star);
//			}
//			if (e.getKeyCode() == KeyEvent.VK_DOWN && x<(LENGTH-1)) {
//				field[x+1][y].setText(plus);
//				field[x][y].setText(star);
//			}
			
			
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					if (e.getKeyCode() == KeyEvent.VK_RIGHT && field[i][j].getText().equals(plus) && j<(LENGTH-1)) {
						field[i][j+1].setText(plus);
						field[i][j].setText(star);
						break;
					}
					if (e.getKeyCode() == KeyEvent.VK_LEFT && field[i][j].getText().equals(plus) && j>0) {
						field[i][j-1].setText(plus);
						field[i][j].setText(star);
						break;
					}
					if (e.getKeyCode() == KeyEvent.VK_UP && field[i][j].getText().equals(plus) && i>0) {
						field[i-1][j].setText(plus);
						field[i][j].setText(star);
						break;
					}
					if (e.getKeyCode() == KeyEvent.VK_DOWN && field[i][j].getText().equals(plus) && i<(LENGTH-1)) {
						field[i+1][j].setText(plus);
						field[i][j].setText(star);
						break;
					}
				}
			}
			
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main2();
	}

}
