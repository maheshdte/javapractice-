package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{//we are achieving multiple inheritance
	//Is-a relationship - Interface i.e interface to class, we use implements keyword
	//Has-a relationship - Inheritance i.e class to class relationship, we use extends keyword
	
	//If a class is implementing any Interface, then its mandatory to define/override all the method of Interface.
	//overriding from USBank
	public void transferMoney() {
		System.out.println("Transfer Money");
	}
	
	public void credit() {
		System.out.println("Credit");
	}
	
	public void debit() {
		System.out.println("Debit");
	}
	
	public void educationLoan(){
		System.out.println("Education Loan");
	}
	
	//brazil bank method: overriding from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc--mutual fund");
	}

}
