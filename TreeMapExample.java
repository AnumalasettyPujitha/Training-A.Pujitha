import java.util.Map.Entry;
import java.util.TreeMap;
public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");
	      map.put(102,"Ravi");
	      map.put(104,"Ravi");
	      System.out.println("Before invoking remove() method");  
	      for(Entry<Integer, String> m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	      map.remove(102);      
	      System.out.println("After invoking remove() method");  
	      for(Entry<Integer, String> m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	}

}
