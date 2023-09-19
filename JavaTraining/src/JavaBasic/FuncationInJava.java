package JavaBasic;

public class FuncationInJava {

	public static void main(String[] args) {

		// Create the object of the class
		FuncationInJava obj = new FuncationInJava();
		obj.test();

		int d = obj.sum();
		System.out.println(d);

		String s1 = obj.PQR();
		System.out.println(s1);

		int d2 = obj.div(30, 10);
		System.out.println(d2);

		int d3 = obj.div(50, 5);
		System.out.println(d3);
	}
	
	//1.Can not Create a function inside a function.
	//2.function independent to each other. 
	//3.function are parallel to each other
	//4.Main Method doesn't return any value,hence it is void
	
	// 1. No Input No OutPut
	// void --doesn't Return any Value
	
	public void test(){ // 0 param 
		System.out.println("Test Method");
	}

	public void test(int i) { //one param 
		System.out.println("Test Method 1 param");
	}
	
	public void test(int i,int j) { //Two params 
		System.out.println("Test Method 2 param");
	}
	
	public void test(String a,String b) { //2 params 
		System.out.println("Test Method 2 params with diffrent");
	}
	
	// 2. No Input some output
	// Return type : int
	public int sum() {
		System.out.println("sum Method");

		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public String PQR() {
		System.out.println("PQR Method");
		String s = "Selenium";
		return s;
	}

	// 3. Some input some output:

	public int div(int x, int y) {
		System.out.println("Div method ");
		int z = x / y;
		return z;
	}

	public String SendMail(int p, String q) {
		System.out.println("Send Mail Method");
		String h = p + q;
		return h;
	}
}
