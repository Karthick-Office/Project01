package collectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
	HashSet<String> city = new HashSet<>();
	city.add("Salem");
	city.add("Karur");
	city.add("Mumbai");

		for (String t: city)
		{
			System.out.println(t);
		}
		System.out.println(city.size());
		System.out.println(city.contains("Salem"));
		Iterator itr = city.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
