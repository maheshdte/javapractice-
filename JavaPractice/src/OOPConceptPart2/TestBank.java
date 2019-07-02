package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.educationLoan();
		hs.transferMoney();
		
		//dynamic polymorphism
		//child class object can be referrede by parent Interface reference var
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();

	}

}
