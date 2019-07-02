package JavaBasics;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();

	}
	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("Test");
		}catch(Exception e) {
			System.out.println("inside catch block");
		}
		finally {//finally code will be called outside try catch block, it will be executed always
			System.out.println("inside finally method");
		}
	}

}
