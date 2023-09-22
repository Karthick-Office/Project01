package collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> city = new ArrayList<>();
		city.add("Salem");
		city.add("Karur");
		city.add(2, "Chennai");  
		city.add("Mumbai");
     	System.out.println(city.size()); 
		
		for(String t: city)
		{
			System.out.println(t);
		}
		
		System.out.println(city.get(2));
		
		
		
		
		
		
		
		

	}

}
