package ba.bitcamp.homework14.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerHttp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(9753);
			while (true) {
				Socket client = server.accept();
				File file = new File("src/index.html");
				String html = "";

				if (file.exists()) {
					BufferedReader reader = new BufferedReader(new FileReader(file));
					while (reader.ready()) {
						html += reader.readLine();
					}
					html += "</body></html>";
				}

				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				writer.write(html);
				writer.close();
				client.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
