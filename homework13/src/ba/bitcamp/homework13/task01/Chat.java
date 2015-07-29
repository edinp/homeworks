package ba.bitcamp.homework13.task01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chat extends JFrame {

	private JPanel panel = new JPanel();
	private JTextField field = new JTextField(30);
	private JTextArea area = new JTextArea(10, 30);
	private JButton send = new JButton("Send");

	public Chat() {

		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(area);
		panel.add(field);
		panel.add(send);
		area.setEditable(false);

		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					Socket client = new Socket("localhost", 5823);
					BufferedReader reader = new BufferedReader(new FileReader("src/day52/chat.txt"));
					String talk = "";
					while (reader.ready()) {
						talk+=reader.readLine() + "\n";
					}
					talk+="CLIENT: " + field.getText();
					area.setText(talk);
					BufferedWriter writer = new BufferedWriter(new FileWriter("src/day52/chat.txt"));
					writer.write(talk);
					writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		setSize(400, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Chat();
	}

}
