import java.util.LinkedHashMap;
public class LinkedhashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();           
	      map.put(100,20);    
	     map.put(101,10);    
	     map.put(102,100);
	     map.put(102,102);
	     map.put(103,102);
	       //Fetching key  
	       System.out.println("Keys: "+map.keySet());  
	       //Fetching value  
	       System.out.println("Values: "+map.values());  
	       //Fetching key-value pair  
	       System.out.println("Key-Value pairs: "+map.entrySet()); 
	}

}
