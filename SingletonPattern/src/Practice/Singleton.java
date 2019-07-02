package Practice;

public class Singleton {

	//In OOP, a singleton class is a class that can have only one object(instance of the class) at a time
	//How to design singleton class:
	//1. make constructor as private
	//2. write a public static method that has return type object of this singleton class(Lazy initialization)
	
	//difference between class and singleton class:
	//for normal class we use constructor whereas for singleton class we use getInstance() method for instantiation. 
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {
		str = "Hey, I am using singleton class pattern";
	}
	
	public static Singleton getInstance() {
		if(singleton_instance == null) 
			singleton_instance = new Singleton();
		return singleton_instance;
		
	}
	
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		
		y.str = (y.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);

	}

}
