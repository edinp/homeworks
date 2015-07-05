package ba.bitcamp.homework06.task04;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Task04 extends JFrame {

	public Task04() {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));
		int choice = JOptionPane.showConfirmDialog(null, "More numbers?");
		int sum = a;

		while (true) {
			if (choice == JOptionPane.YES_OPTION) {
				a = Integer.parseInt(JOptionPane.showInputDialog("Unesi novi broj: "));
				choice = JOptionPane.showConfirmDialog(null, "More numbers?");
				sum += a;
			}
			else if (choice == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Rezultat je: " + sum);
				break;
			}
			else if (choice == JOptionPane.CANCEL_OPTION) {
				System.exit(0);
			}

		}

	}

	public static void main(String[] args) {
		new Task04();

	}

}
