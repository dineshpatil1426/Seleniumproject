package OOPConceptPart2;

public class BMW extends Car {

	
	//When same Method is Present in Parent class as well as Child class with Same Name & Same Numbers of arguments, is called Method Overriding
	
	public void start() { //overriden method
		
		System.out.println("BMW-----start");
	}
	
	public void theftSafety() {
		
		System.out.println("BMW-----theftSafety");
	}
}

