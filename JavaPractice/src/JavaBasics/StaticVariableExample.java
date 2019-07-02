package JavaBasics;

public class StaticVariableExample {

	public static void main(String[] args) {
		Student s = new Student(1, "Mahesh");
		Student s1 = new Student(2, "Murthy");
		Student s2 = new Student(3, "Kotesh");
		
		s.display();
		s1.display();
		s2.display();
	}
}

	
	 class Student{
		String name;
		int rollnumber;
		static String college = "Friends";
		
	 Student(int r, String n){
		 rollnumber = r;
		 name = n;
		 
	 }
	 
	 public void display() {
		 System.out.println(rollnumber+" "+name+" "+college);
	 }
	}

