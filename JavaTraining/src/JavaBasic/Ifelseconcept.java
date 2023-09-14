package JavaBasic;

public class Ifelseconcept {

	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		
		if(b>a) {
			System.out.println("b is greather then a");
		}else {
			System.out.println("a is greather then b");
		}
		
		
		//comparison operators
		 // < > <= >= == !=
		
		int c=40;
		int d=50;
		
		if(c==d) {
			System.out.println("c and d is  equal");
				
		}else {
			System.out.println("c and d is not equal");
		}

		//Write a login to find out the highest number
		
		int a1=400;
		int b1=500;
		int c1=300;
		
		//nested if-else
	
		if(a1>b1 & a1>c1) { //false & true =false
			System.out.println("a is the greatest");
		}else if(b1>c1) {
			System.out.println("b is the greatest");
		}else {
			System.out.println("c is the greatest");
		}
		
	}

}
