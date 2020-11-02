import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> vector=new Stack<Integer>();
		vector.push(10);//to add element
		vector.push(9);
		vector.push(20);
		vector.push(24);
		vector.push(80);
		vector.push(15);
		vector.push(80);
		System.out.println(vector);
		System.out.println(vector.pop());//returns the pop element
		System.out.println(vector.empty());//returns the boolean value
		System.out.println(vector.peek());//returns the head element
		System.out.println(vector.search(20));//it is used to search an element
		System.out.println(vector);
	}

}
