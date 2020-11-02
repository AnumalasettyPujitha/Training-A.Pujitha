import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);//to add an element to array
		arr.add(20);
		arr.add(30);
		arr.add(15);
		arr.add(15);
		System.out.println(arr);
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.addAll(arr);
		System.out.println(array);//to add all elements from one array to another array
		System.out.println(array.removeIf(n->(n%10)==0));//to remove elements based on condition
		System.out.println(array);
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		array.add(1,20);//to add 20 to the index 2
		System.out.println(array);
		array.set(1, 30);//to replace the element of index 2 to 30
		System.out.println(array);
	}

}
