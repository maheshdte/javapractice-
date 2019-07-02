package Practice;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unsing algorithm
		int num = 123456;
		int rev = 0;
		while(num != 0) {
			rev = rev * 10 + num % 10;
			num = num/10;
			
		}
		
		System.out.println(rev);
		
		
		//using StringBuffer
		
		long num1 = 123432;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}
	
	

}
