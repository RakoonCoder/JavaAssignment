package Assignment_3;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Q8 {

	public static void main(String[] args) {
		
		//File-fast environment
		
		/*Map<String, Integer> map= new HashMap<String, Integer>();
		  map.put("AAA", 1);
		  map.put("BBB", 2);
		  map.put("CCC", 3);
     
		  Iterator i= map.entrySet().iterator();
		  
		  while(i.hasNext()){
			  Map.Entry<String, Integer> pair=(Map.Entry<String, Integer>)i.next();
			  System.out.println(pair.getKey()+ " "+ pair.getValue());
			  
			  map.put("DDD", 4);
			  }*/
		
		//File- Safe Environment
		
		ConcurrentHashMap<String, Integer> map= new ConcurrentHashMap<String, Integer>();
		  map.put("AAA", 1);
		  map.put("BBB", 2);
		  map.put("CCC", 3);
   
		  Iterator i= map.entrySet().iterator();
		  
		  while(i.hasNext()){
			  Map.Entry<String, Integer> pair=(Map.Entry<String, Integer>)i.next();
			  System.out.println(pair.getKey()+ " "+ pair.getValue());
			  
			  map.put("DDD", 4);
		  
		  }  

	}

}
