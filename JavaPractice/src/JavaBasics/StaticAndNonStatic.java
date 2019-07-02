package JavaBasics;

public class StaticAndNonStatic {
	
//global vars: the scope of global vars will be available across all the functions with some conditions i.e static or non-static
	String name = "Tom";//non static global var
	static int age = 25;//static global var

	public static void main(String[] args) {
		
 //how to call static methods and vars?
 //two ways we can call static methods and vars
		//1. direct calling
		sum();
		System.out.println(age);
		//2. calling by classname
		StaticAndNonStatic.sum();
		System.out.println(StaticAndNonStatic.age);
		
 //how to call non static methods and vars?
 // we need to create a object for the class
	StaticAndNonStatic obj = new StaticAndNonStatic();
	obj.sendMail();
	System.out.println(obj.name);
	
 //can I access static methods by using object refernce? yes
	obj.sum();//warning will be given and it is not good practice

	}
	
	public void sendMail() {
		System.out.println("send mail method");
	}
	
	public static void sum() {
		System.out.println("sum method");
	}

}
