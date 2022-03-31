package fandamental;

import java.io.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class HelloWorld {
	
	public static void bytesA() throws IOException {
        
	      // read the image from the file
	      BufferedImage image = ImageIO.read(new File("C:/Users/Yashaswi Anand/Desktop/github-icon.png"));
	        
	      // create the object of ByteArrayOutputStream class
	      ByteArrayOutputStream outStreamObj = new ByteArrayOutputStream();
	        
	      // write the image into the object of ByteArrayOutputStream class
	      ImageIO.write(image, "jpg", outStreamObj);
	        
	      // create the byte array from image
	      byte [] byteArray = outStreamObj.toByteArray();
	      for(int i: byteArray) {
	    	  System.out.println(i);
	      }
	        
	      // create the object of ByteArrayInputStream class
	      // and initialized it with the byte array.
	      ByteArrayInputStream inStreambj = new ByteArrayInputStream(byteArray);
	        
	      // read image from byte array
	      BufferedImage newImage = ImageIO.read(inStreambj);
	        
	      // write output image
	      ImageIO.write(newImage, "jpg", new File("outputImage.jpg"));
	      System.out.println("Image generated from the byte array.");
	}

	public static void main(String[] args) throws IOException {
		// ctrl + / = is comment the line
       System.out.println("Hello World");
       System.out.print("It is my first");
       System.out.println(" Java code.");
       
       bytesA();
       
	}

}
