package AbstractionConcepts;

public abstract class AbstractBank {

	// partial abstraction
	// hiding the implementation logic ---is called Abstraction
	// abstraction class can have abstraction methods & non abstraction method.
	//Can not Create object of Abstract classes.

	public abstract void loan(); // abstract method--no Method body

	
	//non abstract method
	public void credit() {
		System.out.println("Bank---Credit");
	}

	public void Debit() {
		System.out.println("Bank---debit");
	}
}
