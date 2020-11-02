import java.util.LinkedHashSet;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(1);//to add an element to the set
		lhs.add(3);//to add an element to the set
		lhs.add(5);//to add an element to the set
		lhs.add(7);//to add an element to the set
		lhs.add(2);//to add an element to the set
		lhs.add(4);//to add an element to the set
		lhs.add(7);//to add an element to the set
		lhs.add(0);//to add an element to the set
		System.out.println(lhs);//to print the elements exist in the set
		System.out.println("Size of the set is: "+lhs.size());//to print the size of the set
		System.out.println(lhs.contains(8));//to know the element is present in the set or not
		System.out.println(lhs.isEmpty());//it returns boolean value representing set is empty or not
		System.out.println(lhs.remove(2));//it returns boolean value representing removing of object
		System.out.println(lhs.spliterator());//it returns the new object
	}

}
