package Practice;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello someone is coming to help us with some task so make yourself comfortable";
		
		String s1 = "Hello someone is Coming to help us with some task so make yourself comfortable";
		
		System.out.println(s.charAt(6));
		
		System.out.println(s.indexOf('s'));//1st occurance
		
		System.out.println(s.indexOf('s', s.indexOf('s')+1));
		
		//String Comparision
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		//trim: will remove the before and after space in the string
		
		String test = "    Hello World        ";
		System.out.println(test.trim());
		
		//substring
		
		System.out.println(s.substring(0, 20));
		
		//replace
		
		String s2 = "Hello_World_Test";
		System.out.println(s2.replace("_", " "));

	}

}
