package javafiles;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterAndReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PipedReader preader=new PipedReader();
		PipedWriter pwriter=new PipedWriter(preader);
		pwriter.write(25);
		pwriter.write(30);
		int i=preader.read();
		while(i!=-1) {
			System.out.println(i);
			i=preader.read();
		}
		preader.close();
	}
}
//connection exists between reader and writer