package ba.bitcamp.homework15.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client1 {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 7897);
			System.out.println("Connection established");

			String fileAddress = "C:/BITCAMP/inheritance.docx";
			File file = new File(fileAddress);
			if (file.exists()) {
				System.out.println("File exists");
			} else {
				System.out.println("File doesn't exists");
			}

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			writer.write(fileAddress);
			writer.flush();
			System.out.println("Msg sent: " + fileAddress);

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			while (reader.ready()) {
				System.out.println("File found? (1 for Yes, 0 for No): "
						+ reader.readLine());
			}
			writer.close();
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
