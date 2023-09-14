package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank {

	//Overrinding Method from USBANK
	public void credit() {
		
		System.out.println("HSBC----Credit");
	}
	public void debit() {
		System.out.println("HSBC----debit");
	}
	public void transferMoney() {
		System.out.println("HSBC------transferMoney");

	}
	
	//seprate Methods of HSBCBank Class 
	public void educationLoan() {
		System.out.println("HSBC------edu Loan");
	}
		
	public void carLoan() {
		System.out.println("HSBC-----car loan");
	}
	
	//Brazill bank method ,Overrinding from BrazilBank
	public void matualFund() {
		System.out.println("HSBC-----MutualFund");
	}
	
	
}
