package OOPConceptPart1;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		
		String x="100";
		System.out.println(x+20);
		
		//Data Conversion : string to int
		
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//integer,double,charter,boolean
		
		//string to double Conversion 
		String y="12.33";
		double d= Double.parseDouble(y);
		System.out.println(d+10);
		
		//string to boolean
		String k="true";
		boolean b= Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string 
		
		int j=200;
		System.out.println(j+20);
		
		String s =String.valueOf(j);//200
		System.out.println(s+20);		
		 

	}

}
