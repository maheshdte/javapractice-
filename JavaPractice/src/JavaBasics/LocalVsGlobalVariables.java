package JavaBasics;

public class LocalVsGlobalVariables {
	
	//Global Variables or Class Variables
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10; //local variable for main method
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		//if we give only name instead of obj.name then we will get error as its global variable
		//We need to create an object for the class, here obj is an class reference
		//the copy of global variables and static methods are stored/accessed via object
		System.out.println(obj.age);
		
	}
	
	public void sum() {
		int i = 15;//local variable for sum method
		int j = 20;
		
	}

}
