package Javainterviews;

public class PrimeNumber {
	
	//2 is Lowest Prime number

	public static boolean isprimeNumber(int num) {
		
		//edge/corner cases:
		if(num<=1) {
			return false;
		}
		
		
		for(int i=2;i<num;i++) {
			if(num % i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void getPrimeNumber(int num) {
		
		for(int i=2;i<=num;i++) {
			if(isprimeNumber(i)) {
				System.out.print(i + " ");
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("2 is Prime Number: "+ isprimeNumber(2));
		System.out.println("2 is Prime Number: "+ isprimeNumber(3));
		System.out.println("10 is Prime Number: "+ isprimeNumber(10));
		System.out.println("17 is Prime Number: "+ isprimeNumber(17));
		
		System.out.println("0 is Prime Number: "+ isprimeNumber(0));
		System.out.println("1 is Prime Number: "+ isprimeNumber(1));
		
		System.out.println("-2 is Prime Number: "+ isprimeNumber(-2));
		System.out.println("-3 is Prime Number: "+ isprimeNumber(-3));
		
		getPrimeNumber(7);
		getPrimeNumber(13);
		getPrimeNumber(20);
		
	}

}
