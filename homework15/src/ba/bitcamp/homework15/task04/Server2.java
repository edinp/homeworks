package ba.bitcamp.homework15.task04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class Server2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket server = new ServerSocket(5555);
			while (true) {
				Socket client = server.accept();
				System.out.println("Client connected");

				String name = "src/" + client.getPort() + ".jpg";
				System.out.println("To be saved: " + name);
				File file = new File(name);

				InputStream is = client.getInputStream();
				FileOutputStream stream = new FileOutputStream(file);

				byte[] data = new byte[1024];
				int sent;

				while ((sent = is.read(data, 0, data.length)) > 0) {
					stream.write(data, 0, sent);
					stream.flush();
				}

				System.out.println("File received");
				is.close();
				
				Socket client2 = server.accept();
				File file2 = new File("src/index2.html");
				String html = "";				
				if (file.exists()) {
					BufferedReader reader = new BufferedReader(new FileReader(
							file2));
					while (reader.ready()) {
						html += reader.readLine();
					}
					html += "<p>Check received file: LINK </p>";

					html += "</body></html>";
				}
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client2.getOutputStream()));
				writer.write(html);
				writer.close();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
