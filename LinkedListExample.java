import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);//to add element
		ll.addFirst(9);//to add element first
		ll.add(20);
		ll.addLast(24);//to add element last
		ll.add(80);
		ll.add(15);
		ll.add(80);
		System.out.println(ll);
		System.out.println(ll.element());//returns the head element
		System.out.println(ll.pollFirst());//returns the head element
		System.out.println(ll.pollLast());//returns the tail element
		System.out.println(ll.removeFirstOccurrence(80));//returns the first 80
		ll.push(10);//it is used to push element
		System.out.println(ll.pop());//it returns the pop element
		System.out.println(ll.offerFirst(10));//returns the boolean value
		System.out.println(ll.offerLast(20));//returns the boolean value
		System.out.println(ll);

	}

}
