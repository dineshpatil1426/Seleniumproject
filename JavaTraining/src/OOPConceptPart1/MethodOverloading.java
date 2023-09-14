package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
	}
	
	//we can  overload main Method also.		
	//you can not create a method inside  a method
	//duplicate method---i.e. same method name with same number of  argument are not allowed.
	
	
	//Method Overloading --> when  the method name is Same with different arguments or input parameters within same class. 
	
	public void sum() { //0 input param
		System.out.println("Sum method--Zero parameter");
	}

	public void sum(int i) { //1 input param
		System.out.println("sum method--one input Parameter");
		System.out.println(i);
	}
	
	public void sum(int k,int l) { //2 input param
		System.out.println("sum method--Two input Parameter");
		System.out.println(k+l);
		
	}
}
