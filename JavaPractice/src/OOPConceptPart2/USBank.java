package OOPConceptPart2;

public interface USBank {
	
	int min_balance = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body -- only method prototype
	//in Interface, we can declare the variables, vars are by default static in nature. 
	//vars value will not be changed, its final/constant in nature
	//no static method in Interface
	//no main method in Interface
	//we cannot create the object of Interface
	//Interface is abstract in nature

}
