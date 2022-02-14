package Phase1;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Hyderabad");
		city.add("Bangalore");
		System.out.println(city);
		
		//creating vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(20);
		vec.addElement(30);
		System.out.println(vec);
		
		//creating linkedlist
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> names = new LinkedList<String>();
		names.add("joshna");
		names.add("sreenivasulu");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		//creating hashset
		System.out.println("\n");
		System.out.println("HashSet");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(300);
		set.add(500);
		System.out.println(set);
		
		//creating linkedhashset
		System.out.println("\n");
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set.add(250);
		set.add(350);
		set.add(450);
		System.out.println(set2);
		}
	}

}
