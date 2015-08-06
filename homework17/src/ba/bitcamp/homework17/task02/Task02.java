package ba.bitcamp.homework17.task02;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Task02 extends JFrame {
	
	public Task02() {
		
	}

	public static void main(String[] args) {
		
		try {
			BufferedImage image = ImageIO.read(new File("src/slika.jpg"));
			
			int width = image.getWidth();
			int height = image.getHeight();
			
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {
					Color c = new Color(image.getRGB(i, j));
					Color a = new Color(255-c.getRed(), 255-c.getGreen(), 255-c.getBlue());
					int col = a.getRGB();
					image.setRGB(i, j, col);
				}
			}
			
			ImageIO.write(image, "jpg", new File("src/render.jpg"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
