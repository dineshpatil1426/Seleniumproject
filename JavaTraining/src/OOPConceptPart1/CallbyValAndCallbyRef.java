package OOPConceptPart1;

public class CallbyValAndCallbyRef {

	int p;
	int q;
	
	
	public static void main(String[] args) {
		
		CallbyValAndCallbyRef obj =new CallbyValAndCallbyRef();
		
		int x=10;
		int y=20;
		obj.testsum(x,y); // Call by Value & pass by Value 
		
		 	
		
		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);
		
		//After Swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}
	
	// Call by value 
	public int testsum(int a,int b) {
		int c =a+b;
		return c;	
	}
	
	public void swap(CallbyValAndCallbyRef t) {
		
		int temp;
		
		temp=t.p; //temp =50
		t.p =t.q; //t.p=60 
		t.q =temp; //t.q=50
		
		
	}

}
