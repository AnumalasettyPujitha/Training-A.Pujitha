package javafiles;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) throws java.io.FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo=new FileOutputStream("F:\\assignments\\jnit");
			fo.write(65);
			fo.write(75);
			fo.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
/*FileOutputStream is used to add data to the file*/
