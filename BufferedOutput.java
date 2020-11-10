package javafiles;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutput {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo=new FileOutputStream("F:\\assignments\\jnit");
			BufferedOutputStream bfo=new BufferedOutputStream(fo);//passing reference of file output stream to buffer reader
			bfo.write("Today class is about files".getBytes());//adding a line to the file
			bfo.close();
			fo.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
/*reading a sequence of characters at a time*/