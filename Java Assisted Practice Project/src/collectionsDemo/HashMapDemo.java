package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> td = new HashMap<>();
		
		td.put("Karthick", 1234);  
		td.put("pravin", 1234);
		td.put("guna", 5342);
		td.put("rajee", 5345);
		td.put("dhamo", 34324);
		Set set = td.entrySet();
        Iterator itr = set.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		td.remove("dhamo"); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
