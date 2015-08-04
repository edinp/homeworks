package ba.bitcamp.homework15.task04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Socket client = new Socket("localhost", 5555);
			while (true) {
				File file = new File("src/slika.jpg");
				FileInputStream stream = new FileInputStream(file);
				OutputStream os = client.getOutputStream();

				if (file.exists()) {
					byte[] data = new byte[1024];
					int received;

					while ((received = stream.read(data, 0, data.length)) > 0) {
						os.write(data, 0, received);
						os.flush();
					}
				}
				os.close();
				System.out.println("File sent");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
