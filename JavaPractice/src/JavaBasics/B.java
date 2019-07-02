package JavaBasics;

public class B extends A{

	public B() {
		super(10);//super keyword is used to call parent class constructor
		//if we use super keyword then the parameterized constructor will be called
		//if super keyword is called, then default constructor will not be called
		//super keyword should be used in the child class constructor and it should be first statement
		System.out.println("child class const");
	}
	
	public static void main(String args[]) {
		B obj = new B();
		
	}
}
