package JavaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.get(2));
		System.out.println(h.get("A"));
		
		//to restrict to particular datatype
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 100);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(43, "Name");
		
		
		

	}

}
