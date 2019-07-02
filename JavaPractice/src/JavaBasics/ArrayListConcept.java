package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		ar.add('M');
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		ar.remove(7);
		
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		//To restric arraylist to a particular datatype
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(110);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");

	}

}
