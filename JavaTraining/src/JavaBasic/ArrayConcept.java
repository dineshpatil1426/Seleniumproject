package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
		
			// array : To store similler data type value in a array	variable.
		
			//lowest bound /index 0
			//upper bound /index n-1 (n is size of array)
			//one dim array
		
			//dis-advantage of array
		    //1. size is fixed -- static array
		
		
		
			int i[]= new int[4];
			
			i[0]=10;
			i[1]=20;
			i[2]=30;
			i[3]=40;
			
			System.out.println(i[0]);
			System.out.println(i[3]);
			
			
			System.out.println(i.length); // size length of Array
			
			//Print all the value of array : use  for Loop
			
			for(int j=0;j<i.length;j++) {
				
				System.out.println(i[j]);
			}
			
			
			//2.double Array
			double d[] =new double[3];
			
			d[0]=12.33;
			d[1]=13.55;
			d[2]=45.55;
			
			System.out.println(d[2]);
			
			//3. char Array: 
			
			char c[] = new char[3];
			
			c[0]='a';
			c[1]='1';
			c[2]='$';
			
			//4. boolean  array 
			
			boolean b[] = new boolean[2];
			
			b[0]=true;
			b[1]=false;
			
			//5. string array 
			
			String s[] = new String[3];	
			
			s[0]="Dinesh";
			s[1]="Haribhai";
			s[2]="Patil";
			
			System.out.println(s.length);
			System.out.println(s[2]);
			
			
			//6. object array(object is class)---is used to different data type values
			
			Object ob[] = new Object[6];
			
			ob[0]="Tom";
			ob[1]=25;
			ob[2]=12.33;
			ob[3]="26/07/1988";
			ob[4]='M';
			ob[5]="London";
			 
			System.out.println(ob[5]);
					
			
			
			
			
					
			
			
	}

}
