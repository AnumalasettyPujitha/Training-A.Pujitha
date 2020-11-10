package javafiles;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.IOException;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo=new FileOutputStream("F:\\assignments\\jnit");
		Writer writer=new OutputStreamWriter(fo);
		PrintWriter pwriter=new PrintWriter(writer);
		pwriter.append('c');
		pwriter.write(67);
		System.out.println(pwriter.checkError());
		pwriter.print(true);
		System.out.println(pwriter);
		pwriter.close();
	}
}
//used to add all types of variables to the stream