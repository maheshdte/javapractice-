package JavaBasics;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
	 String x = "100";
	 System.out.println(x+20);
	 
	 //data conversion: String to int
	 int i = Integer.parseInt(x);
	 System.out.println(i+20);
	 
	 //Integer, Double, Character, Boolean
	 
	 //String to double conversion
	 
	 String y = "12.22";
	 double d = Double.parseDouble(y);
	 System.out.println(d+5);
	 
	 //String to boolean
	  String k = "true";
	  boolean b = Boolean.parseBoolean(k);
	  System.out.println(b);
	  
	  //int to String conversion
	  int j = 200;
	  System.out.println(j+20);
	  String s = String.valueOf(x+20);
	  System.out.println(s+20);
	  
	  String u = "100A";
	  Integer.parseInt(u); //Number format exception as u is not pure numeric value
	 
	 

	}

}
