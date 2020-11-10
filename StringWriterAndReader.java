package javafiles;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWriterAndReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringWriter swriter=new StringWriter(10);
		swriter.write("Strings starts with p are ");
		swriter.write("Pen ");
		swriter.write("pencil ");
		swriter.write("paragraph ");
		System.out.println(swriter.getBuffer());
		swriter.close();
		StringReader sreader=new StringReader("Array out of bounds");
		System.out.println(sreader.read());
		sreader.close();
	}

}
//to read and write characters to the stream buffer