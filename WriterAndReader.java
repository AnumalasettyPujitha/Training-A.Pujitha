package javafiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class WriterAndReader {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo=new FileOutputStream("F:\\assignments\\jnit");
		Writer writer=new OutputStreamWriter(fo);
		writer.write("This is Writer in java.io.Writer package");
		writer.flush();
		writer.close();
		FileInputStream fi=new FileInputStream("F:\\assignments\\jnit");
		Reader reader=new InputStreamReader(fi);
		int i=reader.read();
		System.out.println(i);
		System.out.println(reader.markSupported());
		while(i!=-1) {
			System.out.print((char)i);
			i=reader.read();
		}
	}
}
//to read a character or a sequence of characters