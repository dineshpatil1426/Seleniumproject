package OOPConceptPart1;

public class LocalVsGlobalVairable {
	
	//Global Variable- Class Variable
	String name="Tom";
	int age =25;
	
	
	public static void main(String[] args) {
		
		int i=10;  //Local Variable for Main Method
		LocalVsGlobalVairable obj = new LocalVsGlobalVairable();
		System.out.println(i);
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.sum();
		
	}

	public void sum() {
		
		int i=10; //Local variable for Sum method
		int j=20;
		System.out.println(i);
		System.out.println(j);
		
	}
}
