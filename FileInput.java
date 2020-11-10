package javafiles;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("F:\\assignments\\jnit");
		int i=fi.read();
		System.out.println(i);//reading first character from the file
		while(i!=-1) {
			System.out.print((char)i);//reading all characters from the file
			i=fi.read();
		}
		fi.close();
	}
}
/*FileInputStream is used to read data from the file*/
