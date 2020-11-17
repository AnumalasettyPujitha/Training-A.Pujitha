import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}
public class SerializableExample {

	public static void main(String[] args) throws IOException {
		Student rahul=new Student(1,"Rahul",360);
		FileOutputStream fout=new FileOutputStream("f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(rahul);
		out.close();
		fout.close();
	}

}

