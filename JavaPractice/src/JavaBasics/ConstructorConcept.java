package JavaBasics;

public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("Default Const");
		//not passing anything i.e zero parameter
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single param constructor");
		System.out.println("the value of i " +i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("Single param constructor");
		System.out.println("the value of i " +i);
		System.out.println("the value of j " +j);
	}
	//Constructor overloading
	//Can we overload a constructor? Yes we can
	
	//default constructor is hidden constructor
	//As soon as we create an object the constructor will be called
	
	
	
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();//default constructor of the class will be called
		
	}

}
