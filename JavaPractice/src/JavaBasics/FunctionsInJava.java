package JavaBasics;

public class FunctionsInJava {
   //main method is void as it will never return a value 
	public static void main(String[] args) {
	//if we execute this main method without creating an object then the output will be empty
	//as it is not referencing any object
		FunctionsInJava obj = new FunctionsInJava();
		//new FunctionsInJava is the object we are creating
		//one object will be created, obj is the reference variable, referring to this object
		//after creating this object, the copy of all non static methods will be given to this object
		//It is compulsory to create an object to call non static methods
		obj.test();
		int l = obj.pqr();//obj.pqr will return 30 so we need to store this value in a variable
		System.out.println(l);
		String m = obj.qa();
		System.out.println(m);
		int n = obj.division(20,10);
		System.out.println(n);
		

	}
	
	//non static method/functions
	//There are three types of methods
	//1. No input & No Output i.e test method is an example in this scenario
	//2. No input & it returns some output i.e pqr method and qa methods are examples in this scenario
	//3. Some input and some output i.e division method is n example in this scenario
	
	
	//void doesnot return any value
	//return type = void
	public void test() {
		System.out.println("test method");
	}
	
	//return type = int
	public int pqr() {
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	//return type = String
	public String qa() {
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}
	
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		return d;
		
	}
	

}
