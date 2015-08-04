package ba.bitcamp.homework15.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	/*
	 * TASK #1 – CHECK IF FILE EXISTS Napraviti jedan server koji za klijenta
	 * provjeraje da li dati file na serverovom raèunaru postoji. Nije potrebno
	 * uraditi GUI za ovaj zadatak. PRIMJER Ukoliko klijent pošalje serveru
	 * String „C:/Users/Neko/Desktop/text.txt“ i ukoliko server IMA taj file u
	 * tom direktoriju onda server odgovara sa 1, a ukoliko taj file ne postoji
	 * onda odgovara sa 0.
	 */

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(7897);
			System.out.println("Server activated");
			Socket client = server.accept();
			System.out.println("Client connected");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			String msg = reader.readLine();
			
			File file = new File(msg);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			if (file.exists()) {
				writer.write("1");
				writer.flush();
				System.out.println("File found");
			} else {
				writer.write("0");
				writer.flush();
				System.out.println("File not found");
			}
			writer.close();
			System.out.println("Connection closed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
