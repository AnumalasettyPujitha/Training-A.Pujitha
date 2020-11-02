import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Raaju");//to add an element to the set
		hs.add("Raamu");//to add an element to the set
		hs.add("Rama");//to add an element to the set
		hs.add("Raaju");//to add an element to the set
		hs.add("raaju");//to add an element to the set
		hs.add("Ravi");//to add an element to the set
		hs.add("Roja");//to add an element to the set
		hs.add("");//to add an element to the set
		System.out.println(hs);//to print the elements exist in the set
		System.out.println("Size of the set is: "+hs.size());//to print the size of the set
		System.out.println(hs.contains("Ravi"));//to know the element is present in the set or not
		System.out.println(hs.isEmpty());//it returns boolean value representing set is empty or not
		System.out.println(hs.remove("raaju"));//it returns boolean value representing removing of object
		System.out.println(hs.clone());//to return the elements of the object
	}

}
