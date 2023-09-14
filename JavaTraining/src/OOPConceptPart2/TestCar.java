package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		
		//Static polymorphism ---compile-time polymorphism
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("****************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("****************");
		
		//Top Cast 
		Car c1 = new BMW(); // dynamic polymorphism --- run time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		

	}

}
