package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		int a[] = new int[3];//static array disadvantage is size is fixed
		
		//dynamic array -- Array List
		//1. can contain duplicate values
		//2. Maintains insertion order
		//3. It is not synchronized - so it is slow compared to other collections
		//4. allows random access to fetch the element because it stores the values on the basis of indexes
		
		ArrayList ar = new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());//size of arraylist
		
		//to print all the values from arraylist:
		//1. for loop
		//2. using iterator
		for(int i = 0; i < ar.size(); i++)
		{
			System.out.println(ar.get(i));//to get the value from an index
		}
		
		//non generic vs generic:After Java 1.5 generics are introduced
		
		//to add generic i.e specific datatype
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("test");
		
		//Employ class objects:
		Employee e1 = new Employee("Mahesh", 35, "QA");
		Employee e2 = new Employee("Vijay", 50, "QA");
		Employee e3 = new Employee("Mahesh", 40, "Dev");
		
		//create arraylist:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the value:
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		

	}

}
