/**
 * 
 */
package com.bezudar.images;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author Abhishek Chavan
 * 
 */
public class ThumbnailCreate {

	public static void main(String[] args) throws IOException {
		BufferedImage img = new BufferedImage(60, 60, BufferedImage.TYPE_INT_RGB);
		img.createGraphics().drawImage(ImageIO.read(new File("1201377061424.jpg")).getScaledInstance(60, 60, Image.SCALE_SMOOTH), 0, 0, null);
		ImageIO.write(img, "jpg", new File("1201377061424_thumb.jpg"));

	}

}
