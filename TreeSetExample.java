import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(1);//to add an element to the set
		ts.add(3);//to add an element to the set
		ts.add(5);//to add an element to the set
		ts.add(7);//to add an element to the set
		ts.add(2);//to add an element to the set
		ts.add(4);//to add an element to the set
		ts.add(7);//to add an element to the set
		ts.add(0);//to add an element to the set
		System.out.println(ts);//to print the elements exist in the set
		System.out.println("Size of the set is: "+ts.size());//to print the size of the set
		System.out.println(ts.contains(0));//to know the element is present in the set or not
		System.out.println(ts.isEmpty());//it returns boolean value representing set is empty or not
		System.out.println(ts.remove(2));//it returns boolean value representing removing of object
		System.out.println(ts.subSet(2,false,7,true));//it returns the values between the range
		System.out.println(ts.headSet(2,true));//it returns the values till that value
		System.out.println(ts.tailSet(7,true));//it returns the values from that value includes that value
		System.out.println(ts.first());//it returns the starting element of the set
		System.out.println(ts.last());//it returns the ending element of the set
		System.out.println(ts.pollFirst());//it returns the starting element of the set
		System.out.println(ts.pollLast());//it returns the ending element of the set
		System.out.println(ts.lower(3));//it returns the lower value of that given value
		System.out.println(ts.floor(6));//it returns the lower value of the given value
		System.out.println(ts.ceiling(2));//it returns the higher value of the given value
		System.out.println(ts.higher(2));//it returns the higher value of the given value
	}

}
