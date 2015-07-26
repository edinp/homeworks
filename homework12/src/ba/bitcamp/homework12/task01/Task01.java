package ba.bitcamp.homework12.task01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Task01 extends JFrame {

	private static final long serialVersionUID = 6183558382810205075L;

	String label = "";
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel files = new JLabel(label);
	JButton open = new JButton("Open");
	JButton save = new JButton("Save");
	JButton delete = new JButton("Delete");
	JTextArea text = new JTextArea(18,33);
	File file;

	public Task01() {

		setSize(400, 400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);

		panel1.add(text);
		text.setSize(400, 400);
		text.setEditable(false);
		panel1.setBorder(BorderFactory.createTitledBorder("List of Files"));

		panel2.setLayout(new FlowLayout());

		panel2.add(open);
		panel2.add(save);
		panel2.add(delete);

		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser open = new JFileChooser("C:/Users/USER/Desktop");
				if (open.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					System.out.println("Opened");
					file = open.getSelectedFile();
					String name = file.getName();
					String ex = "";
					for (int i = name.length() - 1; i > 0; i--) {
						if (name.charAt(i) == '.') {
							break;
						}
						ex=name.charAt(i) + ex;
					}
					label += name+"\n";
					text.setText(label);
					if (ex.equals("mp4")) {
						if (open.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
							open.setLocation(100, 100);
							open.setSelectedFile(file);
						}
					}
					System.out.println(ex);

				}

			}
		});

		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser save = new JFileChooser();
				if (save.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					save.setSelectedFile(file);
				}

			}
		});
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser delete = new JFileChooser();
				if (delete.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					file = delete.getSelectedFile();
					file.delete();
				}
				
			}
		});


		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}


	
	
	
	
	
	public static void main(String[] args) {
		new Task01();

	}

}
