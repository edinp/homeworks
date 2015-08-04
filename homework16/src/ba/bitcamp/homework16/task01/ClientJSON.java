package ba.bitcamp.homework16.task01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import org.codehaus.jackson.map.ObjectMapper;

public class ClientJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket client = new Socket("localhost", 9999);
			InputStream is = client.getInputStream();
			
			ObjectMapper mapper = new ObjectMapper();
			BitResponse message = mapper.readValue(is, BitResponse.class);
			System.out.println(message);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
