package CollectionDemo;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> cities = new HashSet<>();
		
		cities.add("London");
		cities.add("NewYork");
		cities.add("Paris");
		cities.add("Hyderbad");
		cities.add("Delhi");
		
		for(String t : cities)
		{
			System.out.println(t);
		}
		
		System.out.println(cities.size());
		
		System.out.println(cities.contains("Tokyo"));

		
		
		
		
		
	}
	

}
