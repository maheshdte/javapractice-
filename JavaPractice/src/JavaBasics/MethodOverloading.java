package JavaBasics;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
		
	}
	
	//Method overloading - When the method name is same with different arguments/input parameters within the same class
	//We cannot create a method inside a method
	//duplicate methods i.e same method name with same number of arguments are not allowed within the same class
	//we can overload main method also
	//same method name with same number of arguments and different data types are allowed
	public void sum() {
		System.out.println("Sum method ---- zero parameters");
	}
	public void sum(int i) {
		System.out.println("Sum method ---- one parameter");
		System.out.println(i);
	}
	
	public void sum(int j, int k) {
		System.out.println("Sum method ---- two parameters");
		System.out.println(j+k);
	}
	

}
