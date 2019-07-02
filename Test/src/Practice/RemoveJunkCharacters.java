package Practice;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "@#Test#@$@#$Java#@$@#$Code";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
	}

}
