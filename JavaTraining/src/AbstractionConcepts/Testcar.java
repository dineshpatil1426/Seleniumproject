package AbstractionConcepts;

public class Testcar {

	public static void main(String[] args) {
		
		BMW b= new BMW();
		
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		
		
		Car c=new BMW();
		c.start();
		c.stop();
		c.refuel();
		

	}

}
