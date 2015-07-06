package ba.bitcamp.homework05.task01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main2 extends JFrame {
	
	private final int A = 30;
	private JLabel[][] field = new JLabel[A][A];
	private String point = ".";
	private String plus = "+";
	private String hash = "#";
	private int x = 0;
	private int y = 1;
	private Color player = Color.BLACK;
	private Color path = Color.ORANGE;
	private Color background = Color.RED;
	private long start;
	private long stop;
	private int dimensions = A*20;
	
	public Main2() {
		addKeyListener(new Key());
		setLayout(new GridLayout(A,A));
		start = System.currentTimeMillis();
		
		
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = new JLabel(point);
				field[i][j].setOpaque(true);
				add(field[i][j]);
				field[i][j].setHorizontalAlignment(JLabel.CENTER);
			}
		}
		
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j].setText(hash);
				field[i][j].setForeground(background);
			}
		}
		
		field[1][1].setText(point);
		field[2][1].setText(point);
		field[3][1].setText(point);
		field[4][1].setText(point);
		field[5][1].setText(point);
		field[6][1].setText(point);
		field[7][1].setText(point);
		field[8][1].setText(point);
		field[9][1].setText(point);
		field[10][1].setText(point);
		field[11][1].setText(point);
		field[12][1].setText(point);
		field[13][1].setText(point);
		field[14][1].setText(point);
		field[15][1].setText(point);
		field[16][1].setText(point);
		field[16][2].setText(point);
		field[16][3].setText(point);
		field[16][4].setText(point);
		field[16][5].setText(point);
		field[16][6].setText(point);
		field[16][7].setText(point);
		field[16][8].setText(point);
		field[16][9].setText(point);
		field[15][9].setText(point);
		field[14][9].setText(point);
		field[13][9].setText(point);
		field[12][9].setText(point);
		field[11][9].setText(point);
		field[10][9].setText(point);
		field[9][9].setText(point);
		field[8][9].setText(point);
		field[7][9].setText(point);
		field[7][8].setText(point);
		field[7][7].setText(point);
		field[7][6].setText(point);
		field[7][5].setText(point);
		field[7][4].setText(point);
		field[7][3].setText(point);
		field[8][5].setText(point);
		field[9][5].setText(point);
		field[10][5].setText(point);
		field[11][5].setText(point);
		field[12][5].setText(point);
		field[12][6].setText(point);
		field[12][7].setText(point);
		field[12][4].setText(point);
		field[13][5].setText(point);
		field[14][5].setText(point);
		field[17][3].setText(point);
		field[18][3].setText(point);
		field[19][3].setText(point);
		field[20][3].setText(point);
		field[21][3].setText(point);
		field[22][3].setText(point);
		field[23][3].setText(point);
		field[24][3].setText(point);
		field[25][3].setText(point);
		field[25][2].setText(point);
		field[26][2].setText(point);
		field[27][2].setText(point);
		field[27][3].setText(point);
		field[27][4].setText(point);
		field[28][4].setText(point);
		field[28][5].setText(point);
		field[28][6].setText(point);
		field[28][7].setText(point);
		field[28][8].setText(point);
		field[28][9].setText(point);
		field[28][10].setText(point);
		field[28][11].setText(point);
		field[28][12].setText(point);
		field[28][13].setText(point);
		field[28][14].setText(point);
		field[28][15].setText(point);
		field[28][16].setText(point);
		field[28][17].setText(point);
		field[28][18].setText(point);
		field[28][19].setText(point);
		field[28][20].setText(point);
		field[28][21].setText(point);
		field[28][22].setText(point);
		field[28][23].setText(point);
		field[28][24].setText(point);
		field[28][25].setText(point);
		field[27][25].setText(point);
		field[26][25].setText(point);
		field[25][25].setText(point);
		field[24][25].setText(point);
		field[23][25].setText(point);
		field[22][25].setText(point);
		field[21][25].setText(point);
		field[20][25].setText(point);
		field[20][24].setText(point);
		field[20][23].setText(point);
		field[21][23].setText(point);
		field[22][23].setText(point);
		field[23][23].setText(point);
		field[24][23].setText(point);
		field[25][23].setText(point);
		field[26][23].setText(point);
		field[26][22].setText(point);
		field[26][21].setText(point);
		field[26][20].setText(point);
		field[25][20].setText(point);
		field[24][20].setText(point);
		field[23][20].setText(point);
		field[22][20].setText(point);
		field[21][20].setText(point);
		field[20][20].setText(point);
		field[19][20].setText(point);
		field[18][20].setText(point);
		field[17][20].setText(point);
		field[16][20].setText(point);
		field[15][20].setText(point);
		field[14][19].setText(point);
		field[14][18].setText(point);
		field[14][17].setText(point);
		field[14][16].setText(point);
		field[14][15].setText(point);
		field[14][14].setText(point);
		field[14][13].setText(point);
		field[14][12].setText(point);
		field[14][11].setText(point);
		field[15][11].setText(point);
		field[16][11].setText(point);
		field[17][11].setText(point);
		field[18][11].setText(point);
		field[19][11].setText(point);
		field[19][10].setText(point);
		field[19][9].setText(point);
		field[19][8].setText(point);
		field[19][7].setText(point);
		field[19][6].setText(point);
		field[20][6].setText(point);
		field[21][6].setText(point);
		field[22][6].setText(point);
		field[23][6].setText(point);
		field[24][6].setText(point);
		field[25][6].setText(point);
		field[25][7].setText(point);
		field[25][8].setText(point);
		field[25][9].setText(point);
		field[25][10].setText(point);
		field[25][11].setText(point);
		field[25][12].setText(point);
		field[25][13].setText(point);
		field[24][13].setText(point);
		field[23][13].setText(point);
		field[23][14].setText(point);
		field[23][15].setText(point);
		field[23][16].setText(point);
		field[23][17].setText(point);
		field[22][17].setText(point);
		field[21][17].setText(point);
		field[20][17].setText(point);
		field[19][17].setText(point);
		field[18][17].setText(point);
		field[17][17].setText(point);
		field[17][18].setText(point);
		field[19][16].setText(point);
		field[19][15].setText(point);
		field[19][14].setText(point);
		field[19][13].setText(point);
		field[18][13].setText(point);
		field[17][13].setText(point);
		field[20][13].setText(point);
		field[13][13].setText(point);
		field[12][13].setText(point);
		field[11][13].setText(point);
		field[10][13].setText(point);
		field[9][13].setText(point);
		field[8][13].setText(point);
		field[7][13].setText(point);
		field[6][13].setText(point);
		field[5][13].setText(point);
		field[4][13].setText(point);
		field[4][12].setText(point);
		field[4][11].setText(point);
		field[4][10].setText(point);
		field[4][9].setText(point);
		field[4][8].setText(point);
		field[4][7].setText(point);
		field[4][6].setText(point);
		field[4][5].setText(point);
		field[4][4].setText(point);
		field[3][4].setText(point);
		field[2][4].setText(point);
		field[1][4].setText(point);
		field[1][5].setText(point);
		field[1][6].setText(point);
		field[1][7].setText(point);
		field[1][8].setText(point);
		field[1][9].setText(point);
		field[1][10].setText(point);
		field[1][11].setText(point);
		field[1][12].setText(point);
		field[1][13].setText(point);
		field[1][14].setText(point);
		field[1][15].setText(point);
		field[1][16].setText(point);
		field[1][17].setText(point);
		field[1][18].setText(point);
		field[1][19].setText(point);
		field[1][20].setText(point);
		field[1][21].setText(point);
		field[1][22].setText(point);
		field[1][23].setText(point);
		field[1][24].setText(point);
		field[1][25].setText(point);
		field[2][25].setText(point);
		field[3][25].setText(point);
		field[4][25].setText(point);
		field[5][25].setText(point);
		field[6][25].setText(point);
		field[7][25].setText(point);
		field[8][25].setText(point);
		field[9][25].setText(point);
		field[10][25].setText(point);
		field[10][24].setText(point);
		field[10][23].setText(point);
		field[10][22].setText(point);
		field[10][21].setText(point);
		field[9][21].setText(point);
		field[8][21].setText(point);
		field[7][21].setText(point);
		field[6][21].setText(point);
		field[6][20].setText(point);
		field[6][19].setText(point);
		field[6][18].setText(point);
		field[6][17].setText(point);
		field[6][16].setText(point);
		field[6][15].setText(point);
		field[7][15].setText(point);
		field[8][15].setText(point);
		field[9][15].setText(point);
		field[9][16].setText(point);
		field[9][17].setText(point);
		field[9][18].setText(point);
		field[9][19].setText(point);
		field[10][17].setText(point);
		field[11][17].setText(point);
		field[12][17].setText(point);
		field[12][16].setText(point);
		field[12][15].setText(point);
		field[12][18].setText(point);
		field[12][19].setText(point);
		field[12][20].setText(point);
		field[12][21].setText(point);
		field[12][22].setText(point);
		field[12][23].setText(point);
		field[13][22].setText(point);
		field[14][22].setText(point);
		field[15][22].setText(point);
		field[16][22].setText(point);
		field[17][22].setText(point);
		field[17][23].setText(point);
		field[17][24].setText(point);
		field[17][25].setText(point);
		field[17][26].setText(point);
		field[17][27].setText(point);
		field[17][28].setText(point);
		field[16][27].setText(point);
		field[15][27].setText(point);
		field[14][27].setText(point);
		field[14][28].setText(point);
		field[14][26].setText(point);
		field[14][25].setText(point);
		field[13][25].setText(point);
		field[12][25].setText(point);
		field[12][26].setText(point);
		field[12][27].setText(point);
		field[12][28].setText(point);
		field[11][28].setText(point);
		field[10][28].setText(point);
		field[9][28].setText(point);
		field[8][28].setText(point);
		field[8][27].setText(point);
		field[7][27].setText(point);
		field[6][27].setText(point);
		field[5][27].setText(point);
		field[4][27].setText(point);
		field[3][27].setText(point);
		field[2][27].setText(point);
		field[5][28].setText(point);
		field[22][26].setText(point);
		field[22][27].setText(point);
		field[23][27].setText(point);
		field[24][27].setText(point);
		field[25][27].setText(point);
		field[25][28].setText(point);
		field[26][28].setText(point);
		field[27][28].setText(point);
		field[28][28].setText(point);
		field[28][27].setText(point);
		field[11][12].setText(point);
		field[11][11].setText(point);
		field[20][9].setText(point);
		field[21][9].setText(point);
		field[22][9].setText(point);
		field[23][9].setText(point);
		field[22][10].setText(point);
		field[22][11].setText(point);
		field[23][8].setText(point);
		field[21][1].setText(point);
		field[21][2].setText(point);
		field[22][1].setText(point);
		field[7][11].setText(point);
		field[7][12].setText(point);
		field[22][14].setText(point);
		field[24][16].setText(point);
		field[25][16].setText(point);
		field[21][18].setText(point);
		field[14][20].setText(point);
		field[5][15].setText(point);
		field[4][15].setText(point);
		field[3][15].setText(point);
		field[3][16].setText(point);
		field[3][17].setText(point);
		field[3][18].setText(point);
		field[4][18].setText(point);
		field[4][19].setText(point);
		field[4][20].setText(point);
		field[4][21].setText(point);
		field[3][21].setText(point);
		field[3][22].setText(point);
		field[3][23].setText(point);
		field[4][23].setText(point);
		field[5][23].setText(point);
		field[6][23].setText(point);
		field[7][23].setText(point);
		field[9][7].setText(point);
		field[10][7].setText(point);
		field[11][7].setText(point);
		field[13][7].setText(point);
		field[14][7].setText(point);
		field[9][3].setText(point);
		field[10][3].setText(point);
		field[11][3].setText(point);
		field[12][3].setText(point);
		field[13][3].setText(point);
		field[14][3].setText(point);
		field[5][3].setText(point);
		field[5][4].setText(point);
		field[5][7].setText(point);
		field[5][9].setText(point);
		field[6][11].setText(point);
		field[8][11].setText(point);
		field[9][11].setText(point);
		field[18][6].setText(point);
		field[18][9].setText(point);
		field[19][5].setText(point);
		field[21][5].setText(point);
		field[25][5].setText(point);
		field[26][1].setText(point);
		field[27][7].setText(point);
		field[26][9].setText(point);
		field[27][12].setText(point);
		field[27][15].setText(point);
		field[25][18].setText(point);
		field[26][18].setText(point);
		field[27][18].setText(point);
		field[15][15].setText(point);
		field[16][15].setText(point);
		field[17][15].setText(point);
		field[21][21].setText(point);
		field[24][21].setText(point);
		field[18][23].setText(point);
		field[18][27].setText(point);
		field[19][27].setText(point);
		field[20][27].setText(point);
		field[20][28].setText(point);
		field[16][24].setText(point);
		field[1][3].setText(point);
		field[3][3].setText(point);
		field[2][6].setText(point);
		field[3][8].setText(point);
		field[2][11].setText(point);
		field[9][23].setText(point);
		field[1][28].setText(point);
		field[2][28].setText(point);
		
		
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j].getText().equals(hash)) {
					field[i][j].setBackground(background);
				}
			}
		}
		
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j].getText().equals(point)) {
					field[i][j].setBackground(path);
					field[i][j].setForeground(path);
				}
			}
		}
		
		field[x][y].setText(plus);
		field[x][y].setBackground(player);
		field[x][y].setForeground(path);
		field[A-A/2-A/3][A-1].setText(point);
		field[A-A/2-A/3][A-1].setBackground(path);
		field[A-A/2-A/3][A-1].setForeground(path);
		
		
		setSize(dimensions,dimensions);
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
			if (e.getKeyCode() == KeyEvent.VK_RIGHT && y<(A-1) && !field[x][y+1].getText().equals(hash)) {
				field[x][y+1].setText(plus);
				field[x][y+1].setBackground(player);
				field[x][y].setText(point);
				field[x][y].setBackground(path);
				y++;
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT && y>0 && !field[x][y-1].getText().equals(hash)) {
				field[x][y-1].setText(plus);
				field[x][y-1].setBackground(player);
				field[x][y].setText(point);
				field[x][y].setBackground(path);
				y--;
			}
			if (e.getKeyCode() == KeyEvent.VK_UP && x>0 && !field[x-1][y].getText().equals(hash)) {
				field[x-1][y].setText(plus);
				field[x-1][y].setBackground(player);
				field[x][y].setText(point);
				field[x][y].setBackground(path);
				x--;
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN && x<(A-1) && !field[x+1][y].getText().equals(hash)) {
				field[x+1][y].setText(plus);
				field[x+1][y].setBackground(player);
				field[x][y].setText(point);
				field[x][y].setBackground(path);
				x++;
			}
			
			if (field[A-A/2-A/3][A-1].getBackground().equals(player)) {
				stop = System.currentTimeMillis();
				long time = stop-start;
				int result = (int)(time/1000);
				if (result < 40) {
					JOptionPane.showMessageDialog(null, "Great!! \nTime: " + result + " seconds.");
				} else if (result > 40 && result < 60) {
					JOptionPane.showMessageDialog(null, "Not Bad. \nTime: " + result + " seconds.");
				} else if (result > 60) {
					JOptionPane.showMessageDialog(null, "Sloooow. \nTime: " + result + " seconds.");
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}
	}
	

	public static void main(String[] args) {
		new Main2();
	}

}
