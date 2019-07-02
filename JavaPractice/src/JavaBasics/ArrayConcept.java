package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// disadvantage of array:
		//1. size is fixed: static array: To overcome this proble, we use collections - dynamic array - Arraylist
		//2. it stores only similar datatypes: to overcome this problem, we use object array.
		
		String ob[][] = new String[2][2];
		ob[0][0] = "A";
		ob[0][1] = "B";
		ob[1][0] = "A1";
		ob[1][1] = "B1";
		
		
		System.out.println(ob.length);//it will print the length of rows in two dimensional array
		System.out.println(ob[0].length);//it will print the length of columns in two dimensional array
		
		for(int x=0; x<ob.length; x++) {
			for(int j=0; j<ob[0].length; j++) {
				System.out.println(ob[x][j]);
			}
		}

	}

}


