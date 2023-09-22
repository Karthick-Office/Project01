package collectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> city = new LinkedList<>();
		
		city.add("Salem");
		city.add("Karur");
		city.add(2, "Chennai");  
		city.add("Mumbai");
		System.out.println(city.size());
		Iterator itr=	city.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
		System.out.println(city.get(1));
	
		System.out.println(city.contains("Salem")); 

	}

}
