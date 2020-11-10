package javafiles;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInput {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			FileInputStream fi=new FileInputStream("F:\\assignments\\jnit");
			BufferedInputStream bfi=new BufferedInputStream(fi);
			int i=bfi.read();
			System.out.println(i);//reading first character from the file
			while(i!=-1) {
				System.out.print((char)i);//reading all characters from the file
				i=bfi.read();
			}
		fi.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
/*it is used to read a sequence of characters at a time using buffer*/