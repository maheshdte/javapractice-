package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//static polymorphism or compile time polymorphism
		//static polymorphism can be achieved with method overriding
		
		Suzuki s = new Suzuki();
		s.start();
		s.stop();
		s.theftsafety();
		System.out.println("****************");
		Car c = new Car();
		c.start();
		c.stop();
  System.out.println("********************");
  //top casting -- dynamic polymorphism i,e child class object can be referenced by parent class reference variable
  Car c1 = new Suzuki(); //child class object can be referred by parent class reference variable 
                         // i.e dynamic polymorphism or run time polymorphism
  c1.start(); //it will call overridden method
              // we cannot call the methods available only in child class
  c1.stop();
  
  //down casting -- is possible but it will give us classcast exception
  
  Suzuki s1 = (Suzuki)new Car();//ClassCastExcption
  //parent class object cannot be referenced by child class reference variable
  
	}
	

}
