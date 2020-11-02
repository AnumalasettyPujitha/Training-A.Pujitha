import java.util.ArrayDeque;
public class ArrayDequeueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> deque=new ArrayDeque<String>();  
	    deque.offer("arvind");//to add element
	    deque.offer("vimal");  
	    deque.add("mukul");  
	    deque.offerFirst("jai");//to add element first 
	    System.out.println("After offerFirst Traversal...");  
	    for(String s:deque){  
	        System.out.print(s+" ");  
	    }  
	    //deque.poll();  
	    //deque.pollFirst();//it is same as poll()  
	    deque.pollLast();  
	    System.out.println("After pollLast() Traversal...");  
	    for(String s:deque){  
	        System.out.print(s+" ");  
	    }  
	}

}
