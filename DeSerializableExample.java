import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("f.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Object o=in.readObject();
		Student rahul=(Student)o;
		System.out.println(rahul.id+" "+rahul.name+" "+rahul.marks);
		in.close();
		fin.close();
	}

}
