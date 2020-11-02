import java.util.ArrayList;
import java.util.Spliterator;
public class SplitIteratorExample {

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
		Spliterator<Integer> split=arr.spliterator();
		System.out.println(split.estimateSize());
		System.out.println(split.getExactSizeIfKnown());
		System.out.println(split.hasCharacteristics(0));
		}

}
