package Phase1;

import java.util.*;

public class LinkedHashSet {

	public static void main(String[] args) {
		System.out.println("LinkedHashSet");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("apple");
		set.add("banana");
		set.add(null);
		set.add("banana");
		set.add("cherry");
		set.add("almond");
		
		System.out.println("Size: "+set.size());
		System.out.println(set);
		
		System.out.println("Contains "+set.contains("cherry"));
		
		set.remove(null);
		
		System.out.println(set);
		
		//iterate using iterator 
		//iterate using for each Loop
		
	}
}


