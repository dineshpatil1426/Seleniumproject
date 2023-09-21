package JavaBasic;

public class ExceptionHandling {

//	int a = 10;
//	static ExceptionHandling obj;

	public static void main(String[] args) {

		// Un caught exception
		//int i=9/0;
		//System.out.println(i);

		// caught exception
		// Thread.sleep(2000);

		//ExceptionHandling obj = null;
		//System.out.println(obj);
		
		//1. try -catch block
		
		try {
			int i=9/0; //this Code will be throw & exception
		} catch(Exception e) {//catch (Throwable e) {  //The Throwable class is the superclass of all errors and exceptions in the Java language
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
	}

}
