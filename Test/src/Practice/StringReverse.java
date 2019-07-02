package Practice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. using for loop
		String s = "Selenium";
		int len = s.length();
		String rev = "";
		for(int i = len - 1; i>=0; i--) {
			System.out.println(s.charAt(i));
			
		}
		
		//2. using Stringbuffer class
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
		
	}

}
