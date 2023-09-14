package OOPConceptPart1;

public class StaticAndNonStaticConcept {
		
	//global vars : the scope of global vars will be available 	across all  the function with some conditions.
	
	String name = "tom"; //non-static global var
	static	int age =25; //static global var
	
	
	
	public static void main(String[] args) {
		//how to call Static Method & var.
		//1.direct calling:
		sum();
		//2.Calling by Class name
		StaticAndNonStaticConcept.sum();
		
		//How to call Static var 
		//1.direct calling 
		System.out.println(age);
		//2.calling by Class name 
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non-static method & var.
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// can i access static methods by using object reference? yes
		obj.sum(); //warning will be given
		
	}
	
	public void sendMail() { //non-static method
		System.out.println("send Mail Method");
		
	}

	public static void sum() { //static method
		System.out.println("sum Method");
	}
}
