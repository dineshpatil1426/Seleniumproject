package AbstractionConcepts;

public class TestBank {

	public static void main(String[] args) {
		
		AbstractHDFCBank obj= new AbstractHDFCBank();
		
		obj.credit();
		obj.Debit();
		obj.loan();
		obj.fund();
		
		AbstractBank ab = new AbstractHDFCBank();
		ab.loan();
		ab.credit();
		ab.Debit();
	

	}

}
