package Phase1;
	
import java.util.*;

public class MapDemo {
	
	public static void main(String[] args) {
		//map
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"joshna");
		hm.put(2,"joshnasree");
		hm.put(3,"vennela");
		
		System.out.println("\nThe elements of Hashmap are");
		for(Map.Entry m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//HashTable
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(4,"prerana");
		ht.put(5,"prerani");
		ht.put(6,"chirashvi");
		ht.put(7,"chirashvika");
		
		System.out.println("\nThe elements of HashTable are");
		for(Map.Entry n:ht.entrySet()) {
		System.out.println(n.getKey()+" "+n.getValue());
		}
		
		//TreeMap
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(30,"harry");
		map.put(60,"hermoine");
		map.put(90,"ron");
		
		System.out.println("\nThe elements of TreeMap are");
		for(Map.Entry l:map.entrySet()) {
		System.out.println(l.getKey()+" "+l.getValue());
	    }
   }
}