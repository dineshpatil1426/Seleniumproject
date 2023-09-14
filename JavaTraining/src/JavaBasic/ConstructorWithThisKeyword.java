package JavaBasic;

public class ConstructorWithThisKeyword {

	
	//Class Var
	String name;
	int age;
	
	public ConstructorWithThisKeyword( String Name,int age) {
		
		this.name =Name;
		this.age=age;
		
		System.out.println(Name);
		System.out.println(age);
		
	}
	
	
	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 30);
		

	}

}
