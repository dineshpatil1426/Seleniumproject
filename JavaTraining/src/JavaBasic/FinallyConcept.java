package JavaBasic;

public class FinallyConcept {

	public static void main(String[] args) {
		
		//test1();
		//test2();
		division();
		
	}
	
	public static void test1() {
		try {
			
			System.out.println("inside test Method");
			throw new RuntimeException("test");
			
		}catch(Exception e){
			System.out.println("insode the catch Block");
		}
		
		finally {
			System.out.println("Inside the Finally Block");
		}
	}
	
	public static void test2() {
		
		try {
			System.out.println("inside test2");
		}
		finally {
			System.out.println("Finally  code  in test2 method");
		}
		
	}

	public static void division() {
		int i=10;
		
		try {
			System.out.println("inside try block");
			int k =i/0;
			
		}catch (ArithmeticException e) {  // nullException 
 			System.out.println("Inside the Catch Block");
			System.out.println("divide zero Error");
		}
		finally {
			
			System.out.println("excute this code even after any exception");
			
		}
		
	}
	
}
