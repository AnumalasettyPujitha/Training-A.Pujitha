package javafiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
	try {
		FileOutputStream fout = new FileOutputStream("F:\\assignments\\jnit"); 
        ObjectOutputStream oot = new ObjectOutputStream(fout); 
        Character c = 'A'; 
                
        //Write the specified object to the ObjectOutputStream 
        oot.writeObject(c); 
          
        //flushing the stream 
        oot.flush(); 
          
        //closing the stream 
        oot.close(); 
          
        FileInputStream fin = new FileInputStream("F:\\assignments\\jnit"); 
        ObjectInputStream oit = new ObjectInputStream(fin); 
        System.out.print(oit.readObject());
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
/*convert java objects to streams*/