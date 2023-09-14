package OOPConceptPart2;

public interface USBank {
	

	int min_bal=100; 	
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	

	//only menthod Declaration 
	//no method body - only menthod prototype
	//in interface, we can declar variables, vars are by default static in nature 
	//vars Value will no be Changed,it's final/constant in nature.
	//no Static method in interface.
	//No Main Method in interface
	// We can not Create the object of interface
	//inteface is abstract in nature.
	
}
