package OOPConceptPart1;

public class FuncationsInJava {

	public static void main(String[] args) {
		
		FuncationsInJava obj = new FuncationsInJava();
		
		obj.test();
		int l= obj.pqr();
		System.out.println(l);
		
		String s1= obj.qa();
		System.out.println(s1);
		
		int div=obj.division(30, 10);
		System.out.println(div);
		
		
	}
	
	// non Static Methods
	
	//Void ---doesn't return any value
	public void test() { //no Input, no output
		
		System.out.println("Test Method");
		
	}

	//return type -->int 
	public int pqr() { //No input,some output
		
		System.out.println("PQR Method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}	
	//return type -->String
	public String qa() { //No input,some output
		
		System.out.println("qa Method");
		String s="selenium";
		
		return s;
	}
	
	//return type -->int
	//x,y --> input parameter/arguments
	public int division(int x, int y) {
		
		System.out.println("division Method");
		int d=x/y;
		
		return d;
	} 
}
