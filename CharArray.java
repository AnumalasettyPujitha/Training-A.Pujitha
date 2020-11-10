package javafiles;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CharArrayWriter cwriter=new CharArrayWriter(10);
		cwriter.write(10);
		char arr[]= {'a','b','c','d','e','f'};
		cwriter.write(arr);
		System.out.print(cwriter.size());//returns the size of the stream
		System.out.println(cwriter.toString());//converts the stream to string
		CharArrayReader creader=new CharArrayReader(arr);
		System.out.println(creader.read(arr,2,4));//returns the number of characters in the array
	}
}
//used to store sequence of characters and some of the methods are available like strings