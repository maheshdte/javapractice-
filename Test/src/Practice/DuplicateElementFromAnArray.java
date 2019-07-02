package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[] = {"Java", "JavaScript", "C", "Angular", "NodeJS", "Java"};
		//1. using for loop
		for(int i=0; i<name.length; i++) {
			for(int j=i+1; j<name.length; j++) {
				if(name[i].equals(name[j])) {
					System.out.println("Duplicate value is:"+ name[i]);
				}
			}
		}
		
		
		//2. using hashset
		
		Set<String> store = new HashSet<String>();
		for(String names: name) {
			if(store.add(names) == false) {
				System.out.println("Duplicate value is:"+ names);
			}
			
		}
		
		System.out.println("Non duplicate array is" + store);
		//3.using hashmap
		
		Map<String, Integer> Mapstore = new HashMap<String, Integer>();
		
		for(String names: name) {
			Integer count = Mapstore.get(names);
			if(count == null) {
				Mapstore.put(names, 1);
			}
			else {
				Mapstore.put(names, ++count);
				}
			
			Set<Entry<String, Integer>> entryset = Mapstore.entrySet();
			for(Entry<String, Integer> entry: entryset) {
				if(entry.getValue()>1) {
					System.out.println("The duplicate element is:"+ entry.getKey());
				}
				
			}
			
			//System.out.println("Non duplicate array is:" + count.);

		}
	}

}
