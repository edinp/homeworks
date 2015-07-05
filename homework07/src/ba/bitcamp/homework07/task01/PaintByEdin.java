package ba.bitcamp.homework07.task01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PaintByEdin extends JFrame {

	private static final long serialVersionUID = -6687629953404724178L;
	private final int SIZE = 700;
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel1a = new JPanel();
	private JPanel panel1b = new JPanel();
	private JPanel panel1c = new JPanel();
	private Color[] colors = new Color[] { Color.BLACK, Color.BLUE, Color.CYAN,
			Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.MAGENTA,
			Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW };
	private JButton[] buttons = new JButton[colors.length];
	private JSlider red = new JSlider(0, 255, 255);
	private JSlider green = new JSlider(0, 255, 255);
	private JSlider blue = new JSlider(0, 255, 255);

	private JButton plus = new JButton("+");
	private JButton minus = new JButton("-");
	private JLabel status = new JLabel();
	private JPanel selected = new JPanel();
	private JPanel plusminus = new JPanel();
	private int pen = 25;
	private Color color = colors[0];
	private JButton preview = new JButton("Click to select");
	private JButton rect = new JButton("Rect");
	private JButton circle = new JButton("Circle");
	private JButton brush = new JButton("Brush");
	private int rectSize;
	private int diametar;
	private int x;
	private int y;

	
	/**
	 *  Paint by Edin
	 */
	public PaintByEdin() {
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		panel1.setBorder(BorderFactory.createTitledBorder("Pick color"));
		panel2.setBorder(BorderFactory.createTitledBorder("Draw"));
		panel1.setPreferredSize(new Dimension(SIZE, SIZE / 3));
		panel2.setBackground(colors[10]);

		panel1.setLayout(new GridLayout(1, 3));
		panel1.add(panel1a);
		panel1.add(panel1b);
		panel1.add(panel1c);

		panel1a.setLayout(new GridLayout(5, 3));
		for (int i = 0; i < colors.length; i++) {
			buttons[i] = new JButton();
			panel1a.add(buttons[i]);
			buttons[i].setBackground(colors[i]);
			buttons[i].addActionListener(new Action());
		}
		panel1a.add(rect);
		panel1a.add(circle);
		panel1a.add(brush);
		rect.addActionListener(new Action());
		circle.addActionListener(new Action());
		brush.addActionListener(new Action());
		rect.setBorder(BorderFactory.createRaisedBevelBorder());
		circle.setBorder(BorderFactory.createRaisedBevelBorder());
		brush.setBorder(BorderFactory.createLoweredBevelBorder());

		panel1b.setLayout(new BorderLayout());
		panel1b.add(selected, BorderLayout.CENTER);
		panel1b.add(plusminus, BorderLayout.SOUTH);
		selected.setBorder(BorderFactory.createTitledBorder("Selected color"));
		selected.setBackground(color);
		plusminus.setBorder(BorderFactory
				.createTitledBorder("Selected size of brush"));
		plusminus.add(plus);
		plusminus.add(minus);
		plusminus.add(status);
		status.setText("Selected size: " + pen);
		plus.addActionListener(new Action());
		minus.addActionListener(new Action());
		
		
		panel1c.setLayout(new FlowLayout());
		Dimension d = new Dimension();
		panel1c.add(red);
		defineSlider(red, "red", d);
		panel1c.add(green);
		defineSlider(green, "green", d);
		panel1c.add(blue);
		defineSlider(blue, "blue", d);
		panel1c.add(preview);
		preview.setPreferredSize(new Dimension(200,100));
		preview.setBackground(colors[10]);
		preview.addActionListener(new Action());
		panel2.addMouseListener(new Mouse());

		panel2.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				Graphics g = getGraphics();
				g.setColor(color);
				g.fillOval(e.getX(), e.getY()+255, pen, pen);
			}
		});

		setSize(SIZE, SIZE);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < colors.length; i++) {
				if (e.getSource() == buttons[i]) {
					color = colors[i];
					selected.setBackground(color);
				}
			}
			/*
			 * Increases size of brush by 5 pixels
			 * Maximum size of brush is 50 pixels
			 * 
			 */
			if (e.getSource() == plus) {
				pen+=5;
				if (pen > 50) {
					pen = 50;
				}
				status.setText("Selected size: " + pen);
			}
			/*
			 * Decreases size of brush by 5 pixels
			 * Minimum size of brush is 5 pixels
			 */
			if (e.getSource() == minus) {
				pen-=5;
				if (pen < 5) {
					pen = 5;
				}
				status.setText("Selected size: " + pen);
			}
			/*
			 * Selects color set on "preview" button, by changing values on sliders
			 */
			if (e.getSource() == preview) {
				selected.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
				color = new Color(red.getValue(), green.getValue(), blue.getValue());
			}
			/*
			 * Clicking on panel, draws same size rectangle, with size entered in JOptionPane input dialog.
			 */
			if (e.getSource() == rect) {
				rectSize = Integer.parseInt(JOptionPane.showInputDialog("Unesite duzinu stranice kvadrata"));
				diametar = -1;
				pen = -1;
				rect.setBorder(BorderFactory.createLoweredBevelBorder());
				circle.setBorder(BorderFactory.createRaisedBevelBorder());
				brush.setBorder(BorderFactory.createRaisedBevelBorder());
			}
			/*
			 * Clicking on panel, draws circle with size of diametar entered in JOptionPane input dialog.
			 */
			if (e.getSource() == circle) {
				diametar = Integer.parseInt(JOptionPane.showInputDialog("Unesite duzinu precnika kruga"));
				rectSize = -1;
				pen = -1;
				rect.setBorder(BorderFactory.createRaisedBevelBorder());
				circle.setBorder(BorderFactory.createLoweredBevelBorder());
				brush.setBorder(BorderFactory.createRaisedBevelBorder());
			}
			/*
			 * Clicking and moving mouse on panel, draws with preselected brush size 25.
			 */
			if (e.getSource() == brush) {
				pen = 25;
				diametar = -1;
				rectSize = -1;
				rect.setBorder(BorderFactory.createRaisedBevelBorder());
				circle.setBorder(BorderFactory.createRaisedBevelBorder());
				brush.setBorder(BorderFactory.createLoweredBevelBorder());
			}

		}

	}
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getSource() == panel2) {
				Graphics g = getGraphics();
				x = e.getX()-rectSize/2;
				y = e.getY()+SIZE/3;
				g.setColor(color);
				g.drawRect(x, y, rectSize, rectSize);
				g.drawOval(x, y, diametar, diametar);
			}
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
//			rectSize = -1;
//			diametar = -1;
		}
		
	}

	/*
	 * Defines same inputs for all three sliders used for selecting colors for drawing.
	 */
	private void defineSlider(JSlider s, String name, Dimension d) {
		s.setName(name);
		s.setSize(d);
		s.setOrientation(JSlider.HORIZONTAL);
		s.setMinorTickSpacing(25);
		s.setMajorTickSpacing(50);
		s.setPaintTicks(true);

		s.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == red) {
					red.getValue();
					preview.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
				}
				if (e.getSource() == green) {
					green.getValue();
					preview.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
				}
				if (e.getSource() == blue) {
					blue.getValue();
					preview.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
				}

			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintByEdin();
	}

}
