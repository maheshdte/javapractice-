package OOPConceptPart2;

public class Suzuki extends Car {//has-a relationship

	//When same method is present in parent class as well as child class with same name and same number 
	//of arguments, is called method overriding
	public void start() { //overridden method
		System.out.println("Suzuki start");
	}
	
	public void theftsafety() {
		System.out.println("Suzuki theft safety");
	}
	
}
