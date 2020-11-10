package javafiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderAndWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo=new FileOutputStream("F:\\assignments\\jnit");
		Writer writer=new OutputStreamWriter(fo);
		BufferedWriter bwriter=new BufferedWriter(writer);
		bwriter.write("This is Writer in java.io.Writer package");
		bwriter.flush();
		bwriter.close();
		FileInputStream fi=new FileInputStream("F:\\assignments\\jnit");
		Reader reader=new InputStreamReader(fi);
		BufferedReader breader=new BufferedReader(reader);
		int i=breader.read();
		System.out.println(i);
		System.out.println(breader.markSupported());
		while(i!=-1) {
			System.out.print((char)i);
			i=breader.read();
	    }
	}
}
//it uses buffer to read write to the object