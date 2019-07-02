package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		
		//print
		System.out.println("Contents of linkedlist:" + ll);
		//add first:
		ll.addFirst("Mahesh");
		//add last:
		ll.addLast("Automation");
		System.out.println("contents of linkedlist"+ ll);
		
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0, "Koti");
		System.out.println(ll.get(0));
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("contents of linkedlist"+ ll);
		
		ll.remove(2);
		System.out.println("content of linkedlist:"+ll);
		
		//how to print all the values of linkedlist:
		//for loop
		//advances for loop
		//iterator
		//while loop
		
		System.out.println("Using for loop");
		for(int i = 0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("using advances for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		
		//iterator
		
		System.out.println("Using Iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//While loop
		System.out.println("While loop");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
			
		}
		
		
	}

}
