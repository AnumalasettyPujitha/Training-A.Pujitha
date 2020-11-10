package javafiles;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fi=new FileInputStream("F:\\assignments\\jnit");
			BufferedInputStream bfi=new BufferedInputStream(fi);
			SequenceInputStream sequence=new SequenceInputStream(fi,bfi);
			System.out.println(sequence.available());//returns the number of characters in the stream
			System.out.println(sequence.read());//returns the first character from the stream
			sequence.close();
			bfi.close();
			fi.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
/*used to combine two streams*/